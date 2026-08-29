package com.rajtechnolgies.java11;

import java.util.function.BiFunction;

public class VarLocalAndLambdaVarEx {


    public static void main(String[] args){
        var x = 10;
        BiFunction<Integer,Integer,Integer> add = (var a, var b) -> a + b;
        System.out.println(x);
        System.out.println(add.apply(10,20));
    }
}
