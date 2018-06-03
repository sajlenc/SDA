package pl.sda.dp.builder;

import pl.sda.dp.singleton.Counter;

public class Launcher {
    public static void main(String[] args) {
        CarBuilder cb = new CarBuilder().setVin("321312").setModel("Fiat").setEngine("400KM");
        CarBuilder ncb = new CarBuilder().setVin("321312").setModel("Fiat").setEngine("400KM");
        cb.build();
        ncb.build();

        BusBuilder bs = new BusBuilder();
        BusBuilder bs1 = new BusBuilder();
        bs1.build();
        bs.build();

        System.out.println(Counter.getInstance().getCounter());
    }
}
