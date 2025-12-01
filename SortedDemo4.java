package Day_04_sorted;

// Sort Array data in descending order

import java.util.Arrays;

public class SortedDemo4 {
    public static void main(String[] args) {

        int [] arr = {10, 56, 90, 15, 78};

        Arrays.stream(arr)
                .boxed()
                .sorted((i1, i2) -> i2.compareTo(i1))
                .forEach(System.out::println);

    }
}
