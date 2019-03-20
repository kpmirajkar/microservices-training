package com.employee.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.employee.model.Employee;

public interface EmployeeRespository extends MongoRepository<Employee, Integer> {

	Employee addEmployee(Employee employee);

}
