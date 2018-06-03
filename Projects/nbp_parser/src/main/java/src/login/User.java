package src.login;

import com.google.gson.annotations.SerializedName;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor

public class User {
    @SerializedName("login")
    private String login;
    @SerializedName("pass")
    private String password;
    @SerializedName("isAdmin")
    private boolean isAdmin;
    @SerializedName("name")
    private String name;
    @SerializedName("surname")
    private String surname;

    @Override
    public String toString() {
        return "\nUser{" +
                "login='" + login + '\'' +
                ",\tpassword='" + password + '\'' +
                ",\tisAdmin=" + isAdmin +
                '}';
    }
}
