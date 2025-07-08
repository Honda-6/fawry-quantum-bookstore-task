package com.fawry.quantumbookstore.entities.stores;

import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.exceptions.InvalidQuantityException;
import com.fawry.quantumbookstore.exceptions.ItemNotFoundException;
import com.fawry.quantumbookstore.items.Book;
import com.fawry.quantumbookstore.services.purchaseservice.PurchaseService;
import com.fawry.quantumbookstore.services.purchaseservice.PurchaseServiceFactory;

public class Bookstore {
    private String name;
    private Map<Book, Integer> inventory;

    public Bookstore(String name) {
        this.name = name;
        this.inventory = new HashMap<>();
    }
    public String getName() {
        return name;
    }
    public void addBook(Book book, int quantity) throws Exception {
        if (quantity <= 0) {
            throw new InvalidQuantityException(quantity);
        }
        if (inventory.containsKey(book)) {
            inventory.put(book, inventory.get(book) + quantity);
        } else {
            inventory.put(book, quantity);
        }
    }
    public void removeBook(Book book) {
        if(inventory.containsKey(book)) {
            inventory.remove(book);
        } else {
            System.out.println("Book not found in inventory.");
        }
    }
    public List<Book> removeOutdatedBooks(int duration) {
        List<Book> removedBooks = new ArrayList<>();
        int currentYear = java.time.Year.now().getValue();
        for (Map.Entry<Book, Integer> entry : inventory.entrySet()) {
            if(currentYear - entry.getKey().getYear().getValue() >= duration) {
                removedBooks.add(entry.getKey());
            }
        }
        for (Book book : removedBooks) {
            inventory.remove(book);
        }
        return removedBooks;
    }
    public double purchaseBook(Book book, int quantity, Customer customer) throws Exception{
        if (!inventory.containsKey(book)) {
            throw new ItemNotFoundException(book);
        }
        if (quantity <= 0) {
            throw new InvalidQuantityException(quantity);
        }
        PurchaseService purchaseService = PurchaseServiceFactory.createPurchaseService(book);
        double totalPrice = purchaseService.purchaseItem(book, quantity, inventory.get(book), customer);
        this.inventory.put(book, this.inventory.get(book) - quantity);
        if (this.inventory.get(book) == 0) {
            this.inventory.remove(book);
        }
        return totalPrice;
    }
}
