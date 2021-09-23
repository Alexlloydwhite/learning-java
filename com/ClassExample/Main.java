package com.ClassExample;

public class Main {

    // Public means it has access to other files
    // Static means it does not change
    // Void means it has no return
    public static void main (String[] args) {

        // to make an object from a class, type the name of the class, name it, and set it equal to a new class.
        // the parens make it a constructor which means it makes the object
        Class1 c =  new Class1();
        Class1 d = new Class1();
        Class2 e = new Class2();

        // You can make many objects with one class!
        System.out.println(c.x);
        System.out.println(d.x);
        System.out.println(e.y);

        c.printHigh();
        d.printHigh();
    }
}