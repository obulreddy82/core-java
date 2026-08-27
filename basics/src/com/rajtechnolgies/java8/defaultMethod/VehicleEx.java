package com.rajtechnolgies.java8.defaultMethod;

public class VehicleEx {
    public static void main(String[] args) {
        Vehicle car = new Car();
        String carEngine = car.engine();
        car.start(carEngine);

        Lorry lorry = new Lorry();
        String engine = lorry.engine();
        lorry.start(engine);

    }
}
