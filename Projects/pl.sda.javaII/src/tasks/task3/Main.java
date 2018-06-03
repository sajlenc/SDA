package tasks.task3;

public class Main {
    public static void main(String[] args) {
        method();
    }

    private static void method() {
        try (HtmlManager htmlManager = new HtmlManager("html")) {
            htmlManager.work("trolololo");
        }
    }
}
