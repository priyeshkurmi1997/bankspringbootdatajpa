package com.quinnox.bankmanagementsystem.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.quinnox.bankmanagementsystem.entities.Beneficiary;

public interface BeneficiaryRepository extends JpaRepository<Beneficiary,Integer>{

	public Beneficiary findByBeneficiaryId(int beneficiaryId);

}
