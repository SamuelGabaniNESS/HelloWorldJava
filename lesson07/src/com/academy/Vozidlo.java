package com.academy;

public class Vozidlo {
    private String trademark;
    private String color;
    protected int currentSpeed;
    private Prevodovka prevodovka;
    public Vozidlo(String trademark,String color,int currentSpeed,Prevodovka prevodovka){
        this.trademark = trademark;
        this.color = color;
        this.currentSpeed = currentSpeed;
        this.prevodovka = prevodovka;
    }

    public void describe(){
        System.out.println("Trademark: "+trademark+"\nColor: "+color+"\nCurrent speed: "+currentSpeed);
        prevodovka.describe();
    }

    public void zosrotujMa(){
        System.out.println("Srotuje vozidlo");
    }
}
