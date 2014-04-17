package org.ramesh.gudiya.contact.dao;

import java.util.List;

import org.ramesh.gudiya.contact.form.Contact;

public interface ContactDAO {
	
	public void addContact(Contact contact);
	public List<Contact> listContact();
	public void removeContact(Integer id);
}
