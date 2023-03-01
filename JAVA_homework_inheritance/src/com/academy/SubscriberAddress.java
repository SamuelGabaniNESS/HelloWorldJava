package com.academy;

public class SubscriberAddress {
    private String streetName;
    private int streetNumber;
    private String city;
    private String country;
    private int zipcode;

    public SubscriberAddress(String streetName, int streetNumber, String city, String country, int zipcode){
        this.streetName = streetName;
        this.streetNumber = streetNumber;
        this.city = city;
        this.country = country;
        this.zipcode = zipcode;
    }

}
