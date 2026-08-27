package com.rajtechnolgies.java8.defaultMethod;

public interface Vehicle {

    String engine();

    default String  start(String engine){
        System.out.println(engine+" is started");
        return engine;
    }

}
