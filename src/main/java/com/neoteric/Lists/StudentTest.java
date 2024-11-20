package com.neoteric.Lists;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StudentTest {

    public static void main(String[] args) {

        LinkedList<Student> studentLinkedList = new LinkedList();

        Student student1 =new Student("madhumitha", "123456789", 20);
        Student student2 =new Student("keerthi", "2345678901", 30);
        Student student3 =new Student("yashashwini", "3456789012", 40);

        studentLinkedList.add(student1);
        studentLinkedList.add(student2);
        studentLinkedList.add(student3);

        LinkedList<Student> filteredStudents = studentLinkedList.stream()
                .filter(student -> student.getAge() > 25)
                .collect(Collectors.toCollection(LinkedList::new));  // Collect into LinkedList

        // Print the filtered students
        System.out.println("Filtered Students (age > 25):");
        filteredStudents.forEach(System.out::println);
   }

}
