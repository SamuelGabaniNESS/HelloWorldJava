package com.academy;

public class Lod extends Vozidlo{
    private int numberOfEngines;
    public Lod(String manufacturer, int currentSpeed,Prevodovka prevodovka,int numberOfEngines){
        super(manufacturer,"Black",currentSpeed,prevodovka);
        this.numberOfEngines = numberOfEngines;
    }

    @Override
    public void describe(){
        super.describe();
        System.out.println("Number of engines: "+numberOfEngines);
    }

    @Override
    public void zosrotujMa(){
        System.out.println("Srotuje lod");
    }
}
