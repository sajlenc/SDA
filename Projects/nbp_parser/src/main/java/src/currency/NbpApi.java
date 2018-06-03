package src.currency;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface NbpApi {
    @GET("exchangerates/tables/a/?format=json")
    Call<List<ListOfRates>> getCurrency();

    @GET("exchangerates/rates/a/{currency}/last/{amount}/?format=json")
    Call<SelectedRate> getSelectedCurrencyFromLastWeek(@Path("currency") String currency,
                                                       @Path("amount") int amount);

    @GET("exchangerates/tables/b/[date]/")
    Call<List<SelectedDateCurrency>> getSelectedDateCurrency(@Path("date") String date);
}
