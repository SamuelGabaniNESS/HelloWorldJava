package com.academy.main;

import com.academy.Book;
import com.academy.Car;
import com.academy.ForeignBook;

public class Main {
    public static void main(String[] args) {
        Book myBook = new ForeignBook("Daniel Defoe",
                "Robinson Crusoe",
                120,
                "English");

        Book myBook2 = new ForeignBook("Daniel Defoe",
                "Robinson Crusoe",
                120,
                "English");

        Book otherBook = new Book("Jean Paul Sartner",
                "Nausea",
                80);

        myBook.describe();

        System.out.println(myBook);
        System.out.println(myBook==otherBook);
        System.out.println(myBook.equals(myBook2));
        System.out.println(myBook.hashCode());

        Car.descibeEmissionStandard();
        Car.emissionsStandard = 250;
        Car car = new Car("Ferrari");
        car.howFastAreYouGoing();
        car.setCurrentSpeed(150);
        car.howFastAreYouGoing();
        System.out.println(Car.emissionsStandard);

        System.out.println(myBook.equals(myBook2));

    }
}