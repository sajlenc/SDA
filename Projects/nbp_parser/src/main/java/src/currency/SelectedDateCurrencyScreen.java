package src.currency;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import src.ScreenInterface;

import java.util.List;
import java.util.Scanner;

public class SelectedDateCurrencyScreen implements ScreenInterface {
    @Override
    public void start() {
        String date = getDateFromUser();
        System.out.println("Kursy z dnia " + date.toUpperCase());
        Call<List<SelectedDateCurrency>> call = ApiService.apiService().getSelectedDateCurrency(date);
        call.enqueue(new Callback<List<SelectedDateCurrency>>() {
            @Override
            public void onResponse(Call<List<SelectedDateCurrency>> call, Response<List<SelectedDateCurrency>> response) {
                if (response.isSuccessful()){
                    showResult(response.body().get(0).getTable());
                }
            }

            @Override
            public void onFailure(Call<List<SelectedDateCurrency>> call, Throwable throwable) {

            }
        });
    }

    private void showResult(String table) {
    }

    private String getDateFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj datę: ");
        return scanner.nextLine();
    }
}
