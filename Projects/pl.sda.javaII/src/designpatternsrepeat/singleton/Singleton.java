package designpatternsrepeat.singleton;

public class Singleton {
    private static Singleton instance = null;
    private int counter = 0;

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public int getCounter() {
        return counter;
    }

    private Singleton() {

    }
    public static  Singleton getInstance(){
        if (instance == null){
            instance = new Singleton();
        }
        return instance;
    }
}
