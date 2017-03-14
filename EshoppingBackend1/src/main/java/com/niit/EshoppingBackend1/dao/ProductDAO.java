package com.niit.EshoppingBackend1.dao;

import java.util.List;
import com.niit.EshoppingBackend1.dto.Product;



public interface ProductDAO {
	
	public List <Product> listProduct();
	public Product getById(int id);
	public boolean add(Product product);
	public boolean update(Product product);
	public boolean delete(Product product);

}
