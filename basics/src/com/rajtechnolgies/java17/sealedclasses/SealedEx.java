package com.rajtechnolgies.java17.sealedclasses;

sealed class Vehicle permits Bike, Car, Truck{
    public void drive(){
        System.out.println("Default drive method");
    }
}
non-sealed class Bike extends Vehicle{
    public void drive(){
        System.out.println("Riding");
    }
}
final class Car extends Vehicle {
    public void drive(){
        System.out.println("Driving");
    }
}
sealed class Truck extends Vehicle permits SemiTruck{
    public void drive(){
        System.out.println("Trucking");
    }
}

final class SemiTruck extends Truck{
    public void drive(){
        System.out.println("Semi Trucking");
    }
}

public class SealedEx {
    public static void main(String[] args) {
        Vehicle vehicle=new Bike();
        Vehicle vehicle2=new Car();
        Vehicle vehicle3=new Truck();
        Vehicle vehicle4=new SemiTruck();
        vehicle.drive();
        vehicle2.drive();
        vehicle3.drive();
        vehicle4.drive();
    }
}
