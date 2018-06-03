package multithreading.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ThreadList {
    private final Object firstLock = new Object();
    private final Object secondLock = new Object();
    private Random random = new Random();
    private List<Integer> firstList = new ArrayList<>();
    private List<Integer> secondList = new ArrayList<>();

    public void work() {
        Thread thread = new Thread() {
            @Override
            public void run() {
                addToList();
            }
        };
        Thread thread1 = new Thread() {
            @Override
            public void run() {
                addToList();
            }
        };
        long startTime = System.currentTimeMillis();
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long endTime = System.currentTimeMillis();
        System.out.println("Total time: " + (endTime - startTime));
        System.out.println("Size of first list: " + firstList.size());
        System.out.println("Size of second list: " + secondList.size());
        System.out.println("Sum of both lists: " + (secondList.size() + firstList.size()));
    }

    private void addToList() {
        for (int i = 0; i < 1_000; i++) {
            task1();
            task2();
        }
    }

    private void task2() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (secondLock) {
            secondList.add(random.nextInt(100));
        }
    }

    private void task1() {
        try {
            Thread.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        synchronized (firstLock) {
            firstList.add(random.nextInt(100));
        }
    }
}
