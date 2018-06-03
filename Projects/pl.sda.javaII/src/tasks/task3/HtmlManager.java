package tasks.task3;

public class HtmlManager implements AutoCloseable {
    private String variable;

    public HtmlManager(String variable) {
        this.variable = variable;
        System.out.printf("<%s>", variable);
    }

    public void work(String text) {
        System.out.print(text);
    }

    @Override
    public void close() {
        System.out.printf("</%s>", variable);
    }
}
