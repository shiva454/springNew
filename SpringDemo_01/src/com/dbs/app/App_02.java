 package com.dbs.app;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dbs.beans.Triangle;

public class App_02 {
	public static void main(String[] args)
	{
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
        Triangle triangle = (Triangle)ctxt.getBean("triangle");	
        System.out.print(triangle);
        
	}

}
