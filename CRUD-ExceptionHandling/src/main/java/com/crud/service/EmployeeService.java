package com.crud.service;

import com.crud.entity.Employee;
import com.crud.exception.ResourceNotFoundException;

public interface EmployeeService {
	public Employee addEmployee(Employee e);
	public Employee getEmployee(Long id) throws ResourceNotFoundException;
}
