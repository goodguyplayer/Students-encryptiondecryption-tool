package com.company.methods.ggpsfuncrypto;
import java.util.ArrayList;
import java.util.List;

class Decrypt {

    // Main method for decryption
    public String decrypt(String input){
        int size = input.length();
        int counter = 0;
        String helper = "";
        String output = "";
        char letter;

        // Store each "character" in the array
        for (int i = 0; i < size/3; i++) {
            helper += input.charAt(i+(size/3));
            counter += 1;

            // Once we reach the first 3 characters, convert it into String and add it.
            if (counter == 3){
                counter = 0;
                letter = (char) Integer.parseInt(helper,8);
                output += letter;
                helper = "";
            }
        }

        return output;
    }
}
