package com.quinnox.bankmanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.bankmanagementsystem.dao.CustomerDAO;
import com.quinnox.bankmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;

@Service
public class CustomerServicesImpl implements CustomerServices {

	@Autowired
	private CustomerDAO dao;
	@Override
	public boolean addCustomer(CustomerDTO customer) {
		dao.addCustomer(customer);
		return true;
	}

	@Override
	public List<Customer> findAllCustomers() {
		
		return dao.findAllCustomers();
	}

	@Override
	public boolean updateCustomer(CustomerDTO customer) {

		return dao.updateCustomer(customer);
	}

	@Override
	public boolean deleteCustomer(int customerId) {
		
		return dao.deleteCustomer(customerId);
	}

	@Override
	public Customer getCustomerbyId(int customerId) {
		
		return dao.getCustomerbyId(customerId);
	}

	@Override
	public Customer getCustomerbyUsernamePassword(String username, String password) {
		
		return dao.getCustomerbyUsernamePassword( username, password);
	}

	@Override
	public int customerTransaction(int balance, int accountno, int customerId) {

		return dao.customerTransaction( balance,accountno, customerId);
	}
	

}
