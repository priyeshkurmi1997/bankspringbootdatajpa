package com.quinnox.bankmanagementsystem.dao;

import java.util.List;

import com.quinnox.bankmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;


public interface CustomerDAO {

    public boolean addCustomer(CustomerDTO customer);
	
	public List<Customer> findAllCustomers();
	
	public boolean updateCustomer(CustomerDTO customer);
	
	public Customer getCustomerbyId(int customerId);
	
	public Customer getCustomerbyUsernamePassword(String username,String password);
	
	public boolean deleteCustomer(int customerId);
	
	public int customerTransaction(int balance,int accountno,int customerId);
	
}
