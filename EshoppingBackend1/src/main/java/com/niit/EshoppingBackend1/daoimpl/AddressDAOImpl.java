package com.niit.EshoppingBackend1.daoimpl;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EshoppingBackend1.dao.AddressDAO;
import com.niit.EshoppingBackend1.dto.Address;

@Repository("addressDAO")
@Transactional
@EnableTransactionManagement
public class AddressDAOImpl implements AddressDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	public boolean add(Address address) {
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().persist(address);
		    return true;	
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
	}

	public boolean update(Address address) {
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().update(address);
			 return true;
		}
	catch(Exception ex)
	{
		ex.printStackTrace();
		 return false;
		
	}
	}

	public String delete(int id) {
		 
			
			try{
				//add the category to the database table
				sessionFactory.getCurrentSession().delete(id);
				return "updated";
			}
			catch(Exception ex)
			{
				ex.printStackTrace();
				return "Error"+ ex;
				
			}
	}

	public List<Address> list() {
     return null;
	}

	public Address get(int addressId) {
		// TODO Auto-generated method stub
		return null;
	}

}
