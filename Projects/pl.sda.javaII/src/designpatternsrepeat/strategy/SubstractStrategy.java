package designpatternsrepeat.strategy;

public class SubstractStrategy implements Strategy {
    @Override
    public int execute(int numberOne, int numberTwo) {
        return numberTwo - numberOne;
    }

    @Override
    public String showResult(int numberOne, int numberTwo) {
        return String.format("%s - %s = %s",
                numberOne,
                numberTwo,
                execute(numberOne,numberTwo));
    }
}
