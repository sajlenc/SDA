package pl.sda.dp.decorator;

import java.util.Date;

public class DateDecorator implements Decorator {

    public String prefix() {
        return new Date().toString() + " ";
    }

    @Override
    public String toString() {
        return prefix();
    }
}
