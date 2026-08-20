package com.rajtechnolgies.java8.collections.list;

import java.util.LinkedList;

public class LinkedListEx {

    public static void main(String[] args) {
        LinkedList<String> linkedList=new LinkedList<String>();
        linkedList.add("Rajesh");
        linkedList.add("Pahlavi");
        linkedList.add("Cherry");
        linkedList.add("Surya");
        linkedList.add(4,"equal");
        linkedList.remove("Rajesh");
        linkedList.set(1,"Hema");
        System.out.println(linkedList);
    }
}
