package com.rajtechnolgies.java8.methodreferences;

import java.util.Arrays;
import java.util.List;

public class StaticMethodReference {
//Reference to Static methods
    public static void printNames(String name){
        System.out.println(name);
    }

    public static void main(String[] args) {

        List<String> names = Arrays.asList("Kiran", "Ramesh", "Suresh");
        //Method Reference
        names.forEach(StaticMethodReference::printNames);
        //Lambda Expressions ==> Lambda can be replaced with method references
        //names.forEach(n -> printNames(n));
    }
}
