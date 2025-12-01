package Day_04_Optional;

import java.util.ArrayList;

record Employee1(String name, Integer experience){}

public class IntStreamMethods1 {
    public static void main(String[] args) {

        Employee1 e1 = new Employee1("Raj", 12);
        Employee1 e2 = new Employee1("Scott", 14);
        Employee1 e3 = new Employee1("Smith", 12);
        Employee1 e4 = new Employee1("John", 20);
        Employee1 e5 = new Employee1("Alen", 5);

        ArrayList<Employee1> listOfEmp = new ArrayList<>();
        listOfEmp.add(e1);
        listOfEmp.add(e2);
        listOfEmp.add(e3);
        listOfEmp.add(e4);
        listOfEmp.add(e5);

        int sum = listOfEmp.stream()
                .mapToInt(emp -> emp.experience()).sum();

        System.out.println("Total year of Experience is : "+sum);

    }
}
