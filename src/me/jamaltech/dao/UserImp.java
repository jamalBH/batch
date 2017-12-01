package me.jamaltech.dao;

import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import me.jamaltech.entities.User;
import me.jamaltech.utils.HibernateUtils;

@Repository
public class UserImp implements UserInterf{
	
	 Session session = HibernateUtils.getSessionFactory().openSession();
	 
	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void addUser(User user) {
		session.beginTransaction();
		session.save(user);
		session.getTransaction().commit();
	}

}
