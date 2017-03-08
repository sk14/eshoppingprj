package com.niit.EshoppingBackend1.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EshoppingBackend1.dao.UserDAO;
import com.niit.EshoppingBackend1.dto.Category;
import com.niit.EshoppingBackend1.dto.User;



@Repository("userDAO")
@Transactional
@EnableTransactionManagement
public class UserDAOImpl implements UserDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(User user) {
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().persist(user);
		    return true;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public boolean update(User user) {
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().update(user);
			 return true;
		}
	catch(Exception ex)
	{
		ex.printStackTrace();
		 return false;
		
	}
	}

	public boolean delete(User user) {
           user.isActive();
		
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().update(user);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public List<User> list() {
     String selectActiveUser = "FROM User WHERE active = :active";
		
		Query query = sessionFactory.getCurrentSession().createQuery(selectActiveUser);
		
		query.setParameter("active", true);
		return query.getResultList();
	}

	public User get(String username) {
		return sessionFactory.getCurrentSession().get(User.class,username);
		
	}

}
