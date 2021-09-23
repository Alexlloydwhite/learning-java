package com.FinalKeyword;

final public class OtherFinal {

    public static void main(String[] args) {
        Final f = new Final();
    }

}

//class OtherClass extends OtherFinal {}

// if we have a final public class and want to make a new class that extends it,
// we cannot do this. Extends = inherets which means OtherClass is now a subclass of OtherFinal.
// Because OtherFinal is a final class, we cannot make a new version of it.