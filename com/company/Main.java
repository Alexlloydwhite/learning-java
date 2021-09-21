package com.company;

import java.awt.*;
import java.text.FieldPosition;
import java.text.NumberFormat;
import java.text.ParsePosition;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        // Primitive Types
        byte age = 30;
        long viewsCount = 3_123_456_789L;
        float price = 10.99F;
        char letter = 'A';
        boolean isEligible = true;

        // Reference Types
        Date now = new Date();
        System.out.println(now);
        Point point1 = new Point(1, 1);
        Point point2 = point1;
        point1.x = 2;
        System.out.println(point2);

        // String Literals
        String message = "Hello World" + "!!";
        System.out.println(message);
        System.out.println(message.endsWith("!!"));
        System.out.println(message.length());
        System.out.println(message.indexOf("H"));
        System.out.println(message.indexOf("e"));
        System.out.println(message.indexOf("sky"));
        System.out.println(message.replace("!", "*"));
        // In Java, strings are immutable, so any method which alters the string will return a new string object
        System.out.println(message);

        // Casting
        short x = 1;
        int y = x + 2;
        System.out.println(y);
        // Implicit casting AKA automatic conversion
        // byte > short > int > long > float > double
        // Casting float points
        double a = 1.1;
        double b = a + 2;
        System.out.println(b);
        String i = "1";
        int j = Integer.parseInt(i) + 2;
        System.out.println(j);

        // Math
        int result = Math.round(1.1F);
        System.out.println(result);
        int result2 = (int)Math.ceil(1.1F);
        System.out.println(result2);
        int result3 = (int)Math.floor((1.1F));
        System.out.println(result3);
        int result4 = Math.max(1, 2);
        System.out.println(result4);
        int result5 = (int) Math.round(Math.random() * 100);
        System.out.println(result5);
        int result6 = (int) (Math.random() * 10000);
        System.out.println(result6);

        // Formatting numbers
        String result7 = NumberFormat.getPercentInstance().format(0.1);
        System.out.println(result7);
    }

}
