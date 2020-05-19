package com.adria.testchallenge;

public class Devise {
    public String name;
    private double rate;
    public String base;
    public String date;

    public String getDate() {
        return date;
    }

    public Devise(String name, double rate) {
        this.name = name;
        this.rate = rate;
    }

    public String getName() {
        return name;
    }

    public double getRate() {
        return rate;
    }


}
