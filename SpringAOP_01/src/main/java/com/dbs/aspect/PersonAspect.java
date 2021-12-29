 package com.dbs.aspect;



import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;



@Aspect
@Component
@EnableAspectJAutoProxy




public class PersonAspect {
@Before 
("execution(public * get*())")
public void logBefore(){
System.out.println("This is before  invoking actual BL GETTER method");
}


@After("execution(public * com.dbs.service.PersonService.*())")
public void logAfter(){
System.out.println("This is after getPerson() called");
}




}