package pl.sda.tdd8.unit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class CalculatorTest {

    @Test
    void add() {
        Calculator calculator = new Calculator();
        int a = 1;
        int b = 2;

        int c = calculator.add(a, b);
        Assertions.assertSame(3, c);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int c = calculator.subtract(a, b);
        Assertions.assertSame(2, c);
    }

    @Test
    void divide() {
        Calculator calculator = new Calculator();
        int a = 4;
        int b = 2;
        int c = calculator.divide(a, b);
        Assertions.assertSame(2, c);
    }
}