package com.connect.oracledb.model;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

// @data generates auto setters and getters but in lombok dependency must be included in pom.xml
@Data
@Entity
@Table(name = "CUSTOMER_DATA")
public class CustomerDataEntity {
    // @Id used to represent variable as Primary key
    @Id
    @Column(name = "CUID")
    private Integer id;

    @Column(name = "FIRSTNAME")
    private String firstName;
    
    @Column(name = "LASTNAME")
    private String lastName;

    @Column(name = "EMAIL")
    private String emailId;
}
