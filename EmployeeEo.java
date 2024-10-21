package com.sys.task.eo;

import java.util.List;

import com.sys.task.entity.Employee;

public interface EmployeeEo {

	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);

}
