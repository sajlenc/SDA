package pl.sda.dp.carfactory;

public class PremiumProductionLine implements ProductionLine {

    public Engine createEngine() {

        if(isLimitedProductionOn()){

            return new LimitedSuperChargedEngine();

        }else{

            return new SuperChargedEngine();

        }

    }

    public Upholstering createUpholstering() {
        return new PremiumUpholstering();
    }

    public void setLimitedProductionMode(boolean isLimitedOn) {

    }

    public boolean isLimitedProductionOn() {
        return false;
    }

}
