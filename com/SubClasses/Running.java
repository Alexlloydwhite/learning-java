package com.SubClasses;

public class Running extends Shoe{

    public final double weight;

    public void display () {

        System.out.println(
                this.brand + " size " + this.size + " " + this.weight + " grams / shoe"
        );
    }

    Running(String brand, double size, double weight) {
        super(brand, size);
        this.weight = weight;
    }

}
