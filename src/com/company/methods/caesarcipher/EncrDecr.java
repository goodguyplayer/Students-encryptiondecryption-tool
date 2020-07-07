package com.company.methods.caesarcipher;

import static java.lang.Character.*;

class EncrDecr {

    public String encrDecr(String input, int shift){
        String output = "";
        int size = input.length();
        char letter;
        char tester;

        // For every char, shift based on the given shift.
        for(int i = 0; i < size; i++){
            letter = input.charAt(i);
            tester = (char) (letter + shift);

            //This is gonna be ugly. Fix later? There should be a way to switch case this or even better...
            // If character is uppercase, get into this block
            if (Character.isUpperCase(letter)){
                if (tester > 'Z'){
                    output += (char)(tester - 26);
                }
                else {
                    output += (char)(tester);
                }
                // Else, if lowercase, get into this block
            } else if (Character.isLowerCase(letter)){
                if (tester  > 'z'){
                    output += (char)(tester - 26);

                }
                // However, if it's not a character (space, comma, dots), just add
                else {
                    output += (char)(tester);
                }
            } else {
                output += letter;
            }
        }
        return output;
    }

    // Sometimes, we don't know what the shift is. So use them all!
    public void bruteForce(String input){
        for (int i = 0; i < 26; i++) {
            System.out.println("Test "+ (i+1) +" out of 26");
            System.out.println(encrDecr(input, i));
            System.out.println("\n");
        }

    }
}
