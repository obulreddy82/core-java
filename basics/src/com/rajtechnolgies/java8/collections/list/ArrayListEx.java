package com.rajtechnolgies.java8.collections.list;

import java.util.ArrayList;

public class ArrayListEx {

    public static void main(String[] args) {
        ArrayList<String> list=new ArrayList<>();
        // add the elements
        list.add("Rajesh");
        list.add("Pallavi");
        list.add("Cherry");
        list.add("Rajesh");
        list.add(2,"Obul");
        list.remove("Rajesh");
        list.set(1,"Hema");
       // System.out.println(list.ensureCapacity(1));
        list.forEach(System.out::println);
    }
}
