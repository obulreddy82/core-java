package com.rajtechnolgies.java8.staticmethodinterface;

public interface Calculator {

    static int calculate(int x, int y){
        return x+y;
    }
}
