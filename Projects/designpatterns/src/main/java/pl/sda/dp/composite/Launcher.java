package pl.sda.dp.composite;

public class Launcher {
    public static void main(String[] args) {
        Group g = new Group();
        Square s = new Square();
        s.moveBy(10,10);
        Triangle t = new Triangle();

        g.add(t);
        g.add(s);
    }
}
