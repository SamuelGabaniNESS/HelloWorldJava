package com.academy;

import com.academy.Book;

public class ScientificBook extends Book {
    private String scientificArea;
    public ScientificBook(String name, String author, int pages, String scientificArea) {
        super(name, author, pages);
        this.scientificArea = scientificArea;
    }
}
