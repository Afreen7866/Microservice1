package com.sys.task.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.sys.task.entity.EmployeeVo;
import com.sys.task.entity.Employee;

@Component
public class EmployeeMapperImpl implements EmployeeMapper{

	@Override
	public List<EmployeeVo> toEmployeeVo(List<Employee> list) {
		if(list == null) {
		   return null;
		}
		List<EmployeeVo> list1 = new ArrayList<EmployeeVo>(list.size());
		for(Employee employee : list) {
			list1.add(toEmployeeVo(employee));
		}
		return list1;
	}

	@Override
	public List<Employee> toEmployees(List<EmployeeVo> list) {
		if(list == null) {
			   return null;
		}
		List<Employee> list1 = new ArrayList<Employee>(list.size());
		for(EmployeeVo employeeVo : list) {
			list1.add(toEmployee(employeeVo));
		}
		return list1;
	}

	@Override
	public Employee toEmployee(EmployeeVo employee) {
		if(employee == null) {
			   return null;
		}
		Employee employee1 = new Employee();
		employee1.setId(employee.getId());
		employee1.setName(employee.getName());
		return employee1;
	}

	@Override
	public EmployeeVo toEmployeeVo(Employee employee1) {
		if(employee1 == null) {
			   return null;
		}
		EmployeeVo employee2 = new EmployeeVo();
		employee2.setId(employee1.getId());
		employee2.setName(employee1.getName());
		return employee2;
	}

}
