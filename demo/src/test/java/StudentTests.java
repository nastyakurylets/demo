import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;

import org.junit.jupiter.api.Test;

import ua.ucu.edu.task1.Student;
import ua.ucu.edu.task1.Student.StudentBuilder;

public class StudentTests {
    
    @Test
    public void StudentTest() {
        StudentBuilder studentBuilder = Student.builder();

        Student student = studentBuilder.email("test@test").build();

        assertEquals(student.getEmail(), "test@test");

        student = studentBuilder.courses(List.of("OOP")).course("P&S").firstName("Jo").lastName("March").age(31).build();

        assertEquals(student.getCourses(), List.of("OOP", "P&S"));
        assertEquals(student.getFirstName(), "Jo");
        assertEquals(student.getLastName(), "March");
        assertEquals(student.getAge(), 31);
        assertEquals(student.getEmail(), "test@test");

    }
}