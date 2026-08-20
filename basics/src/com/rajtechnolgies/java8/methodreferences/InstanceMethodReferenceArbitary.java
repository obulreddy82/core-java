package com.rajtechnolgies.java8.methodreferences;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceArbitary {
    public static void printNames(String name){
        System.out.println(name);
    }
    public static void main(String[] args) {

        List<String> names = Arrays.asList("cherry", "Pallavi", "Rajesh");

        names.stream().map(String::toUpperCase).forEach(InstanceMethodReferenceArbitary::printNames);

    }
}
