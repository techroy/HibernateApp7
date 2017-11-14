package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.javahome.model.AddressBean;
import com.javahome.model.StudentBean;

public class SelectTest1 {

	public static void main(String[] args) {


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =HibernateUtil.getSession(sessionFactory);
		
		
		
		AddressBean addressBean  =(AddressBean)session.get(AddressBean.class, 1);
		
		System.out.println("--------------");
		
		System.out.println(addressBean.getId()+"--"+addressBean.getCity());
		
		System.out.println("------------");
		
		StudentBean studentBean = addressBean.getStudentBean();
		
		System.out.println(studentBean);
		HibernateUtil.close(sessionFactory, session);
		

	}

}
