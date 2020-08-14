package Lekciq_2;

import Lekciq_1.Student;

public class Employee {

    private static int lastId = 0;
    private  int id;
    public Employee(){
        this.id= ++lastId;
    }

    public static void main(String[] args) {
        Student student = new Student("");
        for (int i =0;i<10;i++){
            Employee e = new Employee();
            System.out.println(e.id);
        }
    }
}
