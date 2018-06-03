package virtualmachine;

import java.math.BigDecimal;
import java.util.LinkedList;
import java.util.List;

public class HeapCleaning {
    public static List l = new LinkedList<BigDecimal>();

    public static void main(String[] args) {
        for (int i = 0; i < 100_000; i++) {
            for (int j = 0; j < 5_000; j++) {
                BigDecimal bd = new BigDecimal(1.1);
                l.add(bd);
            }
            System.out.print(i + ", ");
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
