package com.rajtechnolgies.java8.methodreferences;

import java.util.Arrays;
import java.util.List;

public class InstanceMethodReferenceParticular {
    //reference to an instance method of a particular object
    public static void main(String[] args) {
        List<String> names = Arrays.asList("Jay", "Keerthi", "Shilpa");

        PrintName print=new PrintName();
        names.forEach(print::printNames);
    }

}

class PrintName {
    public void printNames(String name) {
        System.out.println(name);
    }
}
