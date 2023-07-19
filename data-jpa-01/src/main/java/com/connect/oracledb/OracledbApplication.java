package com.connect.oracledb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.connect.oracledb.model.CustomerDataEntity;
import com.connect.oracledb.repository.CustomerDataRepository;

@SpringBootApplication
public class OracledbApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt =  SpringApplication.run(OracledbApplication.class, args);
		
		// method to get object IOC container.
		CustomerDataRepository bean = ctxt.getBean(CustomerDataRepository.class);
		// note : CustomerDataRepository is an interface but still an object is created because spring data uses proxy design pattern to get implementation class name.
		// System.out.println(" this is the class name " + bean.getClass().getName());
		
		CustomerDataEntity entity = new CustomerDataEntity();
		entity.setId(930);
		entity.setFirstName("Alice");
		entity.setLastName("Bob");
		entity.setEmailId("alicebob@gmail.com");
		bean.save(entity);
		ctxt.close();
	}

}
