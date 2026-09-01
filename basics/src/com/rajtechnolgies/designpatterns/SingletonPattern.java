package com.rajtechnolgies.designpatterns;
//shared one instance

public class SingletonPattern {

    private static SingletonPattern instance;

    private SingletonPattern(){
        System.out.println("Inside Constructor");
    }

    public static SingletonPattern getInstance(){
        if(instance==null){
            instance = new SingletonPattern();
        }
        return instance;
    }
}
