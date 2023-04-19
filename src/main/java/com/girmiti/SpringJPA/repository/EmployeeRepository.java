package com.girmiti.SpringJPA.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.girmiti.SpringJPA.entity.Employee;
 


//@Repository now it's automatically imported by springboot if you extends jpa repository the @repository annotation is automatically imported by default
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}