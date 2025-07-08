package com.fawry.quantumbookstore.services.deliveryservice;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.items.EBook;
import com.fawry.quantumbookstore.items.Item;

public class EmailDeliveryService implements DeliveryService {
    @Override
    public void deliverItem(Item item, Customer customer){
        if(! (item instanceof EBook)) {
            throw new IllegalArgumentException("Email delivery service can only deliver EBooks.");
        }
        if(customer.getEmail() == null || customer.getEmail().isEmpty()) {
            throw new IllegalArgumentException("Customer email is not provided.");
        }
        System.out.println("\nSending email to " + customer.getEmail() + " with item details: " + item.getName());
    }
    
}
