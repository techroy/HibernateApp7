package com.javahome.model;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="User")
public class UserBean {

	@Id
	@Column(name="uid")
	private int id;
	
	private String name;

	@OneToMany(targetEntity=PhoneNumberBean.class,cascade=CascadeType.ALL,fetch=FetchType.LAZY)
	@JoinColumn(name="userId",referencedColumnName="uid")
	private Set<PhoneNumberBean> phoneNumberBeans;
	
	@OneToMany(mappedBy="user")
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

	public Set<PhoneNumberBean> getPhoneNumberBeans() {
		return phoneNumberBeans;
	}

	public void setPhoneNumberBeans(Set<PhoneNumberBean> phoneNumberBeans) {
		this.phoneNumberBeans = phoneNumberBeans;
	}

	public Set<UserGroupBean> getUserGroupBeans() {
		return userGroupBeans;
	}

	public void setUserGroupBeans(Set<UserGroupBean> userGroupBeans) {
		this.userGroupBeans = userGroupBeans;
	}
	
	
	
	
}
