package org.vetkimlik.daoImpl;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import org.vetkimlik.dao.IKisiEkle;
import org.vetkimlik.hibernateutil.HibernateUtil;
import org.vetkimlik.model.Personel;

@Repository
public class KisiEkle implements IKisiEkle{

	@Autowired
	private HibernateUtil hibernateutil;
	
	
	
	public HibernateUtil getHibernateutil() {
		return hibernateutil;
	}



	public void setHibernateutil(HibernateUtil hibernateutil) {
		this.hibernateutil = hibernateutil;
	}



	@Override
	public List<Personel> listele() {
	
		Session session = getHibernateutil().getSessionFactory().openSession();
		Criteria criter = session.createCriteria(Personel.class);
		List<Personel> pers = criter.add(Restrictions.gt("id",2)).list();
		
		
		return pers;
	}


	@Override
	public void kisiekle(Personel personel) {
		Session session = getHibernateutil().getSessionFactory().openSession();
		session.save(personel);
		
		session.close();
		
	}





}
