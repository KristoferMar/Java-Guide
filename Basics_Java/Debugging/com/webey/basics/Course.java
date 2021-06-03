package com.webey.basics;

public class Course {
	
	private int id;
	private String name;
	
	private Department department;
	
	public Course(int id, String name, String departmentName) {
		super();
		this.id = id;
		this.setName(name);
		
		if (departmentName != null) {
			this.department = new Department(departmentName);
		}
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

	public Department getDepartment() {
		return department;
	}

}
