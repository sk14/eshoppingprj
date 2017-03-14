package com.niit.EshoppingBackend1.test;

import static org.junit.Assert.*;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.niit.EshoppingBackend1.dao.CategoryDAO;
import com.niit.EshoppingBackend1.dao.ProductDAO;
import com.niit.EshoppingBackend1.dto.Product;



public class ProductTestCase {
private static AnnotationConfigApplicationContext context;
	
	private static ProductDAO productDAO;
	
	private Product product;
	@BeforeClass
	public static void init()
	{
		context= new AnnotationConfigApplicationContext();
		context.scan("com.niit.EshoppingBackend1");
		context.refresh();
		
		productDAO = (ProductDAO)context.getBean("productDAO");
	}
	
	/*@Test
	public void testAddProduct()
	{
		product= new Product();
		product.setName("OnePlus");
		product.setDescription("Get maximum productivity with silver One plus");
		product.setPrice(12000);
		product.setImageUrl("m13.jpg");
		
        assertEquals("Sccussfully added a product inside the table",true,productDAO.add(product));
	}*/
	
	/*@Test
	public void testGetProduct()
	{
		product= productDAO.getById(1);
		assertEquals("Sccussfully fetched a single product from the table","Gionee Marathon M5",product.getName());
	}*/
	
	/*@Test
	public void testUpdateProduct()
	{
		product= productDAO.getById(5);
	    product.setName("OnePlusTwo");
		assertEquals("Sccussfully updated single product into the table",true,productDAO.update(product));
	}*/
/*	@Test
	public void testDeleteCategory()
	{
		product= productDAO.getById(6);
	   
		assertEquals("Sccussfully deleted single product from the table",true,productDAO.delete(product));
	}*/
	/*@Test
	public void testListProduct()
	{
		 	   
		assertEquals("Sccussfully fetched the list of  from the table",4,productDAO.listProduct().size());
	}
	*/
	@Test
	public void testCRUDProduct()
	{
		product= new Product();
		product.setName("Sony");
		product.setDescription("Get maximum productivity with sony");
		product.setPrice(19000);
		product.setImageUrl("m19.jpg");
		
        assertEquals("Sccussfully added a product inside the table",true,productDAO.add(product));
        product= new Product();
		product.setName("Sonyxx");
		product.setDescription("Getxx maximum productivity with sony");
		product.setPrice(18000);
		product.setImageUrl("m89.jpg");
		
        assertEquals("Sccussfully added a product inside the table",true,productDAO.add(product));
        product= productDAO.getById(2);
	    product.setName("Samsung Note 5");
		assertEquals("Sccussfully updated single product into the table",true,productDAO.update(product));
		
		product= productDAO.getById(44);
		   
		assertEquals("Sccussfully deleted single product from the table",true,productDAO.delete(product));
		
		assertEquals("Sccussfully fetched the list of  from the table",6,productDAO.listProduct().size());
		
		
        
		
		
	}
}
