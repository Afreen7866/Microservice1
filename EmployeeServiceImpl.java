package com.sys.task.service;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.sys.task.bo.EmployeeBo;
import com.sys.task.entity.EmployeeVo;
import com.sys.task.entity.HealthCheck;
import com.sys.task.mapper.EmployeeMapper;

@Component("employeeService")
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeBo employeeBo;
	
	@Autowired
	private EmployeeMapper employeeMapper;
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);

	@Override
	public List<EmployeeVo> getAllEmployee() {
		// TODO Auto-generated method stub
		logger.info("retrieving data in service");
		return employeeMapper.toEmployeeVo(employeeBo.getAllEmployee());
	}

	@Override
	public EmployeeVo saveEmployeeVo(EmployeeVo employeevo) {
		// TODO Auto-generated method stub
		logger.info("saving data in service ");
		return employeeMapper.toEmployeeVo(employeeBo.saveEmployee(employeeMapper.toEmployee(employeevo)));
	}

	@Override
	public HealthCheck healthcheck() {
		// TODO Auto-generated method stub
		logger.info("health check in progress");
		return employeeBo.healthcheck();
	}

	
	

}