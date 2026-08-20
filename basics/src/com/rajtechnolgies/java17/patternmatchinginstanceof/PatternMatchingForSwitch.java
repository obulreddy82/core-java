package com.rajtechnolgies.java17.patternmatchinginstanceof;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {

        Object obj="Obul";
        switch(obj){
            case Integer i -> System.out.println(i);
            case String s -> System.out.println(s);
            default -> System.out.println("default");
        }
    }
}
