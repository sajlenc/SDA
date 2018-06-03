package pl.sda.dp.composite;

public abstract class Shape extends Group {
    @Override
    public int moveBy(int x, int y) {
        setX(getX() + x);
        setY(getY() + y);
        return 0;
    }
}
