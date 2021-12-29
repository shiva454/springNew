 package com.dbs.bean;
import java.util.Iterator;
import java.util.Map;



public class MapBean {
	private Map<String, Integer> mapProperties=null;
	public Map<String, Integer> getMapProperties(){
		return mapProperties;

	}
	public void setMapProperties(Map<String, Integer>  mapProperties){
	 this.mapProperties=mapProperties;
		
	}
	public int getResult() {
		Integer temp=0;
		Iterator<Integer> iterator=(Iterator<Integer>)getMapProperties().values().iterator();
		while(iterator.hasNext()) temp=temp+iterator.next();
		return temp.intValue();
	}

}
