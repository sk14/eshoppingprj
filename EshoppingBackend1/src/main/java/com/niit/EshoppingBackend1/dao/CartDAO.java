package com.niit.EshoppingBackend1.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EshoppingBackend1.dto.Cart;
@Repository("cartDAO")
@Transactional
@EnableTransactionManagement
public interface CartDAO {

	public boolean add(Cart cart);

	public boolean update(Cart cart);

	public boolean delete(Cart cart);

	public List<Cart> list(int id);

	public Cart get(int id);
	
	
}
