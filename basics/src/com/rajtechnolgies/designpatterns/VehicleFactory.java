package com.rajtechnolgies.designpatterns;

public class VehicleFactory {

    //Spring Example
    //
    //Spring uses Factory Pattern internally.

    public Vehicle getVehicle(String type){
        if(type.equalsIgnoreCase("bike")){
            return new Bike();
        }
        return new Car();
    }
}
