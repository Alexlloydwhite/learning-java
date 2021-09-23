package com.Encapsulation;

// Student class represents a student object

// Encapsulation is creating a set method and get method, because the variables are private.
// This makes it more simple for the user.

// Getters and Setters = encapsulation!

public class Student {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

}
