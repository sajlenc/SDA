package designpatternsrepeat.fasade;

import java.util.Scanner;

public class Launcher {
    public static void main(String[] args) {
        Fasade fasade = new Fasade();

        fasade.prepareBuilding();

        System.out.println("Press enter to close the building");
        new Scanner(System.in).nextLine();

        fasade.closeBuilding();
    }
}
