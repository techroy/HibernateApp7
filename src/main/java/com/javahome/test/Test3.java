package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.UserBean;
import com.javahome.model.VechileBean;

public class Test3 {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session =HibernateUtil.getSession(sessionFactory);
		
		
		UserBean  userBean =  new UserBean();
		
		userBean.setId(3);
		userBean.setName("john");
		
		userBean.setPhoneNumberBeans(null);
		
		VechileBean vechileBean = new VechileBean();
		
		vechileBean.setId(1);
		vechileBean.setName("alto");
		vechileBean.setUserBean(userBean);
		
		VechileBean vechileBean1 = new VechileBean();
		
		vechileBean1.setId(2);
		vechileBean1.setName("Santro");
		vechileBean1.setUserBean(userBean);
		
		Transaction tx = session.beginTransaction();
		
		session.save(vechileBean);
		session.save(vechileBean1);

		tx.commit();
		
		
		HibernateUtil.close(sessionFactory, session);

	}

}
