package pl.sda.dp.composite;

import java.util.ArrayList;
import java.util.List;

public class Group {
    int x, y;
    List<Shape> objects;

    public Group() {
        objects = new ArrayList<Shape>();
    }

    void add(Shape shape){
        this.objects.add(shape);
    }

    public int moveBy(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
        for (Shape shape : objects) {
            shape.moveBy(x, y);
        }
    }

    public int getX() {
        return x;
    }

    public Group setX(int x) {
        this.x = x;
        return this;
    }

    public int getY() {
        return y;
    }

    public Group setY(int y) {
        this.y = y;
        return this;
    }
}
