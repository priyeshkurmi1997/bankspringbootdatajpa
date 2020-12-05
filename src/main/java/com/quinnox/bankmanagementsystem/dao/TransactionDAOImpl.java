package com.quinnox.bankmanagementsystem.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.quinnox.bankmanagementsystem.dto.TransactionDTO;
import com.quinnox.bankmanagementsystem.entities.Customer;
import com.quinnox.bankmanagementsystem.entities.Transactions;

@Repository
public class TransactionDAOImpl implements TransactionDAO {

	@Autowired
	EntityManager manager1;

	@Override
	@Transactional
	public boolean addTransaction(TransactionDTO transaction) {
		Transactions transaction1 = new Transactions();
		BeanUtils.copyProperties(transaction, transaction1);
		manager1.persist(transaction1);
		return true;
	
	}

	@Override
	public List<Transactions> findAllTransactions() {
		TypedQuery<Transactions> query =  manager1.createQuery("from Transactions", Transactions.class);
		return query.getResultList();
		
	}

	@Override
	public List<Transactions> getTransactionbyId(int customerId) {
		TypedQuery<Transactions> query =  manager1.createQuery("from Transactions where customer_id='"+customerId+"'", Transactions.class);
		
		return query.getResultList();
	}
	
	
}
