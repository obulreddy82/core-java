package com.rajtechnolgies.java17.patternmatchinginstanceof;

public class PatternMatchingInstanceOf {

    //No explicit casting required.

    public static void main(String[] args) {
        Object obj= "hello world Chittu";
        if(obj instanceof String str){
            //String str=(String)obj; old code need to typecase
            System.out.println(str.toUpperCase());
        }
    }
}
