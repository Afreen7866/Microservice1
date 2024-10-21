package com.sys.task.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import com.sys.task.entity.EmployeeVo;
import com.sys.task.entity.Employee;

@Mapper(componentModel = "spring")
public interface EmployeeMapper {

	List<EmployeeVo> toEmployeeVo(List<Employee> list);
	List<Employee> toEmployees(List<EmployeeVo> list);
	Employee toEmployee(EmployeeVo employee);
	EmployeeVo toEmployeeVo(Employee employee1);
	
}
