package com.javahome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Student")
public class StudentBean {

	@Id
	@Column(name = "sid")
	private int id;

	@Column(name = "sname")
	private String name;

	private String className;

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

	public String getClassName() {
		return className;
	}

	public void setClassName(String className) {
		this.className = className;
	}

	@Override
	public String toString() {
		return "StudentBean [id=" + id + ", name=" + name + ", className=" + className + "]";
	}
	
	

}
