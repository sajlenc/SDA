package pl.sda.dp.carfactory;

public class RegularProductionLine implements ProductionLine {

    public Engine createEngine() {
        return new NormalEngine();
    }

    public Upholstering createUpholstering() {
        return new PlasticUpholstering();
    }

    boolean isLimitedMode = false;
    public void setLimitedProductionMode(boolean isLimitedOn) {
        this.isLimitedMode = isLimitedOn;
    }

    public boolean isLimitedProductionOn() {
        return isLimitedMode;
    }

}
