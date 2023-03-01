package com.academy;

public class Book {
    private String name;
    private String author;
    private int pages;

    public Book(String name, String author, int pages){
        this.name = name;
        this.author = author;
        this.pages = pages;
    }

    @Override
    public String toString() {
        return "Name of the book: "+this.name+
                "\nAuthor: "+this.author+
                "\nNumber of pages: "+this.pages+
                "\n"+"=".repeat(30);
    }
}
