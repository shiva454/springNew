package com.dbs.Log4jMaven_01;
  
import org.apache.log4j.Logger;

public class LogDemo {
  	static Logger log=Logger.getLogger(LogDemo.class);
	public static void main(String[] args) {
		for(int c=0;c<20;c++)
		{
			System.out.println("---->"+c);
			
		
		if(c % 3 ==0)
		{
		log.debug("Dubug message -->"+c);	
		}
		if(c%4==0)
		{
			log.info("Info message -->"+c);
		}
		}
	}
}


