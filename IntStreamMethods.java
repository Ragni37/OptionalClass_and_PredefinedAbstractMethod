package Day_04_Optional;

import java.util.Arrays;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class IntStreamMethods {
    public static void main(String[] args) {

        // range()
        IntStream.range(11, 20).forEach(System.out::println);

        //sum
        int [] arr = {10, 20, 30, 40, 50};
        int sum = Arrays.stream(arr).sum();
        System.out.println("Sum of all the elements are : "+sum);

        //min
        System.out.println("Minimum element is : ");
        IntStream stream = Arrays.stream(arr);
        OptionalInt min = stream.min();
        min.ifPresent(System.out::println);

        //max
        System.out.println("Maximum Element is : ");
        Arrays.stream(arr).max().ifPresent(System.out::println);

        //Average
        System.out.println("Average Value is : ");
        Arrays.stream(arr).average().ifPresent(System.out::println);

        //Count
        long count = Arrays.stream(arr).count();
        System.out.println("Total number of Element : "+count);
    }
}
