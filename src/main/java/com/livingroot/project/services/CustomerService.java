package com.livingroot.project.services;

import com.livingroot.project.persistance.entity.Customer;
import com.livingroot.project.persistance.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    public void create(Customer customer){
        customerRepository.save(customer);
    }

    public List<Customer> getAll(){
        List<Customer> customers = new ArrayList<>();

        customerRepository.findAll().iterator().forEachRemaining(customers::add);

        return customers;
    }

    public Customer getById(Long id) {
        return customerRepository.findById(id).get();
    }
}
