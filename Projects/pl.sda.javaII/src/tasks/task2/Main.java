package tasks.task2;

public class Main {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        try (ContexManago contexManago = new ContexManago()) {
            contexManago.work();
        }
    }
}
