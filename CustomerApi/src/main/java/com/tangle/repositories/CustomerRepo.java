package com.tangle.repositories;

import com.tangle.model.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
public interface CustomerRepo extends JpaRepository<Customer, Integer>
{

}
