package pl.sda.dp.singleton;

public class Counter {
    private int counter;
    static Counter ncounter = null;

    public void inc(){
        counter++;
    }
    public int getCounter(){
        return counter;
    }
    public static Counter getInstance(){
        if (ncounter == null){
            ncounter = new Counter();
        }
        return Counter.ncounter;
    }
}
