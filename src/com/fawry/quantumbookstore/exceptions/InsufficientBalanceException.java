package com.fawry.quantumbookstore.exceptions;

import com.fawry.quantumbookstore.entities.people.Customer;

public class InsufficientBalanceException extends Exception {

    public InsufficientBalanceException(Customer customer, double requiredAmount) {
        super(customer.getName() + " has insufficient balance. Required: " + requiredAmount + ", Available: " + customer.getBalance());
    }
    
}
