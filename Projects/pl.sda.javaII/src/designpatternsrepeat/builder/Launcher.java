package designpatternsrepeat.builder;

public class Launcher {
    public static void main(String[] args) {
        User user = new User.UserBuilder()
                .setName("Adam")
                .setAge(12)
                .isMale(true)
                .setSurname("Janusz")
                .build();

        System.out.println(user);
    }
}
