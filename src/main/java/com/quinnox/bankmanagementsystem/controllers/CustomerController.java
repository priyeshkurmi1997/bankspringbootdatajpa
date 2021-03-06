package com.quinnox.bankmanagementsystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.quinnox.bankmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankmanagementsystem.dto.ResponseData;
import com.quinnox.bankmanagementsystem.entities.Customer;
import com.quinnox.bankmanagementsystem.services.CustomerServices;

@RestController
//@RequestMapping("customer")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CustomerController {
	
	@Autowired
	private CustomerServices services;
	
	@PostMapping("/customer")
	public String addCustomer(@RequestBody CustomerDTO customer) {
		services.addCustomer(customer);
		return "Customer Added SuccesFully";
	}
	
	@GetMapping("/customers")
	public ResponseData findAllCustomers() {
		ResponseData response = new ResponseData();
		response.setMsg("Customer data Recived Successfully");
		response.setData(services.findAllCustomers());
		return response;
	}
	
	@GetMapping("/customer/CustomerId")
	public ResponseData getCustomerbyId(int customerId) {
		
		ResponseData response=new ResponseData();
		response.setMsg("Customer details recieved succefully");
		response.setData(services.getCustomerbyId(customerId));
		return response;
	}
	
	@GetMapping("/customer/Username-Password")
	public ResponseData getCustomerbyUsrnamePassword(String username,String password) {
		
		ResponseData response =new ResponseData();
		response.setMsg("Username recieved Succesfully");
		response.setData(services.getCustomerbyUsernamePassword(username, password));
		
		return response;
	}
	@GetMapping("/transaction")
	public ResponseData customerTransaction(int balance,int accountno,int customerId)
	{
		ResponseData response =new ResponseData();
		response.setMsg("transaction recieved Succesfully");
		response.setData(services.customerTransaction(balance, accountno,customerId));
		
		return response;
	}
	
	
	
	@PutMapping("/Customer")
	public ResponseData updateCustomer(@RequestBody CustomerDTO customer) {
		
		ResponseData response = new ResponseData();
		response.setMsg("Customer Updated Successfully");
		response.setData(services.updateCustomer(customer));
		return response;
	} 
	
	@DeleteMapping("/customer/CustomerId")
	public ResponseData deleteCustomer( int customerId) {
		
		ResponseData response = new ResponseData();
		response.setMsg("Customer Deleted Successfully");
		response.setData(services.deleteCustomer(customerId));
		return response;
	}

	
	
	

}
