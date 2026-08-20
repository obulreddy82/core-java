package com.rajtechnolgies.java8.collections.set;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetEx {
    public static void main(String[] args) {
        Set<Integer> treeSet = new TreeSet<>();
        //Stores elements in sorted order
        treeSet.add(1);
        treeSet.add(5);
        treeSet.add(3);
        treeSet.add(6);
        treeSet.add(9);
        treeSet.add(4);
        treeSet.add(5);

        System.out.println(treeSet);
    }
}
