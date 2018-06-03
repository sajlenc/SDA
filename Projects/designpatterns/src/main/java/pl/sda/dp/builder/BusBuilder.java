package pl.sda.dp.builder;

import pl.sda.dp.singleton.Counter;

public class BusBuilder {
    private String model, vin, engine;
    private Counter counter = new Counter();

    public BusBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public BusBuilder setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public BusBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car build(){
        counter.inc();
        Counter.getInstance().inc();
        return new Car(model, vin, engine);
    }
}
