package com.fawry.quantumbookstore.services.purchaseservice;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.exceptions.*;
import com.fawry.quantumbookstore.items.Item;
import com.fawry.quantumbookstore.items.State;
import com.fawry.quantumbookstore.services.deliveryservice.DeliveryService;

public class PhysicalPurchaseService extends PurchaseService {
    
    public PhysicalPurchaseService(DeliveryService deliveryService) {
        super(deliveryService);
    }

    @Override
    public double purchaseItem(Item item, int quantity, int availableQuantity, Customer customer) throws Exception {
        
        if (item.getItemState() != State.FOR_SALE) {
            throw new ItemNotForSaleException(item);
        }

        
        if (availableQuantity < quantity) {
            throw new OutOfStockException(item, availableQuantity, quantity);
        }

        double totalPrice = item.getPrice() * quantity;

        if (customer.getBalance() < totalPrice) {
            throw new InsufficientBalanceException(customer, totalPrice);
        }

        customer.setBalance(customer.getBalance() - totalPrice);
        this.deliveryService.deliverItem(item, customer);
        return totalPrice;
    }
    
}
