package com.niit.EshoppingBackend1.dao;

import java.util.List;

import com.niit.EshoppingBackend1.dto.Address;

public interface AddressDAO {

	boolean add(Address address);
	boolean update(Address address);
	String delete(int id);
	List<Address> list();
	
	Address get(int addressId);
	
}
