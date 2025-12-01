package Day_04_sorted;

//Sort by name

import java.util.Arrays;
import java.util.List;

record Student(Integer id, String name){}

public class SortedDemo3 {
    public static void main(String[] args) {

        List<Student> students = Arrays.asList(
                new Student(3, "Scott"),
                new Student(1, "John"),
                new Student(2, "Allen")
        );

        students.stream()
                .sorted((s1,s2)-> s1.name().compareTo(s2.name()))
                .forEach(System.out::println);

    }
}
