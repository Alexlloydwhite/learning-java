package com.Abstraction;

// Abstract class vs Interface ?
// an interface assumes all methods are abstract. no implemented methods are allows in an interface.
// Abstract classes allow you to have a shared method (EX; every dog barks the same but may poop differently)

abstract class Dog {

    public void bark() {
        System.out.println("Woof!!!");
    }

    public abstract void poop();
}

class Chihuahua extends Dog {

    public void poop() {
        System.out.println("Dog pooped!");
    }
}

public class AbstractionTut {

    public static void main (String[] args) {

        Chihuahua c = new Chihuahua();
        c.bark();
        c.poop();
    }
}
