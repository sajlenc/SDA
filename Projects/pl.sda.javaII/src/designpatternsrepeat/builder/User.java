package designpatternsrepeat.builder;

public class User {
    private String name;
    private String surname;
    private int age;
    private boolean isMale;

    private User(UserBuilder userBuilder) {
        name = userBuilder.name;
        surname = userBuilder.surname;
        age = userBuilder.age;
        isMale = userBuilder.isMale;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", isMale=" + isMale +
                '}';
    }

    public static class UserBuilder {
        private String name;
        private String surname;
        private int age = -1;
        private boolean isMale;

        UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        UserBuilder setSurname(String surname) {
            this.surname = surname;
            return this;
        }

        UserBuilder isMale(boolean isMale) {
            this.isMale = isMale;
            return this;
        }

        User build() {
            return new User(this);
        }
    }
}
