package com.fawry.quantumbookstore.services.deliveryservice;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.items.Item;

public interface DeliveryService {
    public void deliverItem(Item item, Customer customer) throws Exception;
}
