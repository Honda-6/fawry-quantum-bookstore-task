package com.fawry.quantumbookstore.exceptions;

import com.fawry.quantumbookstore.items.Item;

public class OutOfStockException extends Exception {

    public OutOfStockException(Item item, int availableQuantity, int requestedQuntity) {
        super("Not enough items in stock for: " + item.getName() + "\nAvailable quantity: " + availableQuantity + "\nRequested quantity: " + requestedQuntity);
    }
    
}
