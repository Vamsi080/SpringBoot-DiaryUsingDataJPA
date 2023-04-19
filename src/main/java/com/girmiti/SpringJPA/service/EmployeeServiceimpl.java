package com.girmiti.SpringJPA.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.girmiti.SpringJPA.entity.Employee;
import com.girmiti.SpringJPA.repository.EmployeeRepository;

@Service
public class EmployeeServiceimpl implements EmployeeService{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public Employee saveEmployee(Employee employee) {
		
		//it takes the help of repository to save the data in database
		return employeeRepository.save(employee);
		
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		
		/*
		 * if update also using same save method then how the spring configure the
		 * save and update
		 * 
		 * reason
		 * 
		 *  if the return employee object have any id number like 1,2 etc.. then it
		 * prepare the update query insted of save 
		 * other wise if their is no id value then it will recognize this is new object value 
		 * and it saves into databases spring prepares insert query for that request .
		 */		
		
		return employeeRepository.save(employee);

	}

	@Override
	public void deleteEmployee(Employee employee) {

		employeeRepository.delete(employee);
		
	}

	@Override
	public Employee findById(int id) {
		
		return employeeRepository.findById(id).get();
	}

	@Override
	public List<Employee> findAll() {
		
		return employeeRepository.findAll();
	}

}
