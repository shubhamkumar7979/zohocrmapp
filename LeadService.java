package com.zohocrm.services;

import java.util.List;

import com.zohocrm.entities.Lead;

public interface LeadService {
	
	
	public void saveOneLead(Lead lead);

	public Lead findLeadById(Long id);

	public void deleteLeadById(Long id);

	public List<Lead> getAllLeads();

}
