package designpatternsrepeat.strategy;

public class Calculator {
    private Strategy strategy;

    void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    int calculate(int numberOne, int numberTwo){
        return strategy.execute(numberOne, numberTwo);
    }
    String showResult(int numberOne, int numberTwo){
        return strategy.showResult(numberOne, numberTwo);
    }
}
