package com.academy;

public class Prevodovka {
    private String type;
    private int numberOfSpeeds;
    public Prevodovka(String type,int numberOfSpeeds){
        this.type = type;
        this.numberOfSpeeds = numberOfSpeeds;
    }

    public void describe(){
        System.out.println("Gearbox\n\tType: "+type+"\n\tNumber of speeds: "+numberOfSpeeds);
    }
}
