package com.rajtechnolgies.java8.collections.map;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapEx
{
    public static void main(String[] args) {
        Map<Integer,Integer> map=new LinkedHashMap<>();
        map.put(1,2);
        map.put(3,3);
        map.put(3,4);
        System.out.println(map);
    }
}
