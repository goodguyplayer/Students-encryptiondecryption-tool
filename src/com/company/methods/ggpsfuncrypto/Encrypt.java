package com.company.methods.ggpsfuncrypto;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Encrypt {
    public String encrypt(String input){
        // String for outputting the result
        String output = "";
        int size = 0;

        //Arrays for the numbers
        ArrayList<Integer> front = new ArrayList<Integer>();
        ArrayList<Integer> middle = new ArrayList<Integer>();
        ArrayList<Integer> back = new ArrayList<Integer>();

        return output;
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
