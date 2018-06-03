package multithreading.basics;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        threadMethod1();
//        threadMethod2();
//        threadMethod3();
//        threadMethod4();
//        threadMethod5();
//        threadMethod6();
        threadMethod7();
//        bankLauncher();

    }

    private static void threadMethod7() {
        Interrupt interruptTask = new Interrupt();
        interruptTask.start();
        new Scanner(System.in).nextLine();
        interruptTask.interrupt();
    }

    private static void threadMethod6() {
        ThreadList threadList = new ThreadList();
        threadList.work();
    }

    private static void threadMethod5() {
        CounterThread counterThread = new CounterThread();
        counterThread.counterMethod();
    }

    private static void threadMethod4() {
        ThirdThread thirdThread = new ThirdThread();
        thirdThread.threadMethod();
    }

    private static void bankLauncher() {
        Bank bank = new Bank();
        bank.launchBank();
    }

    private static void threadMethod3() {
        FirstThread[] threads = new FirstThread[10];
        for (int i = 0; i < threads.length; i++) {
            threads[i] = new FirstThread();
        }
        for (FirstThread thread : threads) {
            thread.start();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private static void threadMethod2() {
        SecondThread secondThread = new SecondThread();
        Thread thread = new Thread(secondThread);
        thread.start();
    }

    private static void threadMethod1() {
        System.out.println("Główny wątek: " + FirstThread.currentThread().getId());
        FirstThread firstThread = new FirstThread();
        firstThread.start();
    }
}
