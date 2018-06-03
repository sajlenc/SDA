package guava;

import com.google.common.base.CaseFormat;
import com.google.common.base.Charsets;
import com.google.common.base.Joiner;
import com.google.common.base.Objects;
import com.google.common.collect.*;
import com.google.common.io.Files;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {
    public static void main(String[] args) {
//        getFile();
//        convertContentFromFileToList();
//        calculateHashcode();
//        convertStringFormat();
//        showThreeParametersTable();
//        createMapWithUniqueValues();
//        mapWithRepetitiveKeys();
//        mapJoiner();
        anotherJoinerTest();
    }

    private static void anotherJoinerTest() {
        String table [] = {"Peter", "Tom", null, "George"};
        String joinedString = Joiner.on(", ").skipNulls().join(table);
        System.out.println(joinedString);

        String joinedString2 = Joiner.on(", ").useForNull(" ☺").join(table);
        System.out.println(joinedString2);
    }

    private static void mapJoiner() {
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Kamil", 2131);
        map.put("Pjotr", 1231);
        map.put("Kat", 1231);
        String joinedMap = Joiner.on(" || ").withKeyValueSeparator(" ☺").join(map);
        System.out.println(joinedMap);
    }

    private static void mapWithRepetitiveKeys() {
        Multimap<String, Integer> multimap = HashMultimap.create();
        multimap.put("Kamil", 21);
        multimap.put("Olek", 11);
        multimap.put("Antek", 51);
        multimap.put("Olek", 51);

        System.out.println(multimap);
        System.out.println(multimap.get("Olek"));
    }

    private static void createMapWithUniqueValues() {
        BiMap<String, Integer> biMap = HashBiMap.create();
        biMap.put("Kamil", 21);
        biMap.put("Olek", 11);
        biMap.put("Antek", 51);
        biMap.put("Antonio", 51);

        System.out.println(biMap);
    }

    private static void showThreeParametersTable() {
        Table<String, Integer, Boolean> myTable = HashBasedTable.create();
        myTable.put("Chris", 300, true);
        myTable.put("Piotr", 122, false);
        myTable.put("Peter", 1233, false);

        Map<Integer, Boolean> chris = myTable.row("Chris");
        System.out.println(chris);
    }

    private static void convertStringFormat() {
        String text = "AlaMaKota";
        String text1 = CaseFormat.UPPER_CAMEL.to(CaseFormat.LOWER_UNDERSCORE, text);
        System.out.println(text);
        System.out.println(text1);
    }

    private static void calculateHashcode() {
        int hashCode = Objects.hashCode("Bla bla", 21, true);
        System.out.println(hashCode);
    }

    private static void convertContentFromFileToList() {
        File file = new File("file.txt");
        try {
            List<String> stringList = Files.readLines(file, Charsets.UTF_8);
            System.out.println(stringList);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void getFile() {
        File file = new File("file.txt");
        try {
            String fileContent = Files.asCharSource(file, Charsets.UTF_8).read();
            System.out.println(fileContent);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
