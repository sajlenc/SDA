package multithreading.basics;

public class Bank {
    private int balance = 20;

    void launchBank(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    balance += 20;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println("Current balance: " + balance);
                }
            }
        };
        Thread thread1 = new Thread(){
            @Override
            public void run() {
                for (int i = 0; i < 10; i++) {
                    balance -= 40;
                    try {
                        Thread.sleep(500);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
//                    System.out.println("Current balance: " + balance);
                }
            }
        };

        thread.start();
        thread1.start();
        try {
            thread1.join();
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Current balance: " + balance);
    }
}
