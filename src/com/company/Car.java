package com.company;
import java.util.ArrayList;

public class Car implements Comparable <Car>{
    private String model;
    private int year;
    private double volume;

    public Car(String model, int year, double volume) {
        this.model = model;
        this.year = year;
        this.volume = volume;
    }


    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public double getVolume() {
        return volume;
    }


    @Override
    public int compareTo(Car с) {
        if (this.year < с.getYear ()){
            return -1;

        }else if (this.year > с.getYear()){
            return 1;
        }else {
            return 0;
        }
    }
}