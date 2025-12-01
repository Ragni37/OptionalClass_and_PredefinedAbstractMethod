package Day_04_Optional;

import java.util.Optional;

public class OptionalDemo5 {
    public static void main(String[] args) {

        Integer i = 90;

        Optional<Integer> optl = Optional.ofNullable(i);
        optl.ifPresent(System.out::println);
    }
}
