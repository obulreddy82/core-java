package com.rajtechnolgies.java8.functionalinterface;

public class CalculatorEx {

    public static void main(String[] args) {
        Calculator add= (int a, int b) -> (a+b);

        System.out.println(add.calculate(10,20));
    }
}
