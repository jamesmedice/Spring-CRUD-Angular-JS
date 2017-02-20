package org.simple.angularjs.contact.dao;

import org.simple.angularjs.contact.entity.Contact;
import org.simple.angularjs.contact.service.interfaces.ContactService;
import org.simple.angularjs.contact.util.DateUtil;
import org.springframework.beans.factory.annotation.Autowired;

public class DataSetup {

	@Autowired
	private ContactService contactService;

	public void setup() {
		Contact contact = new Contact();
		contact.setName("Tiago Medice " + DateUtil.getBuildDateTime());
		contact.setPhone("019-91531253");

		contactService.save(contact);
	}

}