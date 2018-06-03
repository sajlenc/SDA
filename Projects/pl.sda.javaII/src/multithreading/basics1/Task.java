package multithreading.basics1;

public class Task implements Runnable {
    private int id;
    public Task(int id) {
        this.id = id;
    }

    @Override
    public void run() {
        System.out.println("Start: " + id);
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Stop:  " + id);
    }
}
