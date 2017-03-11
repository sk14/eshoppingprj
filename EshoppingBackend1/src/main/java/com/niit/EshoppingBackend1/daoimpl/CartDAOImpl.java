package com.niit.EshoppingBackend1.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.EshoppingBackend1.dao.CartDAO;
import com.niit.EshoppingBackend1.dto.Cart;
import com.niit.EshoppingBackend1.dto.Category;

public class CartDAOImpl implements CartDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(Cart cart) {
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().persist(cart);
		    return true;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public boolean update(Cart cart) {
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().update(cart);
			 return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			 return false;
			
		}
	}

	public boolean delete(Cart cart) {
	
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().delete(cart);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public List<Cart> list(int id) {
     String selectCartId = "FROM Category WHERE id:id";
     
		Query query = sessionFactory.getCurrentSession().createQuery(selectCartId);
		
		query.setParameter("id", id);
		return query.getResultList();
	}

	public Cart get(int id) {
		return sessionFactory.getCurrentSession().get(Cart.class,Integer.valueOf(id));

}
}