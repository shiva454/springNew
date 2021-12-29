package com.dbs.beans;

import org.springframework.orm.jpa.JpaTransactionManager;
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean;
import org.springframework.orm.jpa.vendor.HibernateJpaDialect;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	int id;
	String name;
	int deptno;

	JpaTransactionManager a;
	 

	public Employee() {
		super();
	}

	public Employee(int id, String name, int deptno) {
		super();
		this.id = id;
		this.name = name;
		this.deptno = deptno;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", deptno=" + deptno + "]";
	}

}