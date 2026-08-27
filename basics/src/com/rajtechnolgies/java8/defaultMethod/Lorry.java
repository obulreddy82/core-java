package com.rajtechnolgies.java8.defaultMethod;

public class Lorry implements Vehicle {
    @Override
    public String engine(){
        return "Lorry Engine";
    }

    // class can override the default methods
    @Override
    public String start(String engine){
        engine="Lorry override engine";
        System.out.println(engine+" started");
        return "Lorry Engine";
    }
}
