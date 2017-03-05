package com.niit.EshoppingBackend1.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.EshoppingBackend1.dao.CategoryDAO;
import com.niit.EshoppingBackend1.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	

	
	private static List<Category> categories=new ArrayList<Category>();
	
	static{
	
		Category category=new Category();
		// adding products
				category.setId(1);
				category.setName("Mobile");
				category.setDescription(" Latest Smart phones with high end features");
				category.setImageURL("12.jpg");
				categories.add(category);
				
			  category=new Category();
				category.setId(2);
				category.setName("Laptop");
				category.setDescription(" Latest laptops with high end features");
				category.setImageURL("14.jpg");
				categories.add(category);
				
			 category=new Category();
				category.setId(3);
				category.setName("Television");
				category.setDescription(" Latest TV with high end features");
				category.setImageURL("15.jpg");
				categories.add(category);
	}
	
	
	
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}



	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category: categories)
		{
			if(category.getId()==id) return category;
		}
		
		return null;
	}


    @Transactional
	public boolean add(Category category) {
	
		try{
			//add the category to the database table
			sessionFactory.getCurrentSession().persist(category);
			return true;
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
			return false;
			
		}
		
	}



	public boolean update(Category category) {
		// 	
		return false;
	}



	public boolean delete(Category category) {
		// TODO Auto-generated method stub
		return false;
	}

}
