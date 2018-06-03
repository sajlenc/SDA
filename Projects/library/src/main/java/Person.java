public abstract class Person {
    private String name;
    private int age;
    private static int counter = 0;
    private int id;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.id = counter++;
    }
}
