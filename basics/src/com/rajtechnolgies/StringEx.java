package com.rajtechnolgies;

public class StringEx {

    public static void main(String[] args) {
        String str="Rajesh";
        System.out.println(System.identityHashCode(str));
        String str2=str;
        str =  str + "kumar";
        System.out.println(System.identityHashCode(str));
        System.out.println(System.identityHashCode(str2));
        System.out.println(str==str2);

    }
}
