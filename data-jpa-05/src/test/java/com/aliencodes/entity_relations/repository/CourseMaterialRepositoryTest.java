package com.aliencodes.entity_relations.repository;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.aliencodes.entity_relations.entity.Course;
import com.aliencodes.entity_relations.entity.CourseMaterial;

@SpringBootTest
public class CourseMaterialRepositoryTest {
    
    @Autowired
    private CourseMaterialRepository courseMaterialRepository;

    @Test
    public void saveCourseMaterial() {
        Course newCourse = Course.builder()
            .title("DSA")
            .credit(5)
            .build();
        CourseMaterial courseMaterial = CourseMaterial.builder()
                .url("www.codeforces.com")
                .course(newCourse)
                .build();

        courseMaterialRepository.save(courseMaterial);
    }
}
