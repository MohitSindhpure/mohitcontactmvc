package com.mohit.Contact.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mohit.Contact.entity.Contact;
import com.mohit.Contact.service.ContactService;

@Controller
public class ViewContactController {

	@Autowired
	private ContactService contactService;
	
	@GetMapping("/edit")
	public String editContact(@RequestParam("contactid")Integer contactid,Model model) {
	
		Contact contact = contactService.getUpdateContactById(contactid);
		model.addAttribute("contact",contact);
		
		return "contactinfo";		
	}
	
	@GetMapping("/delete")
	public String deleteContact(@RequestParam("contactid")Integer contactid,Model model) {
		
		contactService.getDeleteContactById(contactid);
		return "redirect:viewContacts";
		
	}
}
