package com.favuur.HibernateDemo;

import org.hibernate.Session;
import org.hibernate.Transaction;

public class AlienDao 
{
	public void saveAlien(Alien alien) {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Transaction tx = session.beginTransaction();
	session.save(alien);
	tx.commit();
	session.close();
	}
	
	public Alien getAlien(int aid)
	{
		Session session = HibernateUtil.getSessionFactory().openSession();
		Alien alien = session.get(Alien.class, aid);
		session.close();
		return alien;
	}
}
