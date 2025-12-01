package Day_04_sorted;

//Reverse sorting

import java.util.Comparator;
import java.util.List;

public class SortedDemo2 {
    public static void main(String[] args) {

        List<Integer> l2 = List.of(1, 3, 5, 8, 2);
        l2.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
