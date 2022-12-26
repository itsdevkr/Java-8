package com.crud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.crud.entity.Employee;
import com.crud.exception.ControllerException;
import com.crud.exception.ResourceNotFoundException;
import com.crud.service.EmployeeService;

@RestController
public class EmployeeController {

	@Autowired
	private EmployeeService empService;

	@PostMapping("/emp")
	public ResponseEntity<Employee> createEmp(@RequestBody Employee e) {
		Employee eNew = empService.addEmployee(e);
		return new ResponseEntity<Employee>(eNew, HttpStatus.CREATED);
	}

	@GetMapping("/emp/{empId}")
	public ResponseEntity<?> findEmployee(@PathVariable("empId") Long id) throws ResourceNotFoundException {
		Employee emp = empService.getEmployee(id);
		try {
			return new ResponseEntity<Employee>(emp, HttpStatus.OK);
		} catch (Exception e) {
			ControllerException controllerException = new ControllerException(
					"Exception occured while fetching data for Employee with ID: " + id);
			return new ResponseEntity<ControllerException>(controllerException, HttpStatus.BAD_REQUEST);
		}
	}

}
