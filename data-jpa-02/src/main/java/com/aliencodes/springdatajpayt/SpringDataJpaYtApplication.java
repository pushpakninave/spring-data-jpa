package com.aliencodes.springdatajpayt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.aliencodes.springdatajpayt.entity.StudentEntity;
import com.aliencodes.springdatajpayt.repository.StudentRepository;

@SpringBootApplication
public class SpringDataJpaYtApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext cntxt = SpringApplication.run(SpringDataJpaYtApplication.class, args);

		StudentRepository bean = cntxt.getBean(StudentRepository.class);

		StudentEntity entity = StudentEntity.builder()
				.emailId("pushpakninave.jee@gmail.com")
				.firstName("pushpak")
				.lastName("ninave")
				.guardianName("dawood")
				.guardingEmailId("dawoodIbrahim@gmai.com")
				.guardianMobile("9879879867")
				.build();

		bean.save(entity);
		cntxt.close();
	}

}
