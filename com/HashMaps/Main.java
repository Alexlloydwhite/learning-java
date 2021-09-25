package com.HashMaps;

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> hash = new HashMap<String, Integer>();

        hash.put("a", 10);
        hash.put("b", 3);
        hash.put("c", 88);

        System.out.println(hash.get("c"));

        HashMap<String, String> hash2 = new HashMap<String, String>();

        hash2.put("BobbyJoe1996", "FluffyP0nies");
        hash2.put("HelloKittyFan21", "AloveVera?");
        hash2.put("Coolguy42", "password123");

        System.out.println(hash2.containsValue("password123"));

        if (hash2.containsKey("Coolguy42")) {
            System.out.println("Found Key");
        } else {
            System.out.println("Key not found");
        }

        // You cannot rely on the order of Hash Maps, as you would with Arrays.
        // Changing the key / values of Hash Maps can change the order of the Hash Map.

        System.out.println(hash2);
        hash2.replace("BobbyJoe1996", "b3tt3rP@ssword!");
        System.out.println(hash2);
    }
}
