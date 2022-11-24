package com.laioffer.onlineorder.dao;

import com.laioffer.onlineorder.entity.Customer;
import org.springframework.stereotype.Repository;

/*
@Repository is specific component, but for data access object
 */
@Repository
public class CustomerDao {

    public void signUp(Customer customer) {
    }

    public Customer getCustomer(String email) {
        return new Customer();
    }
}


