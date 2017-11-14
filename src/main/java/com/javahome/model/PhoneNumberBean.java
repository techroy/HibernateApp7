package com.javahome.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="PhoneNumber")
public class PhoneNumberBean {

	@Id
	@Column
	private long phoneNo;
	
	@Column(name="numberType")
	private String phoneType;

	public long getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(long phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getPhoneType() {
		return phoneType;
	}

	public void setPhoneType(String phoneType) {
		this.phoneType = phoneType;
	}

	@Override
	public String toString() {
		return "PhoneNumberBean [phoneNo=" + phoneNo + ", phoneType=" + phoneType + "]";
	}
	
	
	
}
