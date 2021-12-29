package com.dbs.bean;
import java.util.Iterator;
import java.util.List;



public class ListBean {
	private List<Integer> listProperties=null;
	public List<Integer> getListProperties(){
		return listProperties;
		
	}
	public void setListProperties(List<Integer>  listProperties){
	 this.listProperties=listProperties;
		
	}
	public int getResult() {
		Integer temp=0;
		Iterator<Integer> iterator=getListProperties().iterator();
		while(iterator.hasNext()) temp=temp+iterator.next();
		return temp.intValue();
	}

}
