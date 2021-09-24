package com.SubClasses;

public class Main {

    public static void main (String[] args) {

        Shoe[] shoeList = {
                new Running("Nike", 43.0, 250),
                new Walking("Hanwag", 43.5, true),
                new Walking("Merrel", 42.0, false),
        };

        for (int i = 0; i < shoeList.length; i++) {
            shoeList[i].display();
        }
    }
}
