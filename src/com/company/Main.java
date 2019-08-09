package com.company;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> cars = new ArrayList<>();

        cars.add(new Car("Mercedes", 2010,6.0));
        cars.add(new Car("BMW", 2011,3.5));
        cars.add(new Car("Audi", 2012,1.6));
        cars.add(new Car("Bentley", 2013,1.8));
        cars.add(new Car("Toyota", 2014,2.4));
        cars.add(new Car("Ford", 2015,5.1));
        cars.add(new Car("Opel", 2016,3.2));
        cars.add(new Car("Bentley", 2017,5.0));
        cars.add(new Car("Maserati", 2018,2.4));
        cars.add(new Car("Lexus", 2009,3.0));

        System.out.println("До сортировки");
        for (Car car : cars){
            System.out.println(car.getYear());
        }
        Collections.sort(cars);

        System.out.println("________________________");

        System.out.println("После сортировки");
        for (Car car : cars){
            System.out.println(car.getYear());
        }
    }
}
