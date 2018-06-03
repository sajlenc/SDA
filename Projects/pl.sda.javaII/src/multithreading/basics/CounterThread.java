package multithreading.basics;

public class CounterThread {
    private static final int NUMBER_OF_OPERATIONS = 1_000_000;
    private int counter = 0;
    public void counterMethod(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < NUMBER_OF_OPERATIONS; i++) {
                    increment();
                }
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < NUMBER_OF_OPERATIONS; i++) {
                    decrement();
                }
            }
        };
        thread.start();
        thread1.start();
        try {
            thread.join();
            thread1.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Current number: " + counter);
    }

    private synchronized void decrement() {
        counter--;
    }

    private synchronized void increment() {
        counter++;
    }
}
