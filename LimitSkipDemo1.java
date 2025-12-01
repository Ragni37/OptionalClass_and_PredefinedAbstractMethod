package Day_05_PredefinedMethods;

import java.util.stream.Stream;

public class LimitSkipDemo1 {
    public static void main(String[] args) {

        Stream<String> s = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina", "Sahwag", "Sachin", "bumrah");
        s.limit(6).forEach(System.out::println);
        System.out.println("--------------------------------------------------------------------");

        Stream<String> s1 = Stream.of("Virat", "Rohit", "Dhoni", "Zaheer", "Raina", "Sahwag", "Sachin", "bumrah");
        s1.skip(4).forEach(System.out::println);


    }
}
