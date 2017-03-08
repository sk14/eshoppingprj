package com.niit.EshoppingBackend1.dao;

import java.util.List;

import com.niit.EshoppingBackend1.dto.Category;

public interface CategoryDAO {
	
	/*Category get(int id);
	List<Category> list();
	boolean add(Category category);
	boolean update(Category category);
	
	boolean delete(Category category);
	
	*/
	
	public boolean add(Category category);
	public boolean update(Category category);
	public List<Category> list();
	public boolean delete(Category category);
    public Category get(int id);
    
}
