package Day_04_Optional;

import java.util.Optional;

//What happens when you call get() on an empty Optional?

public class OptionalDemo2 {
    public static void main(String[] args) {

        String str = null;
        Optional<String> optl = Optional.ofNullable(str);
        System.out.println("Value of container : "+ optl.get());
    }
}
