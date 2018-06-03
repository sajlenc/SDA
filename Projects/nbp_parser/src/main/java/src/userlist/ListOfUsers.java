package src.userlist;

import src.ScreenInterface;

public class ListOfUsers implements ScreenInterface {

    @Override
    public void start() {
        System.out.println("Wyświetlono listę użytkowników");
        getUsersFromJSONFile();
    }

    private void getUsersFromJSONFile() {
        UserManagment.getUsers().stream()
                .map(user -> String.format("Imie i nazwisko użytkownika:\t %s %s", user.getName(), user.getSurname()))
                .forEach(System.out::println);
    }
}
