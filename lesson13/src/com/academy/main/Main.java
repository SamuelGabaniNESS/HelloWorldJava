package com.academy.main;

import com.academy.Book;
import com.academy.Calculator;
import com.academy.Incrementor;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        // LAMBDA A STREAMY

        // vytvorenie objektu triedy, ktora dedi od kalkulatora
        // vola sa to anonymna classa, lebo nema meno -> boli zakladny sposob ako vytvorit objekt classy ak ten objekt
        // budem potrebovat iba raz, ale od java 8 zistili ze bolo vela interfaceov s jednou metodou a preto spravili
        // skrateny zapis anonymnej classy == lambda
        // lambdu je mozne implementovat ak ma interface iba jednu metodu

        // Interface s jednou metodou je FUNKCIONALNY interface, @FunctionalInterface garantuje ze je funkcionalny,
        // garantuje ze ma presne jednu abstraktnu metodu


        // Implementacia s viacerymi metodami
//        Calculator c = new Calculator() {
//            @Override
//            public int scitaj(int op1, int op2) {
//                return op1+op2;
//            }
//
//            @Override
//            public int odcitaj(int op1, int op2) {
//                return op1-op2;
//            }
//        };

        //dlhy zapis
        Calculator c = new Calculator() {
            @Override
            public int scitaj(int op1, int op2) {
                return op1+op2;
            }
        };
        //skrateny zapis -- len jeden prikaz, datove typy mozme pisat ale musime urcit vsetky potom
        Calculator c2 =(A,B) -> A+B;
        //skrateny zapis -- viac prikazov
        Calculator c3 = (A,B) -> {
            System.out.println("Lambda");
            return A+B;
        };

        System.out.println(c.scitaj(2,1));
        System.out.println(c2.scitaj(2,4));
        System.out.println(c3.scitaj(52,36));
        System.out.println(c3.getClass().getSimpleName());

        Incrementor i = op -> op + 1;
        System.out.println(i.increment(10));
        System.out.println("=".repeat(40));

        //STREAM
        // list a stream sa daju konvertovat navzajom
        // obe su udajova struktura
        // 2 typy streamov: konecny a nekonecny
        // 3 typy operacii nad streamom: generator (streamu), intermediate operatory, terminalny operator (ukoncenie streamu)
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);

        Stream<Integer> s = l.stream();

        // forEach zobere kazdy prvok streamu a vykonna operaciu - terminal operator
        // limit obmedzuje pocet prvkov ktore berieme -intermediate operator
        s.limit(2).forEach(A-> System.out.println(A));

        // nemozme vytvorit new Stream()
        Stream.of(10,20,30,40).limit(2).forEach(A -> System.out.println(A));
        //Stream.empty();

        // nekonecny stream:
        // keby nebol limit tak ide do nekonecna
        // streamy su lazy, to znamena ze nevykonna operaciu co nemusi, to znamena ze po
        // limit uz sa neplni stream dalsimi hodnotami
        Stream.iterate(0,A->A+10).limit(5).forEach(A-> System.out.println(A));
        Stream<Integer> s2 = Stream.iterate(10,A->A-5).limit(10); // vytvori prvky az ked zavolame forEach
        s2.forEach(A-> System.out.println(A));

        Stream<Integer> s3 = Stream.iterate(0,A->A+10);
        // intermediate operatory
        s3
                .skip(3) // skipne urcity pocet prvkov
                .limit(10) // obmedzuje pocet prvkov s ktorymi pracuje
                .map(A->A+3) // pre kazdy prvok streamu vykonna operaciu
                .filter(A -> A<50 && A>20) // filtruje prvky ktore splnaju podmienku, iba tie pusti dalej do streamu
                // ! BEZ TERMINALNEHO OPERATORU SA NEVYKONNA ZIADNY INTERMEDIATE !
                .forEach(A-> System.out.println(A));
        //Stream.of(10,20).map(A->A+6).forEach(A-> System.out.println(A));
        List<Book> b = new ArrayList<>();
        b.add(new Book());
        b.add(new Book());
        b.add(new Book());
        // ziskaj nazvy kniziek cez streamy
        b.stream().map(A -> A.getName()).forEach(A -> System.out.print(A+", "));

        // sorted() zoradi prvky streamu --- ! NEPOUZIVAT S NEKONECNYMI STREAMAMI
        Stream.of(10,5,17,10,9,11).distinct().sorted().forEach(A-> System.out.println(A));

        // ked sa stream uzavrie nie je mozne nad nim volat dalsie operacie, kedze bol terminovany terminalnym op.
        Stream<Integer> s4 = Stream.iterate(0,A->A+10);
        //s4.limit(10).forEach(A-> System.out.print(A+", "));
        //s4.limit(10).forEach(A-> System.out.print(A+", "));

        Stream<Integer> s5 = Stream.of(10,20,30,40,50);
        // count() znici stream a vrati pocet prvkov
        //System.out.println(s5.count());

        // collect() transformuj stream do inej udajovej struktury ale znici strema
        //List<Integer> l2 = s5.collect(Collectors.toList());
        //System.out.println(l2);

        //allMatch() ci plati pre vsetky prvky streamu, anyMatch() pre niektory, atd.
        System.out.println(s5.allMatch(A->A<60));
        s5 = Stream.of(10,20,30,40,50);
        System.out.println(s5.anyMatch(A->A>20));
        s5 = Stream.of(10,20,30,40,50);
        System.out.println(s5.noneMatch(A->A==75));


    }
}