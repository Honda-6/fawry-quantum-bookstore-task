package com.fawry.quantumbookstore.appscenarios;

import java.time.Year;
import java.util.List;

import com.fawry.quantumbookstore.entities.people.Author;
import com.fawry.quantumbookstore.entities.people.Identity;
import com.fawry.quantumbookstore.entities.stores.Bookstore;
import com.fawry.quantumbookstore.items.Book;
import com.fawry.quantumbookstore.items.EBook;
import com.fawry.quantumbookstore.items.PaperBook;
import com.fawry.quantumbookstore.items.State;

public class RemovingOutdatedBooksScenario  implements AppScenario {

    @Override
    public void runScenario() throws Exception {
        System.out.println("\nRunning Removing Outdated Books Scenario\n========================================================\n");
        Bookstore bookstore = new Bookstore("Quantum Bookstore");
        Book paperbook1 = new PaperBook("b1", "1-2-3-4", "Title-1", new Author(new Identity("author1")), 230, Year.of(2002), State.FOR_SALE);
        try {
            bookstore.addBook(paperbook1, 5);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
        Book eBook1 = new EBook("b2", "5-6-7-8", "Title-2", new Author(new Identity("author2")), 100, Year.of(2020), State.FOR_SALE,"PDF", 1.5);
        try{
            bookstore.addBook(eBook1, 4);
        }
        catch (Exception e) {
            System.err.println(e.getMessage());
        }
        List<Book> removedBooks = bookstore.removeOutdatedBooks(10);
        System.out.println("Removed outdated books by " + 10 + " years:");
        for(var book : removedBooks) {
            System.out.println(book.getName() + " published in " + book.getYear());
        }        
        System.out.println("\n==========================\n");
    }
    
}
