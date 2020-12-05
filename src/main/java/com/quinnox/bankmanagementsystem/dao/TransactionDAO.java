package com.quinnox.bankmanagementsystem.dao;

import java.util.List;

import com.quinnox.bankmanagementsystem.dto.CustomerDTO;
import com.quinnox.bankmanagementsystem.dto.TransactionDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;
import com.quinnox.bankmanagementsystem.entities.Transactions;

public interface TransactionDAO {
	
//	public int debitAmount(int customerId,String accountno,int debit);
//	
//	public int creditAmount(int customerId,String accountno,int credit);
//	//get all,getallbyId and addtransaction
//	
	
	 public boolean addTransaction(TransactionDTO transaction);
		
		public List<Transactions> findAllTransactions();
		
	
		
		public List<Transactions> getTransactionbyId(int customerId);
	
	
	
}
