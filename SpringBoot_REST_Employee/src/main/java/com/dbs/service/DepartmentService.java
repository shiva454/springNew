 package com.dbs.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dbs.entity.Department;
import com.dbs.exception.InvalidDepartmentException;
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
        Optional<Department> department = departmentRepo.findById(id);
        if(!department.isPresent()) {
            throw new InvalidDepartmentException("Department not found with id - " + id);
        }
        return department.get();
    }

    public List<Department> findAll() {
        return departmentRepo.findAll();
    }

    public Department save(Department department) {
        return departmentRepo.save(department);
    }

    public Department update(Department department) throws InvalidDepartmentException {
        Optional<Department> optDepartment = departmentRepo.findById(department.getId());
        department.getId();
        if(!optDepartment.isPresent()) {
        	throw new InvalidDepartmentException("Department not existing with id :" + department.getId());
        }      
        return departmentRepo.save(department);
    }

    public Department delete(int id) throws InvalidDepartmentException {
    	Optional<Department> optDepartment = departmentRepo.findById(id);
        if(!optDepartment.isPresent()) {
        	throw new InvalidDepartmentException("Department not existing with id : " + id);
        }
        Department department = optDepartment.get();
        departmentRepo.delete(department);
        return department;
    }
	
	
	

}
