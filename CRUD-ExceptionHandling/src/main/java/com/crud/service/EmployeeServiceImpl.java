package com.crud.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.crud.entity.Employee;
import com.crud.exception.ResourceNotFoundException;
import com.crud.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public Employee addEmployee(Employee e) {
		Employee newEmp = empRepo.save(e);
		return newEmp;
	}

	@Override
	public Employee getEmployee(Long id) throws ResourceNotFoundException{
		
		Optional<Employee> emp = empRepo.findById(id);
		if(emp.isPresent()) {
			return emp.get();
		}else {
			throw new ResourceNotFoundException("Employee is not Present!");
		}
		
	}

}
