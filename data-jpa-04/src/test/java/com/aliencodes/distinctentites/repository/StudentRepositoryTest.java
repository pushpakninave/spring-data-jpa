package com.aliencodes.distinctentites.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aliencodes.distinctentites.entity.StudentEntity;

@SpringBootTest
public class StudentRepositoryTest {

    @Autowired
    StudentRepository studentRepository;

    @Test
    public void printGetStudentByEmailAddress(){
        StudentEntity student = studentRepository.getStudentByEmailAddress("student1@example.com");
        System.out.println(student);
    }

    @Test
    public void printGetStudentFirstNameByEmailAddress(){
        String studentName = studentRepository.getStudentFirstNameByEmailAddress("student1@example.com");
        System.out.println(studentName);
    }

    // Using Native sql query rather than using jpa methods.
    @Test
    public void printGetStudentByEmailAddressNative(){
        StudentEntity student = studentRepository.getStudentByEmailAddressNative("student1@example.com");
        System.out.println(student);
    }
    
    // Using named Params 
    @Test
    public void printGetStudentByEmailAddressNativeNamedParam(){
        StudentEntity student = studentRepository.getStudentByEmailAddressNativeNamedParam("student1@example.com");
        System.out.println(student);
    }

    @Test
    public void updateStudentNameByEmailId(){
        studentRepository.updateStudentNameByEmailId("Gacha","gacha@gmail.com");
    }
}
