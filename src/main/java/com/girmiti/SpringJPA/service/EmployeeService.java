package com.girmiti.SpringJPA.service;

import java.util.List;

import com.girmiti.SpringJPA.entity.Employee;

public interface EmployeeService {

	
	public Employee saveEmployee(Employee employee);
	public Employee updateEmployee(Employee employee);
	public void deleteEmployee(Employee employee);
	public Employee findById(int id);
	public List<Employee> findAll();
	
}
