package com.javahome.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="Groups")
public class GroupBean {

	@Id
	private int id;
	
	
	private String name;
	
	
	@OneToMany(mappedBy="groupBean")
	private Set<UserGroupBean> userGroupBeans =  new HashSet<UserGroupBean>();


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


	public Set<UserGroupBean> getUserGroupBeans() {
		return userGroupBeans;
	}


	public void setUserGroupBeans(Set<UserGroupBean> userGroupBeans) {
		this.userGroupBeans = userGroupBeans;
	}
	
	
	
}
