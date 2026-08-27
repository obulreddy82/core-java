package com.rajtechnolgies.java8.functionalinterface;

import java.util.function.Predicate;

public class BuildInFunctionsEx {

    public static void main(String[] args) {
        //Predicate
        Predicate<Integer> isEven = (x) -> (x % 2 == 0);
        //Predicates can be combined:
        Predicate<Integer> isGreaterThan = (x) -> (x>10);
        System.out.println(isEven.and(isGreaterThan).test(12));

        Predicate<String> isUpperCase = (x) -> (x.toUpperCase().equals(x));
        System.out.println(isUpperCase.test("hello"));
        System.out.println(isUpperCase.negate().test("hello"));
    }
}
