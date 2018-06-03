package src.currency;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import src.ScreenInterface;

import java.util.List;
import java.util.Scanner;

public class SelectedRateScreen implements ScreenInterface {
    @Override
    public void start() {
        String currency = getCurrencyFromUser();
        System.out.println("Kursy walut dla: " + currency.toUpperCase());
        Call<SelectedRate> call = ApiService.apiService()
                .getSelectedCurrencyFromLastWeek(currency, 10);
        call.enqueue(new Callback<SelectedRate>() {
            @Override
            public void onResponse(Call<SelectedRate> call, Response<SelectedRate> response) {
                if (response.isSuccessful()) {

                    showResults(response.body().getRates());
                }
            }

            @Override
            public void onFailure(Call<SelectedRate> call, Throwable throwable) {
                throwable.printStackTrace();
            }
        });
    }

    private String getCurrencyFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj walutę: ");
        return scanner.nextLine();
    }

    private void showResults(List<Rate> listRate) {
        for (Rate rate : listRate) {
            System.out.printf("%s\t-\t%s\n", rate.getDate(), rate.getMid());
        }
    }
}
