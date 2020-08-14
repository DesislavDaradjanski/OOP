package UPR;

public class Employee implements  Comparable<Employee>{
    private String name;
    private double salary;


    public Employee(){};

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return salary;
    }

    public Employee setSalary(double salary) {
        this.salary = salary;
        return this;
    }

    public Employee setName(String name) {
        this.name = name;
        return this;
    }

    @Override
    public int compareTo(Employee o) {

        return -(int)(this.salary - o.salary);
    }
}
