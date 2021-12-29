package com.dbs.service;
import java.util.Optional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dbs.beans.Employee;
import com.dbs.exception.InvalidEmployeeIdEception;
import com.dbs.repo.EmployeeRepo;

 
@Component
public class EmployeeService {

	EmployeeRepo employeeRepo;
	public EmployeeRepo getEmployeeRepo() {
		return employeeRepo;
		
	}
	@Autowired
	public void setEmployeeRepo(EmployeeRepo employeeRepo) {
		this.employeeRepo=employeeRepo;
	}
	public Employee find(int id)  throws InvalidEmployeeIdEception{
		Optional<Employee> empOpt=employeeRepo.findById(id);
		if(!empOpt.isPresent()) {
			throw new InvalidEmployeeIdEception("Employee ID not found:"+id);
		}
		return empOpt.get();
		
	}
	public List<Employee> findAll(){
		return (List<Employee>employeeRepo.findAll());
	}
	public Employee save(Employee employee) {
		return employeeRepo.save(employee);
	}
	public Employee edit(Employee employee) throws InvalidEmployeeIdEception{
		find(employee.getId());
		return employeeRepo.save(employee);
	}
	public Employee delete(int id) throws InvalidEmployeeIdEception{
		Employee employee=find(id);
		
		 
		employeeRepo.deleteById(id);
		return employee;
	}
}
