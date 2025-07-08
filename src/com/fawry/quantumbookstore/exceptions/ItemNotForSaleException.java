package com.fawry.quantumbookstore.exceptions;

import com.fawry.quantumbookstore.items.Item;

public class ItemNotForSaleException extends Exception {

    public ItemNotForSaleException(Item item) {
        super("Item: " + item.getName() + " is not for sale.");
    }
    
}
