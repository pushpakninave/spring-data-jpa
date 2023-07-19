package com.aliencodes.distinctentites.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.aliencodes.distinctentites.entity.StudentEntity;

import jakarta.transaction.Transactional;

public interface StudentRepository extends JpaRepository<StudentEntity, Long>{
    
    // below are all JPQL queries
    @Query("select s from StudentEntity s where s.emailId = ?1")
    StudentEntity getStudentByEmailAddress(String emailId); 

    @Query("select s.firstName from StudentEntity s where s.emailId = ?1")
    String getStudentFirstNameByEmailAddress(String emailId); 


    // Native sql queries
    @Query(
        value = "SELECT * FROM STUDENT_DATA s WHERE s.EMAIL_ID = ?1",
        nativeQuery = true
    )
    StudentEntity getStudentByEmailAddressNative(String emailId); 

    // Native Named Param
     @Query(
        value = "SELECT * FROM STUDENT_DATA s WHERE s.EMAIL_ID = :emailId",
        nativeQuery = true
    )
    StudentEntity getStudentByEmailAddressNativeNamedParam(@Param("emailId")String emailId);

    @Transactional
    @Modifying
    @Query(
        value = "UPDATE STUDENT_DATA SET FIRST_NAME = ?1 WHERE EMAIL_ID = ?2",
        nativeQuery = true
    )   
    int updateStudentNameByEmailId(String firstName, String EmailId);
}
