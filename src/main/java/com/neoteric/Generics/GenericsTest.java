package com.neoteric.Generics;

public class GenericsTest <K,V> extends Generics<K,V> {

    public static void main (String[] args){

        Generics generics=new Generics();
        generics.put("76537","87787");
        generics.put("3467","7667");
        System.out.println("generics");
    }
}
