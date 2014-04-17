package org.ramesh.gudiya.contact.util;

import java.util.List;

import org.ramesh.gudiya.contact.form.Contact;

public class ExcelUtil {

	public  static void exportToExcel(List<Contact> contactList){
		for(Contact contact : contactList){
			
			System.out.println(contact);		
		}
		
	}
}
