package com.dbs.service;
import org.springframework.stereotype.Component;
import com.dbs.beans.Person;

@Component

public class PersonService {
public Person getPerson() {
	System.out.println("generating a person object to return");
	Person person=new Person(101,"Shiva","shivateja26@gmail.com");
	return person;
}
public String getHello() {
	return "Hello World!!";
	
}
}
