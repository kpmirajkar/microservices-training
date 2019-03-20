package com.employee.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.employee.model.Employee;
import com.employee.repository.EmployeeRespository;
import com.employee.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRespository employeeRespository;

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeRespository.addEmployee(employee);
	}

}
