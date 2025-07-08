package com.fawry.quantumbookstore.services.deliveryservice;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.items.Item;
import com.fawry.quantumbookstore.items.PaperBook;

public class PhysicalDeliveryService implements DeliveryService {
    @Override
    public void deliverItem(Item item, Customer customer) {
        if(!(item instanceof PaperBook)) {
            throw new IllegalArgumentException("Physical delivery service can only deliver PaperBooks.");
        }
        System.out.println("\nShipping item: " + item.getName() + "\nTo: " + customer.getName() + "\nAddress: " + customer.getAddress());
    }
    
}
