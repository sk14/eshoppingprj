package com.niit.EshoppingBackend1.dto;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
@Entity
public class Cart implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8696961903109270296L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@OneToOne(cascade = CascadeType.PERSIST)
	private User user;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy="cart")
	private Set<CartItem> cartItems=new HashSet<CartItem>();
	
	private int cartItemsCount;
	private int totalitemsvalue;
	private double grandTotal;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<CartItem> getCartItems() {
		return cartItems;
	}

	public void setCartItems(Set<CartItem> cartItems) {
		this.cartItems = cartItems;
	}

	public int getCartItemsCount() {
		return cartItemsCount;
	}

	public void setCartItemsCount(int cartItemsCount) {
		this.cartItemsCount = cartItemsCount;
	}

	public double getGrandTotal() {
		return grandTotal;
	}

	public void setGrandTotal(double grandTotal) {
		this.grandTotal = grandTotal;
	}
	public int getTotalitemsvalue() {
		return totalitemsvalue;
	}

	public void setTotalitemsvalue(int totalitemsvalue) {
		this.totalitemsvalue = totalitemsvalue;
	}
	@Override
	public String toString() {
		return "Cart [id=" + id + ", cartItemsCount=" + cartItemsCount + ", grandTotal=" + grandTotal + "]";
	}
	
	
}
