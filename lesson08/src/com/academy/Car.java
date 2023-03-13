package com.academy;

import java.util.Objects;

public class Car {
    public static int emissionsStandard = 100;
    private static int maxSpeedByLaw = 200;
    private String manufacturer;
    private int currentSpeed=0;

    public Car(String manufacturer){
        this.manufacturer = manufacturer;
    }

    public Car(String manufacturer, int currentSpeed){
        this(manufacturer);
        this.currentSpeed = currentSpeed;
    }

    public void setCurrentSpeed(int currentSpeed){
        this.currentSpeed = currentSpeed;
    }

    public void howFastAreYouGoing(){
        System.out.println(this.manufacturer + " is going "+ this.currentSpeed+ " km/h");
    }

    public static void descibeEmissionStandard(){
        System.out.println("Emission Standard: "+emissionsStandard);

    }

}
