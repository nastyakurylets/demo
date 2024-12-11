package ua.ucu.edu.task1;

import java.util.List;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

@Data
@Builder
public class Student {
    private String firstName;
    private String lastName;
    private String gender;
    private String email;
    private int age;
    @Singular private List<String> courses;

    // public Student setFirstName(String firstName){
    //     this.firstName = firstName;
    //     return this;
    // }

    // public Student setLastName(String lastName){
    //     this.lastName = lastName;
    //     return this;
    // }

    // public static class StudentBuilder{
    //     private Student student;

    //     public StudentBuilder(){
    //         this.student = new Student();
    //     }

    //     public StudentBuilder firstName(String firstName){
    //         student.setFirstName(firstName);
    //         return this;
    //     }
    // }
}
