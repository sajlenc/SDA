package pl.sda.dp.decorator;

import java.util.ArrayList;
import java.util.List;

public class Launcher {
    public static void main(String[] args) {
        new MyLogger(new DateDecorator()).log("Komunikat z datą");
        new MyLogger().log("Komunikat");

        List<Decorator> allDecorators = new ArrayList<Decorator>();

        allDecorators.add(new DateDecorator());
        allDecorators.add(new DateDecorator());

        new MyLogger(allDecorators).log("Test z kilkoma dekoratorami");
    }
}
