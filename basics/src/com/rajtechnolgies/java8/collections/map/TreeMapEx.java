package com.rajtechnolgies.java8.collections.map;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapEx {
    public static void main(String[] args) {
        Map<Integer,Integer> map=new TreeMap<>();

        map.put(1,2);
        map.put(5,3);
        map.put(3,4);
        map.put(4,5);
        System.out.println(map);
    }
}
