package com.Enums;

public class LetsDoEnums {

    enum Flavor {
        CHOCOLATE, VANILLA, STRAWBERRY;

        public static void getVanilla() {
            System.out.println(Flavor.VANILLA);
        }
    }

    public static void main(String[] args) {
        Flavor flav = Flavor.VANILLA;
        flav.getVanilla();

        if(flav == flav.VANILLA) {
            System.out.println("It's Vanilla");
        } else if (flav == flav.CHOCOLATE) {
            System.out.println("It's Chocolate");
        } else if (flav == flav.STRAWBERRY) {
            System.out.println("It's Strawberry");
        }

    }

}
