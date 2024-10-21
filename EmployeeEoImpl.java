package com.sys.task.eo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sys.task.dao.EmployeeDao;
import com.sys.task.entity.Employee;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Component("employeeEo")
public class EmployeeEoImpl implements EmployeeEo {
	
	@Autowired
	private EmployeeDao employeeDao;
	
	Logger logger = LoggerFactory.getLogger(EmployeeEo.class);

	@Override
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		logger.info("getting data in Eo");
		return employeeDao.getAllEmployee();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		logger.info("saving data in Eo");
		return employeeDao.saveEmployee(employee);
	}

	

}