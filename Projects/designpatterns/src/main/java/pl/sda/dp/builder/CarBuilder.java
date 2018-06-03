package pl.sda.dp.builder;

import pl.sda.dp.singleton.Counter;

public class CarBuilder {
    private String model, vin, engine;
    private Counter counter = new Counter();

    public CarBuilder setModel(String model) {
        this.model = model;
        return this;
    }

    public CarBuilder setVin(String vin) {
        this.vin = vin;
        return this;
    }

    public CarBuilder setEngine(String engine) {
        this.engine = engine;
        return this;
    }

    public Car build(){
        counter.inc();
        Counter.getInstance().inc();
        return new Car(model, vin, engine);
    }
}
