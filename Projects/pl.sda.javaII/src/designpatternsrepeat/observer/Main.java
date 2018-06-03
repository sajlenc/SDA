package designpatternsrepeat.observer;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Person person = new Person("Kamil", 10);
        Person person1 = new Person("Jan", 17);
        Person person2 = new Person("Zbyszek", 22);
        Person person3 = new Person("Zdzichu", 17);

        Weather weather = new Weather();
        weather.addAll(person, person1, person2, person3);
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            weather.updateCurrentTemp(scanner.nextInt());
        }
    }
}
