package Lekciq_1;


import java.util.List;

public class Course {
    private  String name;

    private List<Student> students;

    public Course() {

    }

    public Course(List<Student> students) {
        this("",students);
        this.students = students;
    }

    public Course(String name) {

        this.name = name;
    }

    public Course(String name, List<Student> students) {
        this.name = name;
        this.students =  students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public Course addStudent(Student student) {
        this.students.add(student);
        return this;
    }
}
