package com.livingroot.project.persistance.repository;

import com.livingroot.project.persistance.entity.Contact;
import com.livingroot.project.persistance.entity.Customer;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {

    @Query(value = "select c from Customer c where c.contact = :contact")
    Customer findByContact(@Param(value = "contact") Contact contact);
}
