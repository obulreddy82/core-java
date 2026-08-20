package com.rajtechnolgies.java8.collections.set;

import java.util.HashSet;
import java.util.Set;

public class HashSetEx {

    public static void main(String[] args) {

        Set<Integer> set = new HashSet<>();
        //Does not allow duplicate elements
        //Stores unique values
        // Un Ordered and Fastest
        set.add(6);
        set.add(5);
        set.add(3);
        set.add(4);
        set.add(2);
        set.add(2);

        System.out.println("Hash Set list" + set);
    }
}
