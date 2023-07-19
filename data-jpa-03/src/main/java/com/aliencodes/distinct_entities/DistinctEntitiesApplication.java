package com.aliencodes.distinct_entities;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class DistinctEntitiesApplication {

	public static void main(String[] args) {
		// ConfigurableApplicationContext cntxt = 
		SpringApplication.run(DistinctEntitiesApplication.class, args);
		// StudentRepository bean = cntxt.getBean(StudentRepository.class);
		// DataService dataService = cntxt.getBean(DataService.class);
		// dataService.printStudentByFirstNameContaining();
        // dataService.printStudentByGuardianName();
		// Here GuardianEntity is a seperate class(Entity) which is embbeded inside the studentEntity class using annotations like @embeddable and @embedded. 
}}
