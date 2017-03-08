package com.niit.EshoppingBackend1.dao;

import java.util.List;

import com.niit.EshoppingBackend1.dto.Product;



public interface ProductDAO {
	
	public List <Product> listProduct();
	public Product getById(int id);

}
