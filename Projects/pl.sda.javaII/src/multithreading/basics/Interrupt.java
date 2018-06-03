package multithreading.basics;

public class Interrupt extends Thread {
    @Override
    public void run() {
//        oldRunMethod();
        newRunMethod();
    }

    private void newRunMethod() {
        int licznik = 0;
        while (!isInterrupted()) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
                break;
            }
            licznik++;
            System.out.println(licznik);
        }
        System.out.println("Break");

    }

    private void oldRunMethod() {
        for (int i = 0; i < 200; i++) {
            if (isInterrupted()) {
                System.out.println("Ass");
                return;
            }
            System.out.println(i);
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                System.out.println("Interrupted task");
                return;
            }
        }
    }
}


