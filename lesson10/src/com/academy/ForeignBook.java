package com.academy;

import java.util.List;

public final class ForeignBook extends Book{
    public ForeignBook(String name, int numberOfPages, List<String> authors) {
        super(name, numberOfPages, authors);
    }
}
