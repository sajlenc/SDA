package designpatternsrepeat.strategy;

public class Main{
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        calculator.setStrategy(new AddingStrategy());
//        int result = calculator.calculate(3, 4);
//        System.out.println(result);
        String result = calculator.showResult(3, 4);
        System.out.println(result);


        calculator.setStrategy(new SubstractStrategy());
//        int secondResult = calculator.calculate(7, 5);
//        System.out.println(secondResult);
        String secondResult = calculator.showResult(7, 5);
        System.out.println(secondResult);
    }
}
