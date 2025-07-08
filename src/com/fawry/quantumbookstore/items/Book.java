package com.fawry.quantumbookstore.items;

import java.time.Year;
import java.util.Objects;

import com.fawry.quantumbookstore.entities.people.Author;

public abstract class Book implements  Item {
    private final String itemId;
    private final String isbn;
    private String title;
    private Author author;
    private double price;
    private Year year;
    private State type;

    public Book(String id, String isbn, String title, Author author, double price, Year year, State type) {
        this.itemId = id;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
        this.year = year;
        this.type = type;
    }
    @Override
    public int hashCode() {
        return Objects.hash(itemId);
    }
    public String getIsbn() {
        return isbn;
    }
    @Override
    public String getItemId() {
        return itemId;
    }
    @Override
    public String getName() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    public Year getYear() {
        return year;
    }

    public void setYear(Year year) {
        this.year = year;
    }
    @Override
    public State getItemState() {
        return type;
    }
    @Override
    public void setType(State type) {
        this.type = type;
    }
}
