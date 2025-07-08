package com.fawry.quantumbookstore.exceptions;

import com.fawry.quantumbookstore.items.Item;

public class ItemNotFoundException extends Exception {

    public ItemNotFoundException(Item item) {
        super("Item not found: " + item.getName());
    }
    
}
