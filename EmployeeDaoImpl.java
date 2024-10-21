package com.sys.task.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.sys.task.entity.Employee;

@Repository("/employeeDao")
public class EmployeeDaoImpl implements EmployeeDao{
	
	@Autowired
	JdbcTemplate jdbcTemplate1;
	

	Logger logger = LoggerFactory.getLogger(EmployeeDao.class);


	@Override
	public List<Employee> getAllEmployee() {
		String query1 = "select * from employeevo";
				logger.info("find all the data");
		return jdbcTemplate1.query(query1,(rs,rowNum)->
		new  Employee(
				rs.getInt("Id"),
				rs.getString("Name")
				)
		);
	}

	@Override
	public Employee saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into employeevo values('"+employee.getId()+"' ,'"+employee.getName()+"')";
		jdbcTemplate1.update(query);
		logger.info("creating");
		return employee;
	}

}