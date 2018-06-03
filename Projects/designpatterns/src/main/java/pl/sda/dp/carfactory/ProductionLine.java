package pl.sda.dp.carfactory;

public interface ProductionLine {

    Engine createEngine();

    Upholstering createUpholstering();

    void setLimitedProductionMode(boolean isLimitedOn);

    boolean isLimitedProductionOn();

}
