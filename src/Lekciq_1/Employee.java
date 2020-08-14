package Lekciq_1;

import java.util.ArrayList;
import java.util.Arrays;

public class Employee {

    public static final ArrayList<String> NAMES = new ArrayList<>();
    public static final ArrayList<Double> SALARY = new ArrayList<>();


    private String name;
    private double salary;

    public Employee() {
        this("",0);
    }

    public Employee(double salary) {
        this("",salary);
        this.salary = salary;
    }

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        NAMES.add(name);

    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
        SALARY.add(salary);

    }


    public static void main(String[] args) {
        Employee employee = new Employee();
        employee.setName("ds");
        Employee e2 = new Employee();
        System.out.println(employee.getName());
        e2.setName("Honda");
        System.out.println(e2.getName());

        System.out.println(Employee.NAMES);
    }
}
