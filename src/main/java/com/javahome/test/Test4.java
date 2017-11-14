package com.javahome.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.javahome.model.GroupBean;
import com.javahome.model.UserBean;
import com.javahome.model.UserGroupBean;
import com.javahome.model.VechileBean;

public class Test4 {

	public static void main(String[] args) {

		SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
		Session session = HibernateUtil.getSession(sessionFactory);

		UserBean userBean = new UserBean();

		userBean.setId(5);
		userBean.setName("amit");

		userBean.setPhoneNumberBeans(null);

		GroupBean groupBean = new GroupBean();

		groupBean.setId(1);
		groupBean.setName("premium");

		GroupBean groupBean1 = new GroupBean();

		groupBean1.setId(2);
		groupBean1.setName("regular");

		UserGroupBean userGroupBean = new UserGroupBean();

		userGroupBean.setId(1);

		userGroupBean.setUser(userBean);
		
		userGroupBean.setGroupBean(groupBean);

		UserGroupBean userGroupBean1 = new UserGroupBean();

		userGroupBean1.setId(2);

		userGroupBean1.setUser(userBean);

		userGroupBean1.setGroupBean(groupBean1);

		Transaction tx = session.beginTransaction();
		session.save(userGroupBean);

		session.save(userGroupBean1);

		tx.commit();

		HibernateUtil.close(sessionFactory, session);

	}

}
