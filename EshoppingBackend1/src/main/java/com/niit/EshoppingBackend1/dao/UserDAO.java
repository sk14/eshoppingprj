package com.niit.EshoppingBackend1.dao;

import java.util.List;

import com.niit.EshoppingBackend1.dto.User;

public interface UserDAO {

	public boolean add(User user);

	public boolean update(User user);

	public boolean delete(User user);

	public List<User> list();

	public User get(String username);

}
