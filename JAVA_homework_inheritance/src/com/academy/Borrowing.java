package com.academy;

import java.time.LocalDate;
import java.util.Date;

public class Borrowing {
    private Book book;
    private Subscriber subscriber;
    private LocalDate dateOfBorrowing;
    private LocalDate returnDate;

    public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing){
        this.book = book;
        this.subscriber = subscriber;
        this.dateOfBorrowing = dateOfBorrowing;
    }

    public Borrowing(Book book, Subscriber subscriber, LocalDate dateOfBorrowing, LocalDate returnDate){
        this(book,subscriber,dateOfBorrowing);
        this.returnDate = returnDate;
    }

    public void setReturnDate(LocalDate date){
        returnDate = date;
    }
}
