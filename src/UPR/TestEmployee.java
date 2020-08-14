package UPR;

import java.util.Arrays;
import java.util.Collections;

public class TestEmployee {

    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("Karanfil Karanfilov",5000),
                new Employee("Ivan Ivanov",2000),

                new Employee("Dobdi Dobrinov",15000),
        };

        Arrays.sort(employees);
        for (Employee d: employees
             ) {
            System.out.println(d.getName() +" "+ d.getSalary());
        }
    }
}
