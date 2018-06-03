package multithreading.basics;

public class FirstThread extends java.lang.Thread {
    @Override
    public void run() {
        long id = java.lang.Thread.currentThread().getId();
        System.out.println("Run: " + id);
        try {
            java.lang.Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Finish: " + id);
    }
}
