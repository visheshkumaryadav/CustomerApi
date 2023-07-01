package com.tangle.controller;
import com.tangle.model.Customer;
import com.tangle.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.NoSuchElementException;
@RestController
@CrossOrigin(origins = "*")
public class controller {
    @Autowired
    private CustomerService service;
    @PostMapping("/save")
    public void add(@RequestBody Customer customer) {
        service.save(customer);
    }
    @GetMapping("/read")
    public List<Customer> list() {
        return service.listAll();
    }
    @DeleteMapping("/read/{cid}")
    public void delete(@PathVariable Integer cid) {
        service.delete(cid);
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<?> update(@RequestBody Customer customer, @PathVariable Integer id) {
        try {
            Customer existCustomer = service.get(id);
            existCustomer.setName(customer.getName());
            service.save(existCustomer);
            existCustomer.setAge(customer.getAge());
            service.save(existCustomer);
            existCustomer.setEducation(customer.getEducation());
            service.save(existCustomer);
            existCustomer.setAddress(customer.getAddress());
            service.save(existCustomer);
            return new ResponseEntity<>(HttpStatus.OK);
        } catch (NoSuchElementException e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }
}
