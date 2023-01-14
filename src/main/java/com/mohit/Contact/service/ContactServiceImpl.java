package com.mohit.Contact.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mohit.Contact.constant.AppConstant;
import com.mohit.Contact.entity.Contact;
import com.mohit.Contact.repository.ContactRepository;
@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactRepository;

	@Override
	public boolean saveContact(Contact contact) {

		contact.setIsactive(AppConstant.YES);
		Contact save = this.contactRepository.save(contact);
		
		if (save != null && save.getContactid() !=null) {
			System.out.println(save);
			return true;
		}
		else {
			return false;	
		}
		
	}

	@Override
	public List<Contact> getAllContacts() {
		List<Contact> findAll = contactRepository.findAll();
		return findAll;
	}

	@Override
	public Contact getUpdateContactById(Integer contactid) {
		Optional<Contact> findById = contactRepository.findById(contactid);
		
		if (findById.isPresent()) {
			
			return findById.get();
		}
		else {
			return null;	
		}
		
	}

	@Override
	public boolean getDeleteContactById(Integer contactid) {

		Optional<Contact> findById = contactRepository.findById(contactid);
		if (findById.isPresent()) {
			Contact contact = findById.get();
			contactRepository.delete(contact);
			return true;
		}
		return false;
	}
	


}
