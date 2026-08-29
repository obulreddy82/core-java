package com.rajtechnolgies.java17.record;

import java.util.List;

public record RecordEx(String name, int age, List<String> addresses) {

    public RecordEx{
        if(age()<18) throw new IllegalArgumentException("Age must be greater than 18");
    }

    public void show(){
        System.out.println("Person details: Name =>"+name+" Age=>"+age+"Addresses=>"+addresses);
    }
    public static void main(String[] args) {
        RecordEx recordEx=new RecordEx("Raj",20,new java.util.ArrayList<>());
        recordEx.addresses().add("Bangalore");
        recordEx.addresses().add("Belgium");
        recordEx.show();
    }
}
