package com.connect.oracledb.repository;

import java.io.Serializable;

import org.springframework.data.repository.CrudRepository;

import com.connect.oracledb.model.CustomerDataEntity;

// crudRepository is an interface which implements a Repository Marker interface.
public interface CustomerDataRepository extends CrudRepository<CustomerDataEntity, Serializable>{
    
}
