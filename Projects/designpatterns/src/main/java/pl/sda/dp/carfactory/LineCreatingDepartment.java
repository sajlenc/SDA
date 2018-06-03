package pl.sda.dp.carfactory;

public class LineCreatingDepartment {

    static ProductionLine createLineFactory(int lineType){

        if(lineType == 0){

            return new RegularProductionLine();

        }else if(lineType == 1){

            return new PremiumProductionLine();

        }

        return null;
    }

}
