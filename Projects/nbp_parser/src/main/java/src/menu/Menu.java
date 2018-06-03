package src.menu;

import src.ScreenInterface;
import src.currency.CurrencyScreen;
import src.currency.SelectedDateCurrency;
import src.currency.SelectedRateScreen;
import src.login.User;
import src.userlist.ListOfUsers;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import static src.menu.MenuItems.*;

public class Menu implements ScreenInterface {
    private User user;

    public Menu(User user) {
        this.user = user;
    }

    @Override
    public void start() {
        List<MenuItems> menuItems = getMenu();
        displayMenu(menuItems);
        chooseOption(menuItems);
    }

    private void chooseOption(List<MenuItems> menuItems) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Wybierz opcje: ");
        int chosenOption = scanner.nextInt();

        if (chosenOption <= menuItems.size() && chosenOption > 0){
            switch (menuItems.get(chosenOption - 1)){
                case MENU_LASTDAY:
                    new CurrencyScreen().start();
                    break;
                case MENU_CURRENCY:
                    new SelectedRateScreen().start();
                    break;
                case MENU_USERLIST:
                    new ListOfUsers().start();
                    break;
                case MENU_SELECTEDDAY:
                    new SelectedDateCurrency();
                    break;
            }
        } else {
            chooseOption(menuItems);
        }
    }

    private void displayMenu(List<MenuItems> menuItems) {
        for (int i = 0; i < menuItems.size(); i++) {
            System.out.printf("%s)\t%s\n", i + 1, menuItems.get(i).getMessage());
        }
    }

    private List<MenuItems> getMenu() {
        List<MenuItems> menuItems = new ArrayList<>(Arrays.asList(
                MENU_LASTDAY,
                MENU_SELECTEDDAY,
                MENU_CURRENCY));
        if (user.isAdmin()){
            menuItems.add(0, MENU_USERLIST);
        }
        return menuItems;
    }
}
