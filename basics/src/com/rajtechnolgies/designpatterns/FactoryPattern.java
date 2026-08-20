package com.rajtechnolgies.designpatterns;

public class FactoryPattern {
    //FactoryPattern creates objects without exposing object creation logic to the client
    //Spring Factory creates bean.
    public static void main(String[] args) {
        VehicleFactory vehicleFactory=new VehicleFactory();
        Vehicle vehicle=vehicleFactory.getVehicle("car");
        vehicle.drive();
    }



}
