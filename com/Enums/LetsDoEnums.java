package com.Enums;

enum Level {
    LOW, MEDIUM, HIGH;
}

public class LetsDoEnums {

    public static void main(String[] args) {

        Level l = Level.LOW;

        switch(l) {
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }
    }

}
