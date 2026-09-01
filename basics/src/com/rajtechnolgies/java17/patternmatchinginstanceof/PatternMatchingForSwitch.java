package com.rajtechnolgies.java17.patternmatchinginstanceof;

public class PatternMatchingForSwitch {
    public static void main(String[] args) {

        Object obj="Obul";
        switch(obj){
            case Integer i -> System.out.println(i);
            case String s -> System.out.println(s);
            default -> System.out.println("default");
        }

        Object intergerObject=new Integer(20);
        switch(intergerObject){
            case Integer i -> System.out.println("integer value"+i);
            case String s -> System.out.println("String value"+ s);
            default -> System.out.println("default");
        }

        Object longValue=new Long(2333);
        switch(longValue){
            case Integer i -> System.out.println("integer value"+i);
            case String s -> System.out.println("String value"+ s);
            default -> System.out.println("default");
        }
    }
}
