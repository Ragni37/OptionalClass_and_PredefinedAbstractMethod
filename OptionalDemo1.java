package Day_04_Optional;

//How to create a container object to represent null and not null value

import java.util.Optional;

public class OptionalDemo1 {
    public static void main(String[] args) {

        String str = "Ragni";

        Optional<String> optl = Optional.ofNullable(str);

        if (optl.isPresent())
        {
            System.out.println(optl.get());
        }
        else
        {
            System.out.println("Value is not available in the Container");
        }

    }
}
