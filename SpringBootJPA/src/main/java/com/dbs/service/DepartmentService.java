package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Department;
import com.dbs.entity.Employee;
import com.dbs.exception.InvalidDepartmentException;
import com.dbs.exception.InvalidEmployeeException;
import com.dbs.repo.DepartmentRepo;

@Service
public class DepartmentService {
	DepartmentRepo departmentRepo;

	public DepartmentRepo getDepartmentRepo() {
		return departmentRepo;
	}

	@Autowired
	public void setDepartmentRepo(DepartmentRepo departmentRepo) {
		this.departmentRepo = departmentRepo;
	}
	
	public Department find(int id) throws InvalidDepartmentException {
		Optional<Department> optionalDept = departmentRepo.findById(id);
		if (!optionalDept.isEmpty()){
			 throw new InvalidDepartmentException("Employeeid not found:"+id);
			  }
		return optionalDept.get();
	}

	public List<Department> findAll() {
		return departmentRepo.findAll();
	}

	public Department save(Department department) {
		return departmentRepo.save(department);
	}
	
	public Department update(Department department) throws InvalidDepartmentException {
		   Optional<Department> optionalDept=departmentRepo.findById(department.getId());
		   if(optionalDept.isEmpty()) {
			   throw new InvalidDepartmentException("Department not existing to modify with id:"+department.getId());
			   
		   }
		   return departmentRepo.save(department);
	   }
	
	
	
	
	
	
	
	
	
	   public Department delete(int id) throws InvalidDepartmentException {
		   Optional<Department> optionalDept=departmentRepo.findById(id);
		   if(optionalDept.isEmpty()) {
			   throw new InvalidDepartmentException("Department not existing to delete with id:"+id);
			   
		   }
		   Department department=optionalDept.get();
		   departmentRepo.deleteById(id);
		   return departmentRepo.save(department);
	   }
	
	
	
 
}
