package lombok;

public class Main {
    public static void main(String[] args) {

        Person person = new Person("Kamil", 24, true);
        Person person1 = new Person();

        System.out.println(person.getAge());
        System.out.println(person.getName());
        System.out.println(person);
    }
}
