package com.sys.task.bo;

import java.util.List;

import com.sys.task.entity.Employee;
import com.sys.task.entity.HealthCheck;

public interface EmployeeBo {
	
	public List<Employee> getAllEmployee();
	public Employee saveEmployee(Employee employee);
	public HealthCheck healthcheck();

}