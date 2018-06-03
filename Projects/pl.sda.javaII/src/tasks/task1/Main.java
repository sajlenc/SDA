package tasks.task1;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
//        method1();
        method2();
    }

    private static void method2() {
        try {
            FileInputStream fileInputStream = new FileInputStream("src/text.txt");
            int znak = fileInputStream.read();
            while (znak != -1) {
                System.out.print((char) znak);
                znak = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void method1() throws IOException {
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream("src/text.txt");
            int znak = fileInputStream.read();
            while (znak != -1) {
                System.out.print((char) znak);
                znak = fileInputStream.read();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileInputStream != null) {
                fileInputStream.close();
            }
        }
    }
}
