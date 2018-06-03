public class Boss extends Employee {
    private int monthlyBonus;

    public Boss(String name, int age, int salary, Department department, int monthlyBonus) {
        super(name, age, salary, department);
        this.monthlyBonus = monthlyBonus;
    }
}
