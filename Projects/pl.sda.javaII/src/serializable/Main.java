package serializable;

import java.io.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Osoba osoba = new Osoba("Jan", 12);
        Osoba osoba1 = new Osoba("Jan", 12);
        Osoba osoba2 = new Osoba("Jan", 12);
//        saveFile(osoba);

//        List<Osoba> listaOsob = new ArrayList<>(Arrays.asList(osoba,osoba1,osoba2));
//        saveList(listaOsob);

        List<Osoba> listaOsobPoWczytaniu = readList();
        System.out.println(listaOsobPoWczytaniu);

    }

    private static void saveList(List<Osoba> listaOsob) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("plik1.txt"));
            objectOutputStream.writeObject(listaOsob);
            objectOutputStream.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<Osoba> readList() {
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("plik1.txt"));
            return (List<Osoba>) objectInputStream.readObject();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }

    private static void saveFile(Osoba osoba) {
        try {
            ObjectOutputStream objectOutputStream =
                    new ObjectOutputStream(new FileOutputStream("plik.txt"));

            objectOutputStream.writeObject(osoba);
            objectOutputStream.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static Osoba readFile() {
        try {
            ObjectInputStream objectInputStream =
                    new ObjectInputStream(new FileInputStream("plik.txt"));

            return (Osoba) objectInputStream.readObject();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
