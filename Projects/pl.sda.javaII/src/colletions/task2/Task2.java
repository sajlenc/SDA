package colletions.task2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

/*
*ZAD #2*
Utwórz metodę, która przyjmuje `Set` obiektów klasy `Samochod`
(z polami `nazwa` oraz `cena`) a następnie zapisuje całą jego zawartość do
pliku w pewnej uporządkowanej formie (np oddzielone przecinkami lub enterami).

Następnie utwórz drugą metodę, ktora odczytuje zawartość
wcześniej zapisanego pliku i zwraca listę obiektów klasy `Samochod`.

Program powinien być odporny na błędne dane wejściowe i zgłaszać
użytkownikowi odpowiedni komunikat.
 */
public class Task2 {
    public static void main(String[] args) {
        Set<Car> cars = fillSet(5);
        saveToFile(cars);
    }

    private static void saveToFile(Set<Car> cars) {
        File file = new File("File.txt");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static Set<Car> fillSet(int size) {
        Random random = new Random();
        Set<Car> cars = new HashSet<>();
        String[] names = new String[]{"fiat", "porsche", "lamborghini", "bugatti", "bmw"};

        for (int i = 1; i < size; i++) {
            String name = names[random.nextInt(names.length)];
            cars.add(new Car(name, random.nextInt(1000)));
        }
        return cars;
    }
}
