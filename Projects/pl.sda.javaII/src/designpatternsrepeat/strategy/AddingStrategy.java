package designpatternsrepeat.strategy;

public class AddingStrategy implements Strategy {
    @Override
    public int execute(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    @Override
    public String showResult(int numberOne, int numberTwo) {
        return String.format("%s + %s = %s",
                numberOne,
                numberTwo,
                execute(numberOne,numberTwo));
    }
}
