package com.neoteric.Lists;

public class Student {

    private  String name;

    private String hallTicket;

    private int age;

    public Student(String name, String hallTicket, int age) {
        this.name = name;
        this.hallTicket = hallTicket;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getHallTicket() {
        return hallTicket;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", hallTicket='" + hallTicket + '\'' +
                ", age=" + age +
                '}';
    }

    public int getAge() {
        return age;
    }
}
