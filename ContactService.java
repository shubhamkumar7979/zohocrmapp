package com.zohocrm.services;

import java.util.List;


//import java.util.List;

//import javax.swing.text.AbstractDocument.Content;

import com.zohocrm.entities.Contact;

public interface ContactService {
	
	public void saveContact(Contact contact);

	public List<Contact> getAllContacts();

	public Contact getContactById(long id);



}
