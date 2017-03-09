package com.niit.EshoppingBackend1.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
public class User {
	
	/*
	 * private fields;
	 * 
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int userid;
	@NotNull(message="UserName required")
	@Size(min=1,max=50)
	private String username;
	@NotNull(message="Password is required")
	@Size(min=4,max=12)
	private String password;
	@NotNull(message="Name is required")
	@Size(min=4,max=12)
	private String name;
	@NotNull(message="Email is required")
	@Size(min=4,max=12)
	private String email;
	private String phone;
	private String role;
	@Column(name="is_active")
	private boolean active=true;
	
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
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
	@Override
	public String toString() {
		return "User [username=" + username + ", password=" + password + ", name=" + name + ", email=" + email
				+ ", phone=" + phone + ", role=" + role + "]";
	}

	
}
