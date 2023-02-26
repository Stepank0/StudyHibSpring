package aop;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class University {
    private List<Student> students = new ArrayList<>();


    public void addStudents(){
        Student student1 = new Student("Stepan Koryagin", 4, 7.5);
        Student student2 = new Student("Elena Koryagin", 2, 8.3);
        Student student3 = new Student("Alex Koryagin", 1, 6.0);

        students.add(student1);
        students.add(student2);
        students.add(student3);
    }

    public List<Student> getStudents(){
        System.out.println("начало работы метода getStudents");
        System.out.println(students.get(4));


        System.out.println("Information from method getStudent: ");
        System.out.println(students);
        return students;
    }

}
