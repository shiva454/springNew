 package com.dbs.bean;
import java.util.Iterator;
import java.util.Set;



public class SetBean {
	private Set<Integer> setProperties=null;
	public Set<Integer> getSetProperties(){
		return setProperties;
		
	}
	public void setSetProperties(Set<Integer>  setProperties){
	 this.setProperties=setProperties;
		
	}
	public int getResult() {
		Integer temp=0;
		Iterator<Integer> iterator=setProperties.iterator();
		while(iterator.hasNext()) temp=temp+iterator.next();
		return temp.intValue();
	}

}
