package designpatternsrepeat.strategy;

public interface Strategy {
    int execute(int numberOne, int numberTwo);
    String showResult(int numberOne, int numberTwo);
}
