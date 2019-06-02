package com.grokonez.CustomerRegistration.repo;

import com.grokonez.CustomerRegistration.Models.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface CustomerRepsitory extends CrudRepository<Customer, Long> {
    List<Customer> findByAge(int age);
}
