package com.rajtechnolgies.java8.collections.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapEx {

    public static void main(String[] args) {
        //Stores data as key and value pairs
        //Keys will be unique and values will be duplicate
        //Fastest and unordered
        Map<Integer, Integer> map = new HashMap<>();
        map.put(1,2);
        map.put(1,3);
        map.put(2,3);
        System.out.println(map);
    }
}
