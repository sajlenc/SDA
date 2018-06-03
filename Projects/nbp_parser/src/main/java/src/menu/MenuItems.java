package src.menu;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public enum MenuItems {
    MENU_USERLIST("Wyświetl listę użytkowników"),
    MENU_LASTDAY("Pobierz dane z ostatniego dnia"),
    MENU_SELECTEDDAY("Pobierz dane z wybranego dnia"),
    MENU_CURRENCY("Pobierz dane wybranej waluty (z ostatniego tygodnia)");

    private String message;

}
