package dev.samo.main;

import dev.samo.Car;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class Main2 {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        System.out.println("ArrayList class: "+arrayList.getClass());
        System.out.println("ArrayList instanceof List: "+(arrayList instanceof List));
        System.out.println("ArrayList instanceof Collection: "+(arrayList instanceof Collection));
        System.out.println("ArrayList instanceof Iterable: "+(arrayList instanceof Iterable));
        System.out.println("ArrayList content:" + arrayList);
        System.out.println("Is ArrayList empty: "+arrayList.isEmpty());
        arrayList.add("EUR");
        arrayList.add("USD");
        arrayList.add("GBP");
        arrayList.add("JPY");
        arrayList.add("INR");
        System.out.println("ArrayList content:" + arrayList);
        System.out.println("ArrayList size: "+arrayList.size());
        System.out.println("Is ArrayList empty: "+arrayList.isEmpty());
        System.out.println("ArrayList contains EUR: "+arrayList.contains("EUR"));

        System.out.println("ArrayList instanceof List: "+(arrayList instanceof List<?>));
        System.out.println("ArrayList instanceof Collection: "+(arrayList instanceof Collection<?>));
        System.out.println("ArrayList instanceof Iterable: "+(arrayList instanceof Iterable<?>));

        ArrayList<Car> carList = new ArrayList<>();
        carList.add(new Car("Skoda","Rapid",15000.0));
        carList.add(new Car("Honda","Civic",23000.0));
        carList.add(new Car("Ferrari","F50",152000.0));
        System.out.println("Car list: "+carList);

        for(Car car:carList){
            System.out.format("(%s, %s, %.1f)\n",car.getMake(),car.getModel(),car.getPrice());
        }
        Car car = carList.get(2);
        carList.addAll(List.of(
                new Car("daco","daco",230.0),
                new Car("nieco","nieco",45000.0),
                new Car("hmm","hmm",33000.0)));
        System.out.println(carList);

        System.out.println(arrayList);
        arrayList.removeAll(List.of("USD","JPY"));
        System.out.println(arrayList);

        
    }
}
