package com.example.customer.controller;

import com.example.customer.DAO.CustomerDAO;
import com.example.customer.model.Customer;
import com.example.customer.model.Customer1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class CustomerController {

    @Autowired
    CustomerDAO customerDAO;

    @PostMapping("/register")
    public Customer createCustomer(@RequestBody Customer customer){
        Customer1 customer1 = new Customer1();
        customer1.setCustomer_name(customer.getCustomerName());
        customer1.setPassword(customer.getPassword());
        customer1.setEmail_id(customer.getEmail_id());

        customerDAO.insertValues(customer1);
        System.out.println(customer);
        return customer;
    }
}
