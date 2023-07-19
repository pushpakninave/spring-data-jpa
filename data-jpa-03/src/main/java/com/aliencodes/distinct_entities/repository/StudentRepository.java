package com.aliencodes.distinct_entities.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencodes.distinct_entities.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{
    // below are all the queries from method names. 
    List<StudentEntity> findByFirstName(String firstName);
    List<StudentEntity> findByLastName(String lastName);
    List<StudentEntity> findByFirstNameContaining(String name);
    List<StudentEntity> findByGuardianName(String name);
    List<StudentEntity> findByEmailId(String emailId);
}
