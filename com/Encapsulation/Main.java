package com.Encapsulation;

// Encapsulation is using methods to set variables in a class.

public class Main {

    public static void main (String[] args) {

        Student s = new Student();

        s.setName("Alex");
        System.out.println(s.getName());
        s.setAge(28);

        System.out.println(s.getAge());

    }
}
