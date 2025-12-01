package Day_05_PredefinedMethods;

import java.util.stream.Stream;

public class DropWhileDemo1 {
    public static void main(String[] args) {

        Stream<Integer> number = Stream.of(1, 2, 3, 11, 4, 5, 6, 7, 8, 9, 10);
        number.dropWhile(num -> num<7).forEach(System.out::println);

        System.out.println("-------------------------------");

        number = Stream.of(15, 3, 7, 9, 5, 6, 7, 8, 9, 10);
        number.dropWhile(n -> n>5).forEach(System.out::println);
    }
}
