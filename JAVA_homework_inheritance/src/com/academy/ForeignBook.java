package com.academy;

public class ForeignBook extends Book{
    private String language;

    public ForeignBook(String name, String author, int pages){
        this(name,author,pages,"English");
    }

    public ForeignBook(String name, String author, int pages, String language) {
        super(name, author, pages);
        this.language = language;
    }
}
