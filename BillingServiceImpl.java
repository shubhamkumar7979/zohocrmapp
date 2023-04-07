package com.zohocrm.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zohocrm.entities.Billing;
import com.zohocrm.repository.BillingRepository;

@Service
public class BillingServiceImpl implements BillingService {
	
	@Autowired
	private BillingRepository BillingRepo;

	@Override
	public void saveOneBilling(Billing billling) {
		BillingRepo.save(billling);


	}
	
	@Override
	public List<Billing> getAllBillings() {
		List<Billing> billings =BillingRepo.findAll();
		return billings;
	}

}
