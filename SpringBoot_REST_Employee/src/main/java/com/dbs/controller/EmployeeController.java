 package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentException;
import com.dbs.exception.InvalidEmployeeException;
import com.dbs.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	@GetMapping()
	public ResponseEntity<List<Employee>> findAll() {
		List<Employee> employees=employeeService.findAll();
		ResponseEntity<List<Employee>> responseEntity=new ResponseEntity<List<Employee>>(employees,HttpStatus.OK);
		return responseEntity;
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Employee> find(@PathVariable int id) throws InvalidEmployeeException {
     Employee employee=employeeService.find(id);
     ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(employee,HttpStatus.OK);
		return responseEntity;
	}
	
	@PostMapping()
	public  ResponseEntity<Employee> save(@RequestBody Employee employee) {
		Employee empInserted=employeeService.save(employee);
		ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(empInserted,HttpStatus.OK);
		
		return responseEntity;
	}
	
	@PutMapping("")
	public ResponseEntity<Employee> update(@RequestBody Employee employee) throws InvalidEmployeeException {
		Employee empUpdated=employeeService.update(employee);
		ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(empUpdated,HttpStatus.OK);
		
		return responseEntity;
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Employee> delete(@PathVariable int id) throws InvalidEmployeeException {
		Employee employee=employeeService.delete(id);
		ResponseEntity<Employee> responseEntity=new ResponseEntity<Employee>(employee,HttpStatus.OK);
		
		return responseEntity;
	}
	
	
	@GetMapping("/all/{id}")
	public List<Employee> findAllByDept(@PathVariable int id) throws InvalidDepartmentException{
		return employeeService.findAllByDeptId(id);
	}
}

