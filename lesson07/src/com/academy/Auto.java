package com.academy;

public class Auto extends Vozidlo{
    private int numberOfDoors;
    public Auto(String manufacturer, String color, int currentSpeed, Prevodovka prevodovka, int numberOfDoors){
        super(manufacturer,color,currentSpeed,prevodovka);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Number of doors: "+numberOfDoors);
        if(currentSpeed==0){
            System.out.println("Car is standing still");
        }
    }

    public void describeNumberOfDoors(){
        System.out.println("Number of doors is "+this.numberOfDoors);
    }

    @Override
    public void zosrotujMa(){
        System.out.println("Srotuje auto");
    }
}
