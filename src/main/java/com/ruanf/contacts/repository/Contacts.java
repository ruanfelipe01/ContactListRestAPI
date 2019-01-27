package com.ruanf.contacts.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ruanf.contacts.model.Contact;

public interface Contacts extends JpaRepository<Contact, Long> {

}
