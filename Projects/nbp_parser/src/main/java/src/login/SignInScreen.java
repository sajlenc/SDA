package src.login;

import javafx.util.Pair;
import src.ScreenInterface;
import src.menu.Menu;
import src.userlist.UserManagment;

import java.util.List;
import java.util.Scanner;

public class SignInScreen implements ScreenInterface {

    public void start() {
        User loggedUser;
        int triesleft = 3;
        do {
            Pair<String, String> userCredentials = signInField();
            loggedUser = validate(userCredentials);
            if (loggedUser != null) {
                System.out.println("Zostałeś zalogowany!");
            } else {
                triesleft--;
                System.out.println("Błędne dane! Spróbuj ponownie. Pozostało prób: " + triesleft);
            }
        } while (loggedUser == null && triesleft > 0);

        if (loggedUser != null) {
            displayMenu(loggedUser);
        }

    }

    private void displayMenu(User loggedUser) {
        Menu menu = new Menu(loggedUser);
        menu.start();
    }

    private Pair<String, String> signInField() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Zaloguj się do systemu:\nLogin: ");
        String userName = scanner.nextLine();
        System.out.print("Hasło: ");
        String password = scanner.nextLine();

        return new Pair<>(userName, password);
    }

    private User validate(Pair<String, String> userCredentials) {
        List<User> usersList = UserManagment.getUsers();
        for (User user : usersList) {
            if (user.getLogin().equals(userCredentials.getKey())
                    && user.getPassword().equals(userCredentials.getValue())) {
                return user;
            }
        }
        return null;
    }

}
