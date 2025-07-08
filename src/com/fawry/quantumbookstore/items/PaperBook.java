package com.fawry.quantumbookstore.items;

import java.time.Year;

import com.fawry.quantumbookstore.entities.people.Author;

public class PaperBook extends Book{
    public PaperBook(String id,String isbn, String title, Author author, double price, Year year, State type) {
        super(id,isbn, title, author, price, year, type);
    }
}
