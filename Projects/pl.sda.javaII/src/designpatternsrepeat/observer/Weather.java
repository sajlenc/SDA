package designpatternsrepeat.observer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Weather {
    private List<Person> personList = new ArrayList<>();
    private int currentTemp;

    public void addAll(Person... person) {
        personList.addAll(Arrays.asList(person));
    }

    public void updateCurrentTemp(int currentTemp){
        this.currentTemp = currentTemp;
        System.out.println("Current temperature is: " + currentTemp);
        notifyObservers();
    }
    public void notifyObservers(){
        for (Person person : personList) {
            if (currentTemp >= person.getMaxTemp()){
                person.notify(currentTemp);
            }
        }
    }
}
