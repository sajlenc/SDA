public class Employee extends Person {
    private int salary;
    private Department department;

    public Employee(String name, int age, int salary, Department department) {
        super(name, age);
        this.salary = salary;
        this.department = department;
    }
}
