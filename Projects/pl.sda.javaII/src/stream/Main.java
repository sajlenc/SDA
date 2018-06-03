package stream;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        List<String> list = new ArrayList<>(Arrays.asList(
                "Czerwiec",
                "Maj",
                "Grudzien",
                "Sierpien",
                "Wrzesien",
                "Listopad"));
        personList.addAll(Arrays.asList(
                new Person("Agnieszka", 29, false),
                new Person("Piotr", 22, true),
                new Person("Piotr", 22, true),
                new Person("Janusz", 12, true),
                new Person("Żaneta", 30, false)));

//        stream(list);
//        stream1(list);
//        stream2(list);
//        stream3(list);
//        stream4(personList);
//        stream5(personList);
//        stream6(personList);
//        stream7(personList);
//        stream8(personList);
//        stream9();
//        stream10();
//        stream11();
//        stream12();
//        stream13();
//        stream14();
//        stream15(personList);
//        stream16(personList);
//        stream17(personList);
//        stream18(personList);
//        stream19();
//        stream20(personList);
//        stream21(personList);
    }

    private static void stream21(List<Person> personList) {
        personList.stream()
                .reduce((p1, p2) -> p1.getAge() > p2.getAge() ? p1 : p2)
                .ifPresent(System.out::println);
    }

    private static void stream20(List<Person> personList) {
        Person newPerson = personList.stream()
                .filter(person -> person.getAge() > 20)
                .findFirst()
                .orElse(null);

        System.out.println(newPerson);
    }

    private static void stream19() {
        Map<String, Integer> map = new TreeMap<>();
        map.put("Kamil", 24);
        map.put("Janusz", 40);
        map.put("Grazyna", 42);
        map.put("Pjoter", 12);

        map.forEach((name, age) -> System.out.printf("Name: %s (age %s)\n", name, age));
    }

    private static void stream18(List<Person> personList) {
        String string = personList.stream()
                .map(person -> String.format("Name: %s (age %s)",
                        person.getName(),
                        person.getAge()))
                .collect(Collectors.joining(", \n"));
        System.out.println(string);
    }

    private static void stream17(List<Person> personList) {
        Set<Person> set = personList.stream()
                .filter(Person::isMale)
                .collect(Collectors.toSet());
        set.forEach(System.out::println);
//        System.out.println(set);
    }

    private static void stream16(List<Person> personList) {
        Map<String, Integer> map = personList.stream()
                .collect(Collectors.toMap(Person::getName, Person::getAge));
        System.out.println(map);
    }

    private static void stream15(List<Person> personList) {
        List<String> names = personList.stream()
                .map(Person::getName)
                .collect(Collectors.toList());
        System.out.println(names);
    }

    private static void stream14() {
        IntStream
                .rangeClosed(1, 50)
                .filter(number -> {
                    if (number % 3 == 0 && number % 5 == 0) {
                        System.out.println("Liczba podzielna przez 3 i 5: " + number);
                        return true;
                    } else {
                        System.out.println("Liczba nie jest podzielna przez 3 i 5: " + number);
                        return false;
                    }
                })
                .count();
    }

    private static void stream13() {
        int result = IntStream
                .rangeClosed(1, 5)
                .max()
                .getAsInt();
        System.out.println(result);
    }

    private static void stream12() {
        boolean result = IntStream
                .rangeClosed(1, 5)
                .anyMatch(number -> number % 2 == 0);
        System.out.println(result);
    }

    private static void stream11() {
        IntStream
                .rangeClosed(1, 5)
                .map(number -> number * number)
                .forEach(System.out::println);
    }

    private static void stream10() {
        IntStream
                .iterate(10, number -> number + 2)
                .limit(10_000)
                .forEach(System.out::println);
    }

    private static void stream9() {
        IntStream.range(5, 10)
                .forEach(System.out::println);
    }

    private static void stream8(List<Person> personList) {
        personList.stream()
                .limit(2)
                .forEach(System.out::println);
    }

    private static void stream7(List<Person> personList) {
        personList.stream()
                .map(Person::getAge)
                .filter(age -> {
                    if (age > 20) {
                        System.out.println("x");
                        return true;
                    } else {
                        System.out.println("y");
                        return false;
                    }
                })
                .forEach(age -> System.out.println(age));
    }

    private static void stream6(List<Person> personList) {
        personList.stream()
                .map(Person::getName)
                .filter(name -> name.length() > 5)
                .forEach(name -> System.out.println(name));
    }

    private static void stream5(List<Person> personList) {
        personList.stream()
                .filter(person -> person.isMale())
                .filter(person -> person.getAge() < 20)
                .forEach(System.out::println);
    }

    private static void stream4(List<Person> personList) {
        personList.stream()
                .filter(person -> person.getAge() <= 21)
                .forEach(System.out::println);
    }

    private static void stream3(List<String> list) {
        list.stream()
                .filter(month -> month.charAt(4) == 'w')
                .forEach(System.out::println);
    }

    private static void stream2(List<String> list) {
        list.stream()
                .filter(month -> month.toLowerCase().contains("l"))
                .forEach(System.out::println);
    }

    private static void stream1(List<String> list) {
        list.stream()
                .filter(month -> month.length() > 5)
                .forEach(System.out::println);
    }

    private static void stream(List<String> list) {
        list.stream()
                .forEach(month -> System.out.print(month + ", "));
    }

}
