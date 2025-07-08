package com.fawry.quantumbookstore.exceptions;

import com.fawry.quantumbookstore.entities.people.Customer;

public class InvalidEmailException extends Exception {

    public InvalidEmailException(Customer customer) {
        super(customer.getName() + " has an invalid email");
    }

}
