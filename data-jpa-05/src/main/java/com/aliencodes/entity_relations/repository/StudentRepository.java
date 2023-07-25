package com.aliencodes.entity_relations.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.aliencodes.entity_relations.entity.StudentEntity;

public interface StudentRepository extends JpaRepository<StudentEntity, Long> {
    
}
