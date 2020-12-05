package com.quinnox.bankmanagementsystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.quinnox.bankmanagementsystem.dao.TransactionDAO;
import com.quinnox.bankmanagementsystem.dto.TransactionDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;
import com.quinnox.bankmanagementsystem.entities.Transactions;

@Service
public class TransactionServiceImpl implements TransactionService {
	
	@Autowired
	private TransactionDAO dao;

	@Override
	public boolean addTransaction(TransactionDTO transaction) {
		
		return dao.addTransaction(transaction);
	}

	@Override
	public List<Transactions> findAllTransactions() {
	
		return dao.findAllTransactions();
	}

	@Override
	public List<Transactions> getTransactionbyId(int customerId) {
		
		return dao.getTransactionbyId(customerId);
	}
	



}
