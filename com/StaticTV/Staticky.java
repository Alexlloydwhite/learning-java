package com.StaticTV;

public class Staticky {

    // static = global. Can be accessed by all methods in the class.
    static int a = 0;

    public static void main(String[] args) {
        int b = 1;

        // Without using static keyword on int a:
        // Staticky s = new Staticky();
        // system.out.println(s.a);

        System.out.println(a);
    }
}
