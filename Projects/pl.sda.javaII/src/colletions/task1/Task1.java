package colletions.task1;
/*
*ZAD #1*
Utwórz metodę, która przyjmuje listę liczb (powinna zostać wcześniej wylosowana),
a następnie zwraca mapę, która będzie zawierała dwa klucze (`parzyste` i `nieparzyste`
będące typami wyliczeniowymi).
Na każdej z pozycji ma być lista.  Na pozycji `parzyste` mają być elementy parzyste,
a na pozycji `nieparzyste` elementy nieparzyste.
 */


import java.util.*;
import java.util.stream.Collectors;

public class Task1 {
    public static void main(String[] args) {
        List<Integer> list = fillList(20);
        Map<NumberTypes, List<Integer>> map = convertToMap(list);
        System.out.println(map);
    }

    private static Map<NumberTypes, List<Integer>> convertToMap(List<Integer> list) {
        Map<NumberTypes, List<Integer>> map = new HashMap<>();

        List<Integer> oddList = list.stream()
                .filter(value -> value % 2 != 0)
                .collect(Collectors.toList());

        List<Integer> evenList = list.stream()
                .filter(value -> value % 2 == 0)
                .collect(Collectors.toList());

        map.put(NumberTypes.EVEN, evenList);
        map.put(NumberTypes.ODD, oddList);

        return map;
    }

    private static List<Integer> fillList(int size){
        return fillList(size, 0, 100);
    }

    private static List<Integer> fillList(int size, int min, int max) {
        Random random = new Random();
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            list.add(random.nextInt(max - min) + min);
        }
        return list;
    }
}
