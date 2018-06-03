package tasks.task2;

public class ContexManago implements AutoCloseable {

    public ContexManago() {
        System.out.println("Object created");
    }

    public void work() {
        System.out.println("Work in progress");
    }

    @Override
    public void close() {
        System.out.println("Object closed");
    }
}
