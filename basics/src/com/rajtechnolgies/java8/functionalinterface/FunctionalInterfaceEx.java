package com.rajtechnolgies.java8.functionalinterface;

import java.lang.FunctionalInterface;

public class FunctionalInterfaceEx {
    /*
    Explanation:
    Square is a functional interface with a single method calculate(int x).
    A lambda expression (int x) -> x * x is used to implement the calculate method.
    Lambda takes x as input and returns x * x.
    Note: @FunctionalInterface annotation is optional but it is a good practice to use.
          It helps catching the error in early stage by making sure that the interface has only one abstract method.
     */
    public static void main(String[] args) {
        // lambda expression to define the calculate method
        Square square = (int x) -> x * x;
        // parameter passed and return type must be same as defined in the prototype
        System.out.println(square.calculate(5));
        System.out.println(square.square(5));
    }


}

@FunctionalInterface
interface Square {
    int calculate(int x);

    default int square(int x) {
        return x * x;
    }
}
