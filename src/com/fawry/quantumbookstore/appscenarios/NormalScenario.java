package com.fawry.quantumbookstore.appscenarios;

import java.time.Year;

import com.fawry.quantumbookstore.entities.people.Author;
import com.fawry.quantumbookstore.entities.people.Customer;
import com.fawry.quantumbookstore.entities.people.Identity;
import com.fawry.quantumbookstore.entities.stores.Bookstore;
import com.fawry.quantumbookstore.items.Book;
import com.fawry.quantumbookstore.items.PaperBook;
import com.fawry.quantumbookstore.items.State;

public class NormalScenario implements AppScenario {

    @Override
    public void runScenario() throws Exception {
        System.out.println("\nRunning Normal Scenario\n=========================\n");
        Bookstore bookstore = new Bookstore("Quantum Bookstore");
        Book paperbook1 = new PaperBook("b1", "1-2-3-4", "Title-1", new Author(new Identity("author1")), 230, Year.of(2002), State.FOR_SALE);
        try {
            bookstore.addBook(paperbook1, 5);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        Customer customer = new Customer("Customer1", "some@email.com", "Grove street, 123",100000);
        try {
            System.out.println("Total price: " + bookstore.purchaseBook(paperbook1, 2, customer));
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        System.out.println("\n==========================\n");
    }
}
