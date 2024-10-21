package com.sys.task.dao;

import java.util.List;

import com.sys.task.entity.Employee;

public interface EmployeeDao {

	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);
}
