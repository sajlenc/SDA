package tasks.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        method();
//        method1();
//        method2();
        method3();
    }

    private static void method3() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Ania", 20),
                new Student("Katarzyna", 12),
                new Student("Andzelika", 20),
                new Student("Andzelika", 10),
                new Student("Andzelika", 28),
                new Student("Tomek", 20)
        ));
        studentList.sort(new AgeComparator());
        System.out.println(studentList);
    }

    private static void method2() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Ania", 20),
                new Student("Katarzyna", 12),
                new Student("Andzelika", 20),
                new Student("Andzelika", 10),
                new Student("Andzelika", 28),
                new Student("Tomek", 20)
        ));
        studentList.sort(new NameComparator());
        System.out.print(studentList);

    }

    private static void method1() {
        List<Student> studentList = new ArrayList<>(Arrays.asList(
                new Student("Ania", 20),
                new Student("Katarzyna", 12),
                new Student("Andzelika", 20),
                new Student("Andzelika", 10),
                new Student("Andzelika", 28),
                new Student("Tomek", 20)
        ));

        studentList.stream()
                .sorted()
                .forEach(System.out::println);
    }

    private static void method() {
        List<Person> personList = new ArrayList<>();
        personList.add(new Person("Piotr", 10));
        personList.add(new Person("Pjoter", 20));
        personList.add(new Person("Stanisław", 20));
        personList.add(new Person("Piuter", 30));
        personList.add(new Person("Piater", 40));

        personList.stream()
                .sorted()
                .forEach(System.out::println);

//        Collections.sort(personList);
//        System.out.println(personList);
    }
}
