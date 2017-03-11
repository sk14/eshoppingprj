package com.niit.Eshopping.controller;

import org.springframework.binding.message.MessageBuilder;
import org.springframework.binding.message.MessageContext;
import org.springframework.stereotype.Component;

import com.niit.EshoppingBackend1.dto.User;

@Component
public class Demohandler {
 
	public User initFlow(){
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
					"Email").defaultText("Email cannot be Empty").build());
			status = "failure";
		}
		if(user.getPhone()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"phone").defaultText("Phone cannot be Empty").build());
			status = "failure";
		}
		/*if(user.getRole()==null){
			messageContext.addMessage(new MessageBuilder().error().source(
					"Role").defaultText("Role cannot be Empty").build());
			status = "failure";
		}*/
		return status;
	}
}


