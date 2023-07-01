package com.tangle.service;

import java.util.List;
import com.tangle.model.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.tangle.repositories.CustomerRepo;
@Service
public class CustomerService 
{
 @Autowired
 private CustomerRepo repo;
 
 public void save(Customer customer) {
     repo.save(customer);
 }
 public List<Customer> listAll() {
     return repo.findAll();
  }
 public void delete(Integer cid) {
     repo.delete(repo.findById(cid).get());
 }
 
 public Customer get(Integer cid) {
     return repo.findById(cid).get();
 }
  
 }