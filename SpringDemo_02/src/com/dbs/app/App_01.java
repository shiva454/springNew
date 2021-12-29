 package com.dbs.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
 
import com.dbs.beans.MessageRenderer;

public class App_01 {
	public static void main(String[] args) {
		ApplicationContext ctxt=new ClassPathXmlApplicationContext("spring.xml");
		MessageRenderer messagerenderer=(MessageRenderer)ctxt.getBean("messageRenderer");
		//ConsoleMessageRenderer messageRenderer= (MessageRenderer)ctxt.getBean("messageRenderer");
		messageRenderer.render();
	}

}
