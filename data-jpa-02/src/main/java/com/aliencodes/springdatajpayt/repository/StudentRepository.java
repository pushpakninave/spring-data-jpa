package com.aliencodes.springdatajpayt.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.aliencodes.springdatajpayt.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity,Long> {
    
}
