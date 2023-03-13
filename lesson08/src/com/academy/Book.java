package com.academy;

public class Book {
    private String author;
    private String bookName;
    private int numberOfPages;

    public Book(String author, String bookName, int numberOfPages){
        this.author = author;
        this.bookName = bookName;
        this.numberOfPages = numberOfPages;
    }

    public void describe(){
        System.out.println("Author: "+this.author+
                "\nName of the book: "+this.bookName+
                "\nNumber of pages: "+this.numberOfPages);
    }

    @Override
    public String toString() {
        return this.author + ": "+this.bookName;
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof Book){
            Book otherBook = (Book)o;
            if(this.bookName.equals(otherBook.bookName)){
                if(this.author.equals(otherBook.author)){
                    if(this.numberOfPages==otherBook.numberOfPages){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    //musi byt override ked override davame na equals(), musi zavisiet od spolocnych atributov
    @Override
    public int hashCode(){
        return this.author.hashCode()+this.bookName.hashCode();
    }
}
