package src.userlist;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.google.gson.stream.JsonReader;
import src.login.User;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class UserManagment {
    public static List<User> getUsers() {
        List<User> usersList = null;
        Gson gson = new Gson();

        try {
            JsonReader jsonReader = new JsonReader(new FileReader("C:\\Projects\\nbp_parser\\src\\main\\" +
                    "java\\src\\credentials.json"));
            usersList = gson.fromJson(jsonReader, new TypeToken<List<User>>() {}.getType());
        } catch (IOException e) {
            e.printStackTrace();
        }

        return usersList;
    }
}
