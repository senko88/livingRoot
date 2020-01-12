package com.livingroot.project.services;

import com.livingroot.project.persistance.entity.Contact;
import com.livingroot.project.persistance.entity.Customer;
import com.livingroot.project.persistance.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class DataLoader {

    @Autowired
    private CustomerRepository customerRepository;

    @PostConstruct
    public void init(){
        Contact contact = new Contact();
        contact.setName("name");
        contact.setEmail("email");
        contact.setPhone("phone");
        contact.setAddress("address");

        Customer customer = new Customer();
        customer.setContact(contact);

        customerRepository.save(customer);

         contact = new Contact();
        contact.setName("kdsufgh");
        contact.setEmail("sdfdsf");
        contact.setPhone("sfd");
        contact.setAddress("sfdf");

         customer = new Customer();
        customer.setContact(contact);

        customerRepository.save(customer);


    }
}
