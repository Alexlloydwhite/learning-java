package com.company;

public class Pen {

    String type = "gel";
    String color = "blue";
    int point = 10;

    static boolean clicked = false;

    public static void click() {
        clicked = true;
    }

    public static void unClick() {
        clicked = false;
    }

}
