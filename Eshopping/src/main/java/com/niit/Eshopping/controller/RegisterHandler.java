package com.niit.Eshopping.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.EshoppingBackend1.dao.UserDAO;
import com.niit.EshoppingBackend1.dto.Address;
import com.niit.EshoppingBackend1.dto.User;

@Component
public class RegisterHandler {

	@Autowired
	
	private UserDAO userDAO;
	
	
	
	public User initFlow(){
		//return  new RegisterModel();
		return new User();
		
	}
	
 
	public String validateDetails(User user,MessageContext messageContext){
		String status = "success";
		if(user.getUsername().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"username").defaultText("Username cannot be Empty").build());
			status = "failure";
		}
		if(user.getPassword().isEmpty()){
			messageContext.addMessage(new MessageBuilder().error().source(
					"password").defaultText("password cannot be Empty").build());
			status = "failure";
		}
		if(user.getName()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"name").defaultText("Name cannot be Empty").build());
			status = "failure";
		}
		if(user.getEmail()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(user.getPhone()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phone").defaultText("Phone cannot be Empty").build());
			status = "failure";
		}
		if(user.getRole()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"role").defaultText("Role cannot be Empty").build());
			status = "failure";
		}
		return status;
	}
	
	public void saveRegistrationDetails(User user) {
	
		System.out.println("inside method1");
		boolean  status;
		 try
		 {
			 System.out.println("inside method2");
		   userDAO.add(user);
		   System.out.println(" calls userdao and updates the same");
		   status = true;
		 }
		 catch(Exception ex)
		 {
			 status = false;
			 System.out.println(ex);
		 }
		/*User user = registerModel.getUser();
		// save the user
		userDAO.add(user);
		//Address billing = registerModel.getBilling();
		
		// set the user 
		//billing.setUser(user);
		
		// save the billing address
		//userDAO.addUserAddress(billing);
		
		// if shipping is not same as billing
		/*if(!billing.isShipping()) {
		Address shipping = registerModel.getShipping();
		// set the user for shipping
		shipping.setUser(user);
		// save the shipping address
		userDAO.addUserAddress(shipping);
		}*/
		
		
		
		// if user is not supplier
		/*if(user.getRole().equals("CUSTOMER")) {
		Cart cart = new Cart();
		// set the user
		cart.setUser(user);
		// save the cart
		userDAO.addUserCart(cart);
		}*/
		}
}
