package Day_05_PredefinedMethods;

import java.util.stream.Stream;

public class TakeWhileDemo1 {
    public static void main(String[] args) {

        Stream<Integer> number = Stream.of(10, 11, 9, 13, 2, 1, 100);
        number.takeWhile(n -> n > 9).forEach(System.out::println);

        System.out.println("---------------------");

        number = Stream.of(12, 2, 10, 3, 4, 5, 6, 7, 8, 9);
        number.takeWhile(n -> n % 2 == 0).forEach(System.out::println);

        System.out.println("---------------------");

        number = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        number.takeWhile(n -> n < 9 ).forEach(System.out::println);

        System.out.println("---------------------");

        number = Stream.of(11, 2, 13, 4, 5, 6, 7, 8, 9);
        number.takeWhile(n -> n > 9).forEach(System.out::println);

        System.out.println("---------------------");

        Stream<String> stream = Stream.of("Ravi", "Ankit", "Rohan", "Aman", "Rakesh");
        stream.takeWhile(str -> str.charAt(0)=='R').forEach(System.out::println);
    }
}
