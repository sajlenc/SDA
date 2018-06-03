package pl.sda.dp.singleton;

import pl.sda.dp.builder.Car;
import pl.sda.dp.builder.CarBuilder;

public class Launcher {
    public static void main(String[] args) {

        CarBuilder cb = new CarBuilder()
                .setEngine("0")
                .setModel("123")
                .setVin("2131231");
        Car car = cb.build();
    }
}
