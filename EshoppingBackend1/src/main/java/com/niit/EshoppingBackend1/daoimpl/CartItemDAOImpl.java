package com.niit.EshoppingBackend1.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;

import com.niit.EshoppingBackend1.dao.CartItemDAO;
import com.niit.EshoppingBackend1.dto.Cart;
import com.niit.EshoppingBackend1.dto.CartItem;

public class CartItemDAOImpl implements CartItemDAO {

	
	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(CartItem cartItem) {
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().persist(cartItem);
		    return true;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public boolean update(CartItem cartItem) {
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().update(cartItem);
			 return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			 return false;
			
		}
	}

	public boolean delete(CartItem cartItem) {
		try{
			//add the cart to the database table
			sessionFactory.getCurrentSession().delete(cartItem);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public List<CartItem> list(int id) {
		String selectCartItemId = "FROM CartItem WHERE id:id";
	     
		Query query = sessionFactory.getCurrentSession().createQuery(selectCartItemId);
		
		query.setParameter("id", id);
		return query.getResultList();
	}

	public CartItem get(int id) {
		return sessionFactory.getCurrentSession().get(CartItem.class,Integer.valueOf(id));
	}

}
