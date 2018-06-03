package pl.sda;

import com.test.Liczydlo;
import pl.soft.Text;

public class App {
    public static void main(String[] args) {
        Calculate calculate = new Calculate();
        Text text = new Text();
        Liczydlo liczydlo = new Liczydlo();


        System.out.println("To jest " + text.trim("       trim !!       "));
        System.out.println("Hello World!");
        System.out.println("2 + 3 = " + calculate.add(2, 3) + "!!!!!!");
        System.out.println("2 * 4 = " + liczydlo.mnozenie(2, 4));
    }
}
