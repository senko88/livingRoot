package com.livingroot.project.controllers;

import com.livingroot.project.persistance.entity.Customer;
import com.livingroot.project.services.CustomerService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/*
 swagger url http://localhost:8080/swagger-ui.html#/
 */

@Controller
@RequestMapping("/customer")
@Api(value = "user controller")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @PostMapping
    public ResponseEntity<HttpStatus> create(@RequestBody Customer customer) {
        customerService.create(customer);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping
    @ApiOperation("find by id")
    public ResponseEntity<Customer> getById(@RequestParam Long id) {
        return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/{id}")
    @ApiOperation("djfhdj")
    public ResponseEntity<Customer> getsdfkjbdefjhv(@PathVariable Long id) {
        return new ResponseEntity<>(customerService.getById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Customer>> getAll(){
        return new ResponseEntity<>(customerService.getAll(), HttpStatus.OK);
    }
}
