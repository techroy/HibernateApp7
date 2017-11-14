package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.AddressBean;
import com.javahome.model.StudentBean;

public class Test1 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =HibernateUtil.getSession(sessionFactory);
		
		
		StudentBean std = new StudentBean();
		
		std.setId(2);
		std.setName("adam");
		std.setClassName("secondary");
		
		AddressBean addressBean =  new AddressBean();
		
		addressBean.setId(2);
		addressBean.setStreetNo("492");
		addressBean.setCity("hubli");
		
		addressBean.setStudentBean(std);
		
		Transaction tx =session.beginTransaction();
		
		session.save(addressBean);
		
		tx.commit();
		
		HibernateUtil.close(sessionFactory, session);
		
		

	}

}
