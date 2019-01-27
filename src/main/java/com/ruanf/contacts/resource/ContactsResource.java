package com.ruanf.contacts.resource;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ruanf.contacts.model.Contact;
import com.ruanf.contacts.repository.Contacts;

@RestController
@RequestMapping("/contacts")
public class ContactsResource {

	@Autowired
	private Contacts contacts;

	@PostMapping
	public Contact add(@Valid @RequestBody Contact contact) {
		return contacts.save(contact);
	}

	@GetMapping
	public List<Contact> list() {
		return contacts.findAll();
	}

	@GetMapping("/{id}")
	public ResponseEntity<Contact> search(@PathVariable Long id) {
		Contact contact = contacts.findOne(id);

		if (contact == null) {
			return ResponseEntity.notFound().build();
		}

		return ResponseEntity.ok(contact);
	}

	@PutMapping("/{id}")
	public ResponseEntity<Contact> update(@PathVariable Long id, 
			@Valid @RequestBody Contact contact) {
		Contact existingContact = contacts.findOne(id);

		if (existingContact == null) {
			return ResponseEntity.notFound().build();
		}

		BeanUtils.copyProperties(contact, existingContact, "id");

		existingContact = contacts.save(existingContact);

		return ResponseEntity.ok(existingContact);
	}

	@DeleteMapping("/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		Contact contact = contacts.findOne(id);

		if (contact == null) {
			return ResponseEntity.notFound().build();
		}

		contacts.delete(contact);

		return ResponseEntity.noContent().build();
	}
}











