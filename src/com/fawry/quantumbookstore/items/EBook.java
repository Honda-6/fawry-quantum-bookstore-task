package com.fawry.quantumbookstore.items;

import java.time.Year;

import com.fawry.quantumbookstore.entities.people.Author;

public class EBook extends Book {
    private String fileFormat;
    private double fileSize;

    public EBook(String id,String isbn,String title,Author author,double price,Year year, State type, String fileFormat, double fileSize) {
        super(id,isbn,title,author,price,year,type);
        this.fileFormat = fileFormat;
        this.fileSize = fileSize;
    }

    public String getFileFormat() {
        return fileFormat;
    }

    public void setFileFormat(String fileFormat) {
        this.fileFormat = fileFormat;
    }

    public double getFileSize() {
        return fileSize;
    }

    public void setFileSize(double fileSize) {
        this.fileSize = fileSize;
    }
    
}
