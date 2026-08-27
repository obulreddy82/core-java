package com.rajtechnolgies.java8.lambdaexpressions;

import java.util.*;

public class LambdaEx {

    public static void main(String[] args) {
     List<Integer> numbers=new ArrayList<>();

     numbers.add(1);
     numbers.add(2);
     numbers.add(3);

     numbers.forEach((n)->System.out.println(n));

        List<String> names = Arrays.asList("John", "Alice", "Bob");

        Collections.sort(names, new Comparator<String>() {
            @Override
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        List<String> names1 = Arrays.asList("John", "Alice", "Bob");

        Collections.sort(names1, (a, b) -> a.compareTo(b));
    }
}
