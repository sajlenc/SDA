package pl.sda.dp.carfactory;

public class Launcher {
    public static void main(String[] args) {

        ProductionLine productionLine = LineCreatingDepartment.createLineFactory(1);
        productionLine.setLimitedProductionMode(true);

        Engine engine = productionLine.createEngine();
        System.out.println(engine.getType());

        Upholstering upholstering = productionLine.createUpholstering();
        System.out.println(upholstering.getMaterial());

    }
}
