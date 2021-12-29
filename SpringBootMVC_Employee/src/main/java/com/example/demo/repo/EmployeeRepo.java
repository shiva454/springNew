package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.entity.Employee;

public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

	@Query("SELECT e FROM Employee.e WHERE e.department.id=?1")
	List<Employee> findAllByDept(int dept_id);
}
