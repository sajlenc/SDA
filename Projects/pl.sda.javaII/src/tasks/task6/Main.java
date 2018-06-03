package tasks.task6;

public class Main {
    public static void main(String[] args) {
        String string = "Text";
        System.out.println(string.hashCode());
        string += " Ala";
        System.out.println(string.hashCode());
        String s = string;
        System.out.println(s.hashCode());
        String ss = "Text";
        System.out.println(ss.hashCode());
        String sss = "Ala ma kota";
        System.out.println(sss.hashCode());
        String ssss = "Ala";
        System.out.println(ssss.hashCode());
        ssss += " ma kota";
        System.out.println(ssss.hashCode());
    }
}
