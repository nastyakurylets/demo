package ua.ucu.edu.task1;

import ua.ucu.edu.task1.Student.StudentBuilder;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        StudentBuilder studentBuilder = Student.builder();

        Student student = studentBuilder.courses(List.of("OOP")).course("P&S").firstName("Jo").lastName("March").age(31).email("test@test").build();

        System.out.println(student);

    }
}
