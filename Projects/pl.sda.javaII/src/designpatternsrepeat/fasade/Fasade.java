package designpatternsrepeat.fasade;

public class Fasade {
    private Window window = new Window();
    private Light light = new Light();

    void prepareBuilding(){
        window.open();
        light.open();
    }

    void closeBuilding(){
        window.close();
        light.close();
    }
}
