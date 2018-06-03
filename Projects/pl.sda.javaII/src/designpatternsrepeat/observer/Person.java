package designpatternsrepeat.observer;

public class Person {
    /**
     * Pole w klasie "Person" przetrzymująca nazwe/imie obiektu.
     */
    private String name;
    /**
     * Pole w klasie "Person" przyjmujaca maksymalna temperature obiektu.
     */
    private int maxTemp;

    /**
     * Konstruktor klasy "Person"
     * @param name pierwszy parametr konstruktora "imie"
     * @param maxTemp drugi parametr konstruktora "maxTemp"
     */
    public Person(String name, int maxTemp) {
        this.name = name;
        this.maxTemp = maxTemp;
    }

    public String getName() {
        return name;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void notify(int currentTemp) {
        if (currentTemp > maxTemp){
            System.out.printf("For %s is too hot, and max is: %s\n",
                    getName(),
                    getMaxTemp());
        }
    }
}
