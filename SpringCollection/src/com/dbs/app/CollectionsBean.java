 package com.dbs.app;



import com.dbs.bean.Collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;



public class CollectionsBean {
public static void main(String []args){
ApplicationContext ctxt = new FileSystemXmlApplicationContext("spring.xml");



Collections collections = (Collections) ctxt.getBean("ListBean");
System.out.println(collections.getList());
System.out.println(collections.getSet());
System.out.println(collections.getMap());



}
}