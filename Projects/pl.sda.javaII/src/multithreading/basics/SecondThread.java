package multithreading.basics;

public class SecondThread implements Runnable {
    @Override
    public void run() {
        long id = FirstThread.currentThread().getId();
        System.out.println("Run: " + id);
        try {
            FirstThread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish: " + id);

    }
}
