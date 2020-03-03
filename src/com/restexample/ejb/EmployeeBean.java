package com.restexample.ejb;

import java.util.ArrayList;
import java.util.List;

import javax.ejb.Stateless;

import model.Employee;

@Stateless
public class EmployeeBean {

	List<Employee> employees = new ArrayList<Employee>();
	
	public List<Employee> getAllEmplyees() {
		return employees;
	}
	
	public void createEmplyee(Employee e) {
		System.out.println("A new Employee was created");
		
		employees.add(e);
		for (Employee employee : employees) {
			System.out.println(employee.getName());
		}
	}
	
	public Employee readEmployeeById(Long id) {
		
		for (Employee e : employees) {
			if(id == e.getId()) {
				return e;
			}
		}
		return null;
	}
}
