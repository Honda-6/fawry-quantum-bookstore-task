package com.fawry.quantumbookstore.exceptions;

public class InvalidQuantityException extends Exception {

    public InvalidQuantityException(int quantity) {
        super("Invalid quantity provided: " + quantity + ".\nQuantity must be greater than zero.");
    }
    
}
