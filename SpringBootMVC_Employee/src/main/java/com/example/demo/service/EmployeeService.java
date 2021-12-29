package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.InvalidDepartmentException;
import com.example.demo.exception.InvalidEmployeeException;
import com.example.demo.repo.EmployeeRepo;

@Service
public class EmployeeService {
	EmployeeRepo employeeRepo;
	DepartmentService departmentService;
	public EmployeeRepo getEmployeeRepo() {
		return employeeRepo;
	}

	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo = employeeRepo;
	}
	public DepartmentService getDepartmentService() {
		return departmentService;
	}
	@Autowired
	public void setDepartmentRepo(DepartmentService departmentService) {
		this.departmentService = departmentService;
	}
	public Employee find(int id) throws InvalidEmployeeException {
		Optional<Employee> optionalEmp = employeeRepo.findById(id);
		if (!optionalEmp.isPresent()){
			 throw new InvalidEmployeeException("Employeeid not found:"+id);
			  }
		return optionalEmp.get();
	}

	public List<Employee> findAll() {
		return employeeRepo.findAll();
	}

	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
   public Employee update(Employee employee) throws InvalidEmployeeException {
	   Optional<Employee> optionalEmp=employeeRepo.findById(employee.getId());
	   if(optionalEmp.isEmpty()) {
		   throw new InvalidEmployeeException("Employee not existing to modify with id:"+employee.getId());
		   
	   }
	   return employeeRepo.save(employee);
   }
   public Employee delete(int id) throws InvalidEmployeeException {
	   Optional<Employee> optionalEmp=employeeRepo.findById(id);
	   if(optionalEmp.isEmpty()) {
		   throw new InvalidEmployeeException("Employee not existing to delete with id:"+id);
		   
	   }
	   Employee employee=optionalEmp.get();
	   employeeRepo.deleteById(id);
	   return employeeRepo.save(employee);
   }
   public List<Employee> findAllByDeptId(int deptId) throws InvalidDepartmentException{
	   departmentService.find(deptId);
	    return employeeRepo.findAllByDept(deptId);
   }
 }
