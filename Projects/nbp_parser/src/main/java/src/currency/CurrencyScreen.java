package src.currency;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import src.ScreenInterface;

import java.util.List;

public class CurrencyScreen implements ScreenInterface {
    @Override
    public void start() {
        System.out.println("Witaj, aktualne kursy to:");

        Call<List<ListOfRates>> call = ApiService.apiService().getCurrency();

        call.enqueue(new Callback<List<ListOfRates>>() {
            @Override
            public void onResponse(Call<List<ListOfRates>> call, Response<List<ListOfRates>> response) {
                if (response.isSuccessful()) {
                    if (response.body() != null){
                        showResults(response.body().get(0).getRates());
                    }
                    else {
                        System.out.println(response.errorBody());
                    }
                }
            }

            @Override
            public void onFailure(Call<List<ListOfRates>> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    private void showResults(List<Rate> rates) {
        for (Rate rate : rates) {
            System.out.printf("%.5f\t-\t%s\t-\t%s\n",
                    rate.getMid(),
                    rate.getCode(),
                    rate.getCurrency()
                    );
        }
    }
}
