package designpatternsrepeat.singleton;

public class Launcher {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        System.out.println(instance.hashCode());

        instance.setCounter(23);
        System.out.println(instance.getCounter());
    }
}
