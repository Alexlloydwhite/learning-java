package com.WhatIsThis;

public class ThisIsFun {

    int a;
    int b;
    String food;
    char size;

    public void setSpoonData(String food, char size) {
        this.food = food;
        this.size = size;
    }

    public void setData(int a, int b) {
        this.a = a;
        this.b = b;
    }

    public static void main(String[] args) {

        ThisIsFun t = new ThisIsFun();

        t.setData(4,3);
        System.out.println(t.a);
        System.out.println(t.b);

        t.setSpoonData("Ice Cream", 'L');
        System.out.println(t.size);
        System.out.println(t.food);

    }

}
