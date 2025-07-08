package com.fawry.quantumbookstore.exceptions;

public class InvalidShippingSourceException extends Exception {

    public InvalidShippingSourceException() {
        super("Invalid shipping source provided.");
    }
    
}
