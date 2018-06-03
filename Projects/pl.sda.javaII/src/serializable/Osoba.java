package serializable;

import java.io.Serializable;

public class Osoba implements Serializable {
    private String name;
    private int age;

    public Osoba(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Osoba{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
