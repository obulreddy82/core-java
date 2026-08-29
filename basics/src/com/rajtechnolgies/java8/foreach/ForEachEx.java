package com.rajtechnolgies.java8.foreach;

import java.util.*;

public class ForEachEx {

    public static void main(String[] args) {

        //forEach() with a Set
        //It is not gurantee, HashSet does not maintain hte insertion order
        Set<String> names=new HashSet<>();
        names.add("Rajesh");
        names.add("Cherry");
        names.add("Pallavi");
        names.add("Rajesh");
        names.forEach(System.out::println);
        // forEach() with a Map
        Map<Integer,String> student= new HashMap<>();
        student.put(1,"Rajesh");
        student.put(2,"Cherry");
        student.put(3,"Pallavi");
        student.forEach((k,v)->System.out.println(k+" - "+v));
    }
}
