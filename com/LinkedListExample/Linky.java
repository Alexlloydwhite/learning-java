package com.LinkedListExample;

import java.util.Iterator;
import java.util.LinkedList;

public class Linky {

    public static void main(String[] args) {
        LinkedList<Integer> linky = new LinkedList<Integer>();

        linky.add(6);
        linky.add(78);
        linky.add(1);

        System.out.println(linky);

        Iterator it = linky.iterator();
        while(it.hasNext()) {
            if((int)it.next() == 78) {
                System.out.println("We found 78!");
            }
        }
    }
}
