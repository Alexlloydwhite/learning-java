package com.SubClasses;

public class Walking extends Shoe{

    public final boolean goreTex;
    private String goreTexMessage;

    public void display () {

        if (goreTex) {
            goreTexMessage = "Gore-Tex";
        }

        if (!goreTex) {
            goreTexMessage = "No Gore-Tex";
        }

        System.out.println(
                this.brand + " size " + this.size + " " + this.goreTexMessage
        );
    }

    Walking(String brand, double size, boolean goreTex) {
        super(brand, size);
        this.goreTex = goreTex;
    }

}
