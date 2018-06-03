package api;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

import java.util.List;

public interface Api {
    @GET("location/search/")
    Call<List<City>> getListOfCities(@Query("query") String city);
    @GET("location/{id}")
    Call<CityInfo> getInfoAboutCity(@Path("id") int cityId);
}
