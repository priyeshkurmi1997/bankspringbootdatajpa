package com.quinnox.bankmanagementsystem.services;

import java.util.List;

import com.quinnox.bankmanagementsystem.dto.TransactionDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;
import com.quinnox.bankmanagementsystem.entities.Transactions;

public interface TransactionService {
	
	 public boolean addTransaction(TransactionDTO transaction);
		
		public List<Transactions> findAllTransactions();
		
	
		
		public List<Transactions> getTransactionbyId(int customerId);
	
	
}
