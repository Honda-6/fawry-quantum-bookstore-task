package com.fawry.quantumbookstore.services.purchaseservice;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.items.Item;
import com.fawry.quantumbookstore.services.deliveryservice.DeliveryService;

public abstract class PurchaseService {
    protected DeliveryService deliveryService;
    public PurchaseService(DeliveryService deliveryService) {
        this.deliveryService = deliveryService;
    }
    public abstract double purchaseItem(Item item, int quantity, int availableQuantity, Customer customer) throws Exception;
}
