package com.sys.task.service;

import java.util.List;

import com.sys.task.entity.EmployeeVo;
import com.sys.task.entity.HealthCheck;

public interface EmployeeService {

	public List<EmployeeVo> getAllEmployee();

	public EmployeeVo saveEmployeeVo(EmployeeVo employeevo);

	public HealthCheck healthcheck();

	
}
