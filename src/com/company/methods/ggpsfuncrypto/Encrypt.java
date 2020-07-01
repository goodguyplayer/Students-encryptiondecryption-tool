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

        // Loop that'll convert every letter from input into oct
        for (int i = 0; i < size; i++) {
            char letter = input.charAt(i);
            middle += Integer.toOctalString(letter);
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
