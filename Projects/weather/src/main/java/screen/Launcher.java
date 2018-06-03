package screen;

import api.ApiConnector;
import api.City;
import api.CityInfo;
import retrofit2.Response;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        List<City> listOfCities;
        String cityNameFromUser;

        do {
            cityNameFromUser = getCityNameFromUser();
            listOfCities = getListOfCities(cityNameFromUser);
        } while (listOfCities.isEmpty());

        displayListOfCities(listOfCities);
        int chosenIndexFromList = getIndexFromUser(listOfCities.size());
        CityInfo cityInfo = getCityInfo(listOfCities.get(chosenIndexFromList - 1).getId());
        cityInfo.displayInfo();
        cityInfo.generateHTML();
    }

    private static CityInfo getCityInfo(int cityId) {
        try {
            Response<CityInfo> response = ApiConnector.getCallOfCityInfo(cityId).execute();
            if (response != null && response.body() != null){
                return response.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

    private static int getIndexFromUser(int sizeOfList) {
        Scanner scanner = new Scanner(System.in);
        int chosenIndex;
        do {
            System.out.print("Choose option from the given list: ");
            chosenIndex = scanner.nextInt();
        } while (chosenIndex <= 0 || chosenIndex > sizeOfList);
        return chosenIndex;
    }

    private static List<City> getListOfCities(String city) {
//        ApiConnector.getCallOfCities(city).enqueue(getCallback());
        List<City> listOfCities = new ArrayList<>();
        try {
            Response<List<City>> response = ApiConnector.getCallOfCities(city).execute();
            if (response != null && response.body() != null) {
                listOfCities = response.body();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return listOfCities;
    }

//    private static Callback<List<City>> getCallback() {
//        return new Callback<List<City>>() {
//            public void onResponse(Call<List<City>> call, Response<List<City>> response) {
//                if (response.isSuccessful() && response.body() != null) {
//                    displayListOfCities(response.body());
//                }
//            }
//
//            public void onFailure(Call<List<City>> call, Throwable throwable) {
//                throwable.printStackTrace();
//            }
//        };
//    }

    private static void displayListOfCities(List<City> cityList) {
        for (int i = 0; i < cityList.size(); i++) {
            System.out.printf("%s. %s [%s]\n",
                    i + 1,
                    cityList.get(i).getTitle(),
                    cityList.get(i).getId());
        }
    }

    private static String getCityNameFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("City name: ");
        return scanner.nextLine();
    }
}
