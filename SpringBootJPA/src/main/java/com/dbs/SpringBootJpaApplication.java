package com.dbs;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.dbs.entity.Department;
import com.dbs.entity.Employee;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctxt=SpringApplication.run(SpringBootJpaApplication.class, args);
 
		Department department1=new Department("Sales");
		Department department2=new Department("Production");
		
		Employee employee1=new Employee("Shiva");
		Employee employee2=new Employee("Sriya");
		Employee employee3=new Employee("Manu");
		Employee employee4=new Employee("Teja");
		
		List<Employee>empList1=new ArrayList<>();
		empList1.add(employee1);
		empList1.add(employee2);
		
		List<Employee>empList2=new ArrayList<>();
		empList2.add(employee3);
		empList2.add(employee4);
		
		department1.setEmployees(empList1);
		department2.setEmployees(empList2);
		
		employee1.setDepartment(department1);
		employee2.setDepartment(department2);
		
		
	}

}
