package com.academy.main;

import com.academy.Called;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        //List, Set, Map, Queue, Dequeue
        //List garantuje poradie prvkov a moze mat duplikaty
        //Set negarantuje poradie prvkov a nemoze mat duplikaty
        //Map ma key-value pary, negarantuje usporiadanie
        //Queue a Dequeue su specialne udajove struktury, je jasne usporiadanie prvkov, mozne mat duplikaty
        //Queue Prvky je mozne vkladat iba na koniec a prvky je mozne brat iba zo zaciatku
        //Dequeue aj opacne ale nie zo stredu

        //List
        //ArrayList je specificka implementacia Listu, rozdiel je v performance a tak
        //moze byt List l = new ArrayList(); -> mozme vkladat hocico
        List<Integer> l = new ArrayList<>();
        l.add(10);
        l.add(20);
        l.add(30);
        l.add(3);
        l.add(1);
        l.add(5);
        l.add(2);
        l.add(1,40);

        System.out.println(l);
        l.remove(new Integer(2)); //aby sme odstranili objekt s hodnotou a nie ako index 2
        Integer result = l.get(0) + l.get(1);
        System.out.println(l);
        //System.out.println(l.get(0));
        System.out.println(result);
        System.out.println(l.size());

        //Set
        Set<Integer> s1 = new HashSet<>();
        //Set<Integer> s2 = new TreeSet<>(); ---> usporiadany od najmensieho po najvacsi
        s1.add(10);
        s1.add(40);
        s1.add(20);
        s1.add(5);
        s1.add(10);
        System.out.println(s1);

        //Map
        Map<Integer,String> m1 = new HashMap<>();
        m1.put(10,"Lacne");
        m1.put(20,"Da sa");
        m1.put(30,"Drahe");

        System.out.println(m1);
        System.out.println(m1.get(20));
        System.out.println(m1.keySet());

        //Queue a Dequeue --> google :)

        //method overloading
        Called c = new Called();
        //c.m1(10,"ahoj",10,20,30);
        c.m1(10);

    }
}