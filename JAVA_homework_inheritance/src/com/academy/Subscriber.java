package com.academy;

public class Subscriber {
    private String firstName;
    private String lastName;
    private SubscriberAddress fullAddress;
    private String email;
    private Integer age;

    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String email){
        this.firstName = firstName;
        this.lastName = lastName;
        this.fullAddress = fullAddress;
        this.email = email;
    }

    public Subscriber(String firstName, String lastName, SubscriberAddress fullAddress, String email, int age){
        this(firstName,lastName,fullAddress,email);
        this.age = age;
    }
}
