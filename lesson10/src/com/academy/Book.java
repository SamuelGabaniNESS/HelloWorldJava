package com.academy;

import java.util.ArrayList;
import java.util.List;

public sealed class Book permits ForeignBook{ //ak final pred triedou -> od tej triedy nemoze dedit
    //sealed classa iba permitovane classy mozu dedit z nej ale musia byt final
    private final int numberOfPages; // final pri atribute znamena ze mozme do neho priradit hodnotu iba raz a hodnota musi
    //byt priradena pri konstrukcii objektu
    //mozme ale napriklad pridavat veci do Listu nakolko to nemeni referenciu --mutable objects
    //pri  primitivnych typoch a immutable objects ako string nemoze menit
    private final String name;
    private final List<String> authors;

    public Book(String name, int numberOfPages, List<String> authors){
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.authors = authors;
    }

    //ak final pred metodou - nie je mozne overrideovat
    public void describe(){
        System.out.println("Book name: "+this.name+
                "\nNumber of pages: "+this.numberOfPages+
                "\nAuthors: "+this.authors);
    }
}
