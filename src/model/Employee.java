package model;

import javax.validation.constraints.NotNull;

//Employee model

public class Employee {
	
	private Long id; 
	private String name;
	
	@NotNull
	public Long getId() {
		return id;
	}
	
	@NotNull
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	
	public void setName(String name) {
		this.name = name;
	}
	

}
