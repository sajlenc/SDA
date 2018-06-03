package src.currency;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiService {
    static NbpApi apiService(){
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("http://api.nbp.pl/api/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        NbpApi nbpApi = retrofit.create(NbpApi.class);
        return nbpApi;
    }
}
