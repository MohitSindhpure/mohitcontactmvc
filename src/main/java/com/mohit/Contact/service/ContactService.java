package com.mohit.Contact.service;

import java.util.List;

import com.mohit.Contact.entity.Contact;

public interface ContactService {

	public boolean saveContact(Contact contact);
	
	public List<Contact> getAllContacts();
	
	public Contact getUpdateContactById(Integer contactid);
	
	public boolean getDeleteContactById(Integer contactid);
}
