package com.dbs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.dbs.beans.Point;

public class App_01 {
	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
		Point pa=(Point)ctxt.getBean("pa");
		System.out.println(pa);
		
	}

}
