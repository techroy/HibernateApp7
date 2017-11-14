package com.javahome.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.javahome.model.UserBean;

@Entity
@Table(name = "UserGroups")
public class UserGroupBean {

	@Id
	@Column(name="user_group_id")
	private int id;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="uid")
	private UserBean user;

	@ManyToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="gid")
	private GroupBean groupBean;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public UserBean getUser() {
		return user;
	}

	public void setUser(UserBean user) {
		this.user = user;
	}

	public GroupBean getGroupBean() {
		return groupBean;
	}

	public void setGroupBean(GroupBean groupBean) {
		this.groupBean = groupBean;
	}
	
	
}
