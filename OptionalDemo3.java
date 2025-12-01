package Day_04_Optional;

import java.util.Optional;

//What will be printed when str is null, and how does orElse() make the program safer compared to get()?

public class OptionalDemo3 {
    public static void main(String[] args) {

        String str = null;

        Optional<String> optl = Optional.ofNullable(str);

        String orElse = optl.orElse("No value in the container : ");
        System.out.println(orElse);
    }
}
