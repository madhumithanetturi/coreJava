package com.neoteric.collections;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

    public static void main(String[] args){

        Map<String,Employee> hashMap = new HashMap<>();

        hashMap.put("E101",new Employee("madhumitha",28,"IT"));
        hashMap.put("E102",new Employee("vaishnavi",35,"HR"));
        hashMap.put("E103",new Employee("keerthi",42,"Finance"));

        for (Map.Entry<String,Employee> entry :hashMap.entrySet()){
            System.out.println("key:"+ entry.getKey()+",Value:"+entry.getValue());
        }
    }
}
