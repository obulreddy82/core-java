package com.rajtechnolgies.java8.defaultMethod;

public class Test implements A,B{
    public static void main(String[] args) {
        new Test().show();
    }
    @Override
    public void show(){
        B.super.show();
    }
}
