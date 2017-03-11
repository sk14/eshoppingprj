package com.niit.EshoppingBackend1.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


@Entity
public class User implements Serializable {
	
	private static final long serialVersionUID = 4657462015039726030L;
	
	/*
	 * private fields;
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
	private String username;
	private String password;
	private String name;
	private String email;
	private String phone;
	private String role ;
	
	private boolean enabled=true;
	
	

	@OneToMany(mappedBy="user", cascade=CascadeType.ALL)
	private Collection<Address> address=new ArrayList<Address>();
	
	
	public Collection<Address> getAddress() {
		return address;
	}
	public void setAddress(Collection<Address> address) {
		this.address = address;
	}
	/*public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}*/
	public int getUserid() {
		return userid;
	}
	public void setUserid(int userid) {
		this.userid = userid;
	}
	
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
	public boolean isEnabled() {
		return enabled;
	}
	public void setEnabled(boolean enabled) {
		this.enabled = enabled;
	}

	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", role=" + role + "]";
	}

	
}
