package com.fawry.quantumbookstore.services.purchaseservice;

import com.fawry.quantumbookstore.items.EBook;
import com.fawry.quantumbookstore.items.Item;
import com.fawry.quantumbookstore.items.PaperBook;
import com.fawry.quantumbookstore.services.deliveryservice.EmailDeliveryService;
import com.fawry.quantumbookstore.services.deliveryservice.PhysicalDeliveryService;

public class PurchaseServiceFactory {
    
    public static PurchaseService createPurchaseService(Item item) throws Exception {
        if(item instanceof PaperBook) {
            return new PhysicalPurchaseService(new PhysicalDeliveryService());
        } else if(item instanceof EBook) {
            return new DigitalPurchaseService(new EmailDeliveryService());
        } else {
            throw new IllegalArgumentException("Unsupported item type");
        }
    }
}
