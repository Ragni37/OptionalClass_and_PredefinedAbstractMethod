package Day_05_PredefinedMethods;

import java.util.Arrays;
import java.util.List;

public class PeekDemo2 {
    public static void main(String[] args) {

        List<Integer> num = Arrays.asList(10, 15, 20, 25, 30);

        List<Integer> result = num.stream()
                .filter(n -> n%2==0)
                .peek(n-> System.out.println("Even Number "+n))
                .map(n-> n*2)
                .peek(n-> System.out.println("Doubled Value : "+n))
                .toList();

        System.out.println("Final Result: "+ result);

    }
}
