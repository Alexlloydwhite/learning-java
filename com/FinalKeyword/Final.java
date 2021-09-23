package com.FinalKeyword;

// The final keyword means final value. It's final / done and CANNOT CHANGE.

public class Final {

    // all final(constant) variables should be in ALL_CAPS
    final int MAX_VALUE = 5;
    final int MIN_VALUE = 0;
    static final double PI = 3.14159;

    // You can also put final values into contructors like so..
    // final int MAX_VALUE;
    // Final() {
    //      MAX = 5;
    // }

    final public void sayHi() {
        System.out.println("hi!");
    }

    public static void main(String[] args) {
        Final f = new Final();
        System.out.println(f.MAX_VALUE);
        f.sayHi();
    }
}

// This would throw the follow error: /'sayHi()' cannot override 'sayHi()' in 'com.FinalKeyword.Final'; overridden method is final

//class OtherClass extends Final {
//    public void sayHi() {
//        System.out.println("hello!");
//    }
//}