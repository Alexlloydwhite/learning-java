package com.OOP;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Pen p = new Pen();

        System.out.println(p.color);
        System.out.println(p.point);
        System.out.println(p.type);

        System.out.println(p.clicked);

        p.click();

        System.out.println(p.clicked);

        Headphones h = new Headphones();

        System.out.println(Arrays.toString(h.controls));
    }

}
