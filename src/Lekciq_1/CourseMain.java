package Lekciq_1;

import java.util.List;

public class CourseMain {

    public static void main(String[] args) {
        Student mariika = new Student("Mariika");
        Student ivancho = new Student("Ivancho",2);
        mariika.setGrade(6);

        Course courseJava = new Course();
        courseJava.setName("Course Java");
        courseJava.addStudent(ivancho);
        courseJava.addStudent(mariika);
//        courseJava.setStudents(List.of(ivancho,mariika));

        Student kancho = new Student("kancho",5);
        courseJava.addStudent(kancho);
        for ( Student student: courseJava.getStudents()) {
            System.out.printf("%-20s%d%n",student.getName(),student.getGrade());

        }

    }
}
