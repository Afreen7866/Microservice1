package com.sys.task.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.sys.task.entity.Employee;
import com.sys.task.entity.HealthCheck;
import com.sys.task.eo.EmployeeEo;
import com.sys.task.exception.TableNotFoundException;

@Service("employeeBo")
public class EmployeeBoImpl implements EmployeeBo {
	
	@Autowired
	private EmployeeEo employeeEo;
	
	Logger logger = LoggerFactory.getLogger(EmployeeBoImpl.class);

	@Override
	public List<Employee> getAllEmployee() {
		logger.info("getting data in Bo");
		return employeeEo.getAllEmployee();
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		logger.info("saving data in Bo");
		return employeeEo.saveEmployee(employee);
	}

	@Override
	public HealthCheck healthcheck() throws TableNotFoundException{
		HealthCheck healthcheck = new HealthCheck();
		healthcheck.setHealthComment("check table is available in db");
		try {
			if(getAllEmployee() != null) {
				healthcheck.setHealthStatus("success");
				healthcheck.setHealthDescription("table is avaliable");
			}
		}
		catch(Exception ex) {
			healthcheck.setHealthStatus("failure");
			healthcheck.setHealthDescription("table is not available");
			
		}
		return healthcheck;
	}

}