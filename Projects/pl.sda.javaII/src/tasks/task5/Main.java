package tasks.task5;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        method();
        method1();
    }

    private static void method1() {
        List<String> strings = new ArrayList<>(Arrays.asList(
                "Piotr", "Katarzyna", "Olek", "Ania"
        ));

        ListIterator<String> listIterator = strings.listIterator();

        while (listIterator.hasNext()){
            String el = listIterator.next();
            System.out.println(el);
        }
        while (listIterator.hasPrevious()){
            String el = listIterator.previous();
            System.out.println(el);
        }
    }

    private static void method() {
        List<String> strings = new ArrayList<>(Arrays.asList(
                "Piotr", "Katarzyna", "Olek", "Ania"
        ));
        Iterator iterator = strings.iterator();
        while (iterator.hasNext()) {
            String el = (String) iterator.next();
            System.out.println(el);
        }

    }
}
