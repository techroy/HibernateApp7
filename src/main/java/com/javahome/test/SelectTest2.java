package com.javahome.test;

import java.util.Iterator;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import com.javahome.model.AddressBean;
import com.javahome.model.PhoneNumberBean;
import com.javahome.model.StudentBean;
import com.javahome.model.UserBean;

public class SelectTest2 {

	public static void main(String[] args) {


		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =HibernateUtil.getSession(sessionFactory);
		
		UserBean userBean = (UserBean)session.get(UserBean.class, 1);
		
		System.out.println(userBean.getId()+"--"+userBean.getName());
		
		
		System.out.println("---------------");
		
		Set<PhoneNumberBean> phoneNumberBeans = userBean.getPhoneNumberBeans();
		
		Iterator<PhoneNumberBean> phIterator= phoneNumberBeans.iterator();
		
		while(phIterator.hasNext())
		{
			PhoneNumberBean phoneNumberBean = phIterator.next();
			
			System.out.println(phoneNumberBean);
			
			
		}
		
		HibernateUtil.close(sessionFactory, session);
		

	}

}
