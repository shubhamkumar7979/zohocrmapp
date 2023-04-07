package com.zohocrm.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zohocrm.entities.Contact;
import com.zohocrm.services.ContactService;

@Controller
public class ContactController {
	
	
	private ContactService contactService;
	

	public ContactController(ContactService contactService) {
		super();
		this.contactService = contactService;
	}


	@RequestMapping("/listallcontacts") 
	public String listAllLead(Model model) {
		List<Contact> contents = contactService.getAllContacts();
		model.addAttribute("contents", contents);
		return"list_contacts";
	}
}
