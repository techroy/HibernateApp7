package com.javahome.test;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.AddressBean;
import com.javahome.model.PhoneNumberBean;
import com.javahome.model.StudentBean;
import com.javahome.model.UserBean;

public class Test2 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =HibernateUtil.getSession(sessionFactory);
		
		UserBean  userBean =  new UserBean();
		
		userBean.setId(1);
		userBean.setName("max");

		
		PhoneNumberBean phoneNumberBean = new PhoneNumberBean();
		
		phoneNumberBean.setPhoneNo(12345);
		phoneNumberBean.setPhoneType("mobile");
		

		PhoneNumberBean phoneNumberBean1 = new PhoneNumberBean();
		
		phoneNumberBean1.setPhoneNo(23456);
		phoneNumberBean1.setPhoneType("phone");

		Set<PhoneNumberBean> phoneNumberBeans =  new HashSet<PhoneNumberBean>();
		
		phoneNumberBeans.add(phoneNumberBean);
		phoneNumberBeans.add(phoneNumberBean1);
		
		userBean.setPhoneNumberBeans(phoneNumberBeans);
		
		Transaction tx =session.beginTransaction();
		
		session.save(userBean);
		
		tx.commit();
		
		HibernateUtil.close(sessionFactory, session);
		
		

	}

}
