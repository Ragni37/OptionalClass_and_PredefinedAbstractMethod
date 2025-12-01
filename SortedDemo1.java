package Day_04_sorted;

import java.util.List;

public class SortedDemo1 {
    public static void main(String[] args) {

        List<Integer> l1 = List.of(5, 2, 8, 1, 3);

        l1.stream().sorted().forEach(System.out::println);
    }
}
