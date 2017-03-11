package com.niit.Eshopping.controller;

import java.io.Serializable;

import com.niit.EshoppingBackend1.dto.Address;
import com.niit.EshoppingBackend1.dto.User;

public class RegisterModel implements Serializable {
	
	
	private static final long serialVersionUID = -1L;
	
	private User user;
	
	private Address billing,shipping;
	
	public RegisterModel(){
		this.user=new User();
		this.billing= new Address();
		this.shipping= new Address();
		//this.shipping.setBilling(false);
	}
	
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public Address getBilling() {
		return billing;
	}
	public void setBilling(Address billing) {
		this.billing = billing;
	}
	public Address getShipping() {
		return shipping;
	}
	public void setShipping(Address shipping) {
		this.shipping = shipping;
	}
	
	

	
	

}
