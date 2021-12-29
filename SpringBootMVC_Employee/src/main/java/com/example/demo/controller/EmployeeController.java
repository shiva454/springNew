package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.entity.Employee;
import com.example.demo.service.EmployeeService;

@Controller
public class EmployeeController {

	EmployeeService employeeService;
	
	
	public EmployeeService getEmployeeService() {
		return employeeService;
	}


@Autowired
	public void setEmployeeService(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}


@RequestMapping("/getEmps")
	public ModelAndView getAllEmps() {
		ModelAndView modelAndView=new ModelAndView("getAllEmps");
		 
		List<Employee> employees=employeeService.findAll();
		modelAndView.addObject("emps",employees);
		return modelAndView;
	}
public ModelAndView saveEmployee() {
	return 
	
}
}
