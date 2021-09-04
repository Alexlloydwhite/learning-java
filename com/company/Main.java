package com.company;

import java.awt.*;
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
    }

}
