package com.workintech.rdcompany;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton(String name) {
        this.name = name;
    }

    public String startEngine(){
        return name + " engine started";
    }
    public String drive(){
        return runEngine() + " and driving started";
    }
    protected String runEngine(){
        return name + " engine running";
    }
}
