package org.ramesh.gudiya.contact.service;

import java.util.List;

import org.ramesh.gudiya.contact.form.Contact;

public interface ContactService {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
