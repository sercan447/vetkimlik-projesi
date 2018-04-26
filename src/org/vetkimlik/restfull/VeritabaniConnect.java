package org.vetkimlik.restfull;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class VeritabaniConnect {
	
	public static SessionFactory sessionFactory;
	
	public static Session  baglanti() {
		
		sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		
		return session;
		
	}
	
}
