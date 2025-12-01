package Day_04_Optional;

import java.util.ArrayList;
import java.util.Optional;

//What will be printed when iterating over the list, and how does Optional.isPresent() prevent runtime exceptions when handling empty values?
//What will be printed when iterating over the list, and how does Optional.isPresent() prevent runtime exceptions when handling empty values?

public class OptionalDemo4 {
    public static void main(String[] args) {

        ArrayList<Optional> listOfCity = new ArrayList<>();
        listOfCity.add(Optional.of("Hyd"));
        listOfCity.add(Optional.of("Bglr"));
        listOfCity.add(Optional.of("Pune"));
        listOfCity.add(Optional.of("jsr"));
        listOfCity.add(Optional.empty());

        for (Optional<String> optl : listOfCity)
        {
            if (optl.isPresent())
            {
                System.out.println("Value is : "+optl.get());
            }
            else
            {
                System.out.println("No value is present in the container");
            }
        }
    }
}
