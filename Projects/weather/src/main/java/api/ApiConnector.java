package api;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.util.List;

public class ApiConnector {
    private static Retrofit retrofit = new Retrofit.Builder()
            .baseUrl("https://www.metaweather.com/api/")
            .addConverterFactory(GsonConverterFactory.create())
            .build();

    private static Api api = retrofit.create(Api.class);

    public static Call<List<City>> getCallOfCities(String cityNameFromUser) {
        return api.getListOfCities(cityNameFromUser);
    }

    public static Call<CityInfo> getCallOfCityInfo(int cityId){
        return api.getInfoAboutCity(cityId);
    }
}
