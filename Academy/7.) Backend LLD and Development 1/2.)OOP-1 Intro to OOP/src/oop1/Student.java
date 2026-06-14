package oop1;

import java.security.PublicKey;

public class Student {

    String id;
    String name;
    String course;
    public Student() {
        // Default constructor
    }
    public Student(String id, String name, String course) {
        // Default constructor
        this.id = id;
        this.name = name;
        this.course = course;

    }

   public void printDetails() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
        System.out.println("Student Course: " + course);
    }
}
