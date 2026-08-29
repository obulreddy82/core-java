package com.rajtechnolgies.java8.staticmethodinterface;

public class CalculatorEx implements Calculator {

    public static void main(String[] args) {
        //Static method are used for utility methods or helper methods
        System.out.println(Calculator.calculate(10,20));
    }

}

