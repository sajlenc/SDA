package jsonandgson;

import com.google.common.base.Charsets;
import com.google.common.io.Files;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import org.json.JSONArray;
import org.json.JSONObject;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        List<Person> personList = readFileWithJSON();
//        saveToFileJSON(personList);
        List<Person> personList1 = readFileWithGSON();
        saveToFileWithGSON(personList1);
//        System.out.println(personList1);
    }

    private static void saveToFileWithGSON(List<Person> personList1) {
        Gson gson = new Gson();
        try (Writer writer = new FileWriter("file1.json")) {
            gson.toJson(personList1, writer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static List<Person> readFileWithGSON() {
        List<Person> personList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            JsonReader jsonReader = new JsonReader(new FileReader(new File("people.json")));
            Person personArray [] = gson.fromJson(jsonReader, Person[].class);
            personList.addAll(Arrays.asList(personArray));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return personList;
    }
    private static void saveToFileJSON(List<Person> personList) {
        File file = new File("file.json");
        try(FileOutputStream fileOutputStream = new FileOutputStream(file);
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream)){
            for (Person person : personList) {
                objectOutputStream.writeObject(person.toString());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Person> readFileWithJSON() {
        List<Person> personList = new ArrayList<Person>();
        try {
            String file = Files.asCharSource(new File("people.json"), Charsets.UTF_8).read();
            JSONArray jsonArray = new JSONArray(file);

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);

                Person person = new Person();
                person.setId(jsonObject.getInt("id"));
                person.setFirstName(jsonObject.getString("first_name"));
                person.setLastName(jsonObject.getString("last_name"));
                person.setCountry(jsonObject.getString("country"));
                person.setEmail(jsonObject.getString("email"));
                person.setVip(jsonObject.getBoolean("vip"));

                personList.add(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return personList;

    }
}
