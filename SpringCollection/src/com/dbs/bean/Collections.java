 package com.dbs.bean;



import java.util.List;
import java.util.Map;
import java.util.Set;



public class Collections {
List<String> list;
Set<String> set;
Map<Integer,String> map;




public List getList() {
return list;
}



public void setList(List list) {
this.list = list;
}



public Set getSet() {
return set;
}



public void setSet(Set set) {
this.set = set;
}



public Map<Integer, String> getMap() {
return map;
}



public void setMap(Map<Integer, String> map) {
this.map = map;
}
}