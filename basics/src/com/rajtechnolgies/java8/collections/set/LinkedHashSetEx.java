package com.rajtechnolgies.java8.collections.set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetEx {
    public static void main(String[] args) {
        //maintains the insertion order
        Set<Integer> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add(1);
        linkedHashSet.add(3);
        linkedHashSet.add(3);
        linkedHashSet.add(6);
        linkedHashSet.add(4);
        linkedHashSet.add(5);
        linkedHashSet.add(6);
        System.out.println(linkedHashSet);
    }
}
