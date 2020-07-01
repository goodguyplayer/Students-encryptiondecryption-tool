package com.company.methods.ggpsfuncrypto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Encrypt {

    // Main method for encryption
    public String encrypt(String input){
        int size = input.length();

        // Random strings to make the middle dirty.
        String front = randomNumbers(size);
        String back = randomNumbers(size);

        // String to be used for octs.
        String middle = "";

        // For lazy work
        String helper = "";

        // Loop that'll convert every letter from input into oct
        for (int i = 0; i < size; i++) {
            char letter = input.charAt(i);
            helper = Integer.toOctalString(letter);
            if (helper.length() != 3){
                middle += "0" + helper;
            } else {
                middle += helper;
            }
        }

        // Output result
        return (front + middle + back);
    }

    // Random number generator
    private String randomNumbers(int size){
        Random random = new Random();
        String output = "";
        for (int i = 0; i < size ; i++) {
            output += random.nextInt((1000-100) + 1) + 100;
        }
        return output;
    }

}
