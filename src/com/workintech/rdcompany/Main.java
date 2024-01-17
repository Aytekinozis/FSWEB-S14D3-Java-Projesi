package com.workintech.rdcompany;

public class Main {
    public static void main(String[] args) {
        CarSkeleton iskelet = new CarSkeleton("iskelet");
        System.out.println(iskelet.startEngine());
        System.out.println(iskelet.drive());
        System.out.println("---------------");
        CarSkeleton murat131 = new GasPoweredCar("murat131",12.4,4);
        System.out.println(murat131.startEngine());
        System.out.println(murat131.drive());
        System.out.println("------------------");
        CarSkeleton tesla = new ElectricCar("tesla",500,75);
        System.out.println(tesla.startEngine());
        System.out.println(tesla.drive());
        System.out.println("--------------");
        CarSkeleton CHR = new HybridCar("C-HR",5,25,4);
        System.out.println(CHR.startEngine());
        System.out.println(CHR.drive());
    }
}
