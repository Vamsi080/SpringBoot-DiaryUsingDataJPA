package com.girmiti.SpringJPA.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.girmiti.SpringJPA.entity.Employee;
import com.girmiti.SpringJPA.service.EmployeeService;

@Controller
public class HomeController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping("/home")
	public String insertEmployee(Model model) {
		
		Employee employee = new Employee();
		employee.setName("Uma mahesh");
		employee.setDesignation("SoftwareDeveloper");
		employee.setDepartment("IT");
		employee.setExperience(7);
		Employee emp = employeeService.saveEmployee(employee);
		String  msg ="Employee " + emp.getName() + " with id " + emp.getId() + " Is Saved Successfully";
		model.addAttribute("employee", emp);
		model.addAttribute("message", msg);
		return "home";
	}

}
