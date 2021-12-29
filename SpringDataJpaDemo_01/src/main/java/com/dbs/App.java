package com.dbs;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
    	EmployeeService employeeService =ctxt.getBean(EmployeeService.class);
    	EmployeeService employee=new Employee(101,"Shiva",20);
    	
    	employeeService.save(employee);
        System.out.println( "Hello World!" );
    }
}
