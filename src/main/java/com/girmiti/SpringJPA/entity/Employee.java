package com.girmiti.SpringJPA.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
public class Employee {

	@jakarta.persistence.Id
	@GeneratedValue(strategy = GenerationType.IDENTITY) // It increments the id and i assigns to next employee in the													// table
	private int id;

	private String name;
	private String designation;
	private String department;
	private int experience;

	

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", designation=" + designation + ", department=" + department
				+ ", experience=" + experience + "]";
	}

	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Employee(int id, String name, String designation, String department, int experience) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.department = department;
		this.experience = experience;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesignation() {
		return designation;
	}

	public void setDesignation(String designation) {
		this.designation = designation;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getExperience() {
		return experience;
	}

	public void setExperience(int experience) {
		this.experience = experience;
	}

}
