package org.vetkimlik.hibernateutil;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class HibernateUtil {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public HibernateUtil() {}
	

	public HibernateUtil(SessionFactory sessionFactory) {
		
		this.sessionFactory = sessionFactory;
	}


	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	
	
	
}
