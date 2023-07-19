package com.aliencodes.distinct_entities.repository;

import java.util.List;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aliencodes.distinct_entities.entity.GuardianEntity;
import com.aliencodes.distinct_entities.entity.StudentEntity;

@SpringBootTest
public class StudentRepositoryTest {

        @Autowired
        StudentRepository studentRepository;

        @Test
        public void saveStudentWithGuardian() {
                GuardianEntity guardian = GuardianEntity.builder()
                                .emailId("pabloescobar@gmai.com")
                                .mobile("8668774674")
                                .name("Pablo Escobar")
                                .build();

                StudentEntity student = StudentEntity.builder()
                                .emailId("gacha@gmail.com")
                                .firstName("gacha")
                                .lastName("puta")
                                .guardian(guardian)
                                .build();

                studentRepository.save(student);
        }

        @Test
        public void printAllStudents(){
                List<StudentEntity> stdList = studentRepository.findAll();
                System.out.println("Student list --> "+stdList);
        }

        @Test
        public void printStudentByFirstNameContaining(){
                List<StudentEntity> stdList = studentRepository.findByFirstNameContaining("E");
                System.out.println(stdList);
        }
         @Test
        public void printStudentByGuardianName(){
                List<StudentEntity> stdList = studentRepository.findByGuardianName("Michael Smith");
                System.out.println(stdList);
        }
        
        @Test
        public void printStudentByEmailAddress(){
                List<StudentEntity> stdList = studentRepository.findByEmailId("student1@example.com");
                System.out.println(stdList);
        }
}
