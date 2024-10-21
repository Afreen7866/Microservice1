package com.sys.task.entity;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class Employee {

	@NotNull
	@Min(value=3,message="criteria not met")
	private int Id;
	
	@NotNull
	@Max(value=30,message="criteria not met")
	private String Name;
	
	public int getId() {
		return Id;
	}
	public void setId(int Id) {
		this.Id = Id;
	}
	public String getName() {
		return Name;
	}
	public void setName(String Name) {
		this.Name = Name;
	}
	public Employee(int Id, String Name) {
		super();
		this.Id = Id;
		this.Name = Name;
	}
	public Employee() {
		super();
	}
	
}
