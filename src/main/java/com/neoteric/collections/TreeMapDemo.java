package com.neoteric.collections;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapDemo {

    public static void main(String[] args){

        Map<String,Employee> treeMap = new TreeMap<>();

        treeMap.put("E201",new Employee("yashashwini",29,"Marketing"));
        treeMap.put("E202",new Employee("sharani",38,"Operations"));
        treeMap.put("E203", new Employee("varshini",31,"Sales"));

        for (Map.Entry<String,Employee> entry:treeMap.entrySet()){
            System.out.println("key:"+ entry.getKey()+",Value:"+ entry.getValue());
        }

    }
}
