package com.mohit.Contact.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.mohit.Contact.constant.AppConstant;
import com.mohit.Contact.entity.Contact;
import com.mohit.Contact.props.AppProps;
import com.mohit.Contact.service.ContactService;

@Controller
public class ContactController{
	
	@Autowired
	private ContactService contactService;

	@Autowired
	private AppProps appProps; 
	
	@GetMapping("/contact")
	public String ContactPage(Model model) {
		
		Contact contact = new Contact();
		
		model.addAttribute("contact", contact);
		
		return AppConstant.CONTACTINFO;
	}
	
	@PostMapping("/saveContact")
	public String saveContact(Contact contact,Model model) {
	
		boolean save = this.contactService.saveContact(contact);
		
		Map<String,String> messages= appProps.getMessages();
		
		if (save) {
			model.addAttribute(AppConstant.SUCCESS,messages.get(AppConstant.SAVE_SUCCESS));
		}
		else {
			model.addAttribute(AppConstant.FAIL,messages.get(AppConstant.SAVE_FAIL));
		}
			
		return AppConstant.CONTACTINFO;
	}
	@GetMapping("viewContacts")
	public String viewAllContact(Model model) {
		
		List<Contact> allContacts = contactService.getAllContacts();
		
		model.addAttribute(AppConstant.CONTACT, allContacts);

		return AppConstant.CONTACT;
	}
	
}
