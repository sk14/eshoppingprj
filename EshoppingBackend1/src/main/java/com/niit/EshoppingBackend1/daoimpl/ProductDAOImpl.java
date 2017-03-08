package com.niit.EshoppingBackend1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EshoppingBackend1.dao.ProductDAO;
import com.niit.EshoppingBackend1.dto.Product;


@Transactional
public class ProductDAOImpl implements ProductDAO {

	@Autowired
	private SessionFactory sessionFactory;
	
	@Transactional
	public List<Product> listProduct() {
		return sessionFactory.getCurrentSession().createQuery("from Product").list();
	}

	public Product getById(int id) {
		List<Product> products = new ArrayList<Product>();
		products = listProduct();
		return products.get(id);
	}

}
