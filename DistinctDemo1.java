package Day_05_PredefinedMethods;

import java.util.Arrays;

public class DistinctDemo1 {
    public static void main(String[] args) {
        int [] arr = {10, 20, 10, 20, 30, 30, 50, 40};

        Arrays.stream(arr)
                .distinct()
                .sorted()
                .forEach(System.out::println);
    }
}
