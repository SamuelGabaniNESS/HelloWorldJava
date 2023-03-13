package com.academy.main;

import com.academy.Calculator;
import com.academy.Incrementor;

import java.util.ArrayList;
import java.util.List;
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
        // 3 typy operacii nad streamom: generator (streamu), intermediate operatory, terminalny operator (ukoncenie streamu)
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);

        Stream<Integer> s = l.stream();

        //zobere kazdy prvok streamu a vykonna operaciu
        s.forEach(A-> System.out.println(A));
    }
}