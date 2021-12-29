package com.dbs.bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App_01 {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");
		System.out.println("ListBean Result:"+((ListBean)context.getBean("listBean")).getResult());

		System.out.println("SetBean Result:"+((SetBean)context.getBean("setBean")).getResult());
		System.out.println("MapBean Result:"+((MapBean)context.getBean("mapBean")).getResult());

		context.close();

	}

}
