 package com.dbs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
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

import com.dbs.entity.Department;
import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentException;
import com.dbs.exception.InvalidEmployeeException;
import com.dbs.service.DepartmentService;

@RestController
@RequestMapping("/department")
public class DepartmentController {
	
	@Autowired
	DepartmentService departmentService;
	
	@GetMapping()
	public List<Department> findAll() {
		return departmentService.findAll();
	}
	
	@GetMapping("/{id}")
	public Department find(@PathVariable int id) throws InvalidDepartmentException {
		return departmentService.find(id);
	}
	
	@PostMapping()
	public Department save(@RequestBody Department department) {
		return departmentService.save(department);
	}
	
	@PutMapping("")
	public Department update(@RequestBody Department department) throws InvalidDepartmentException {
		return departmentService.update(department);
	}
	
	@DeleteMapping("/{id}")
	public Department delete(@PathVariable int id) throws InvalidDepartmentException {
		return departmentService.delete(id);
	}	
}

