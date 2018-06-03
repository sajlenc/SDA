package pl.sda.dp.adapter;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Launcher {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<Integer>();
        set.add(333);
        set.add(3);
//        assert set.iterator().next() == 333;
        System.out.println(set.iterator().next() == 3);

        for (Integer integer : set) {
            System.out.println(integer);
        }
        Iterator<Integer> iterator = set.iterator();
    }
}
