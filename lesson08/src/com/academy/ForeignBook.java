package com.academy;

import java.util.Objects;

public class ForeignBook extends Book{
    private String language;
    public ForeignBook(String author, String bookName, int numberOfPages, String language){
        super(author,bookName,numberOfPages);
        this.language = language;
    }

    @Override
    public void describe() {
        super.describe();
        System.out.println("Language: "+this.language);
    }

    @Override
    public String toString() {
        return super.toString() + ", "+this.language;
    }


}
