package com.academy.main;

import com.academy.*;

public class Main {
    public static void main(String[] args) {
        Vozidlo bmw = new Vozidlo("BMW",
                "White",
                20,
                new Prevodovka("manual", 6));
        bmw.describe();
        System.out.println("-".repeat(40));
        Auto audi = new Auto("Audi",
                "Black",
                0,
                new Prevodovka("Manual",7),4);
        audi.describe();
        Lod lod = new Lod("Meno",50,new Prevodovka("automat",4),2);
        lod.describe();

        Vozidlo v = new Auto("Skoda",
                "green",
                40,
                new Prevodovka("manual",5),
                4);
        v.describe();
        //v.describeNumberOfDoors(); - keby bolo Auto tak funguje

        Srotovisko srot = new Srotovisko();
        srot.zosrotuj(lod);
        srot.zosrotuj(audi);

    }
}