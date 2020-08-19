package IneerClasses;

import java.util.ArrayList;
import java.util.Comparator;

public class EmployeeTest {

    public static void main(String[] args) {

        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Ivan", 950));
        employees.add(new Employee("Vasil", 1950));
        employees.add(new Employee("Maria", 10950));
        employees.add(new Employee("Galq", 5950));
        employees.add(new Employee("Galq", 4950));


        for (Employee e : employees
        ) {
            System.out.println(e);
        }
        employees.sort(EMPLOYEE_NAME_COMPARATOR);
        System.out.println("Sort by name");
        for (Employee e : employees
        ) {
            System.out.println(e);
        }

        employees.sort(EMPLOYEE_COMBINED_COMPARATOR);
        System.out.println("Sort by salary");

        for (Employee e : employees
        ) {
            System.out.println(e);
        }
    }


    static Comparator EMPLOYEE_COMBINED_COMPARATOR = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            int val = EMPLOYEE_NAME_COMPARATOR.compare(o1, o2);
            if (val == 0) {
                return EMPLOYEE_SALARY_COMPARATOR.compare(o1, o2);
            } else {
                return val;
            }
        }
    };

    static Comparator EMPLOYEE_NAME_COMPARATOR = new Comparator<Employee>() {

        @Override
        public int compare(Employee o1, Employee o2) {
            return o1.getName().compareTo(o2.getName());
        }
    };

    static Comparator EMPLOYEE_SALARY_COMPARATOR = new Comparator<Employee>() {
        @Override
        public int compare(Employee o1, Employee o2) {
            return (int) (o1.getSalary() - o2.getSalary());
        }

    };
}
