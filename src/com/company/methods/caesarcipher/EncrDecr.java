package com.company.methods.caesarcipher;

import static java.lang.Character.*;

class EncrDecr {

    public String encrDecr(String input, int shift){
        String output = "";
        char letter;
        int size = input.length();

        // For every char, shift based on the given shift.
        for(int i = 0; i < size; i++){
            letter = (char) (input.charAt(i));

            //This is gonna be ugly.
            if (Character.isUpperCase(letter)){
                if (letter + shift > 'Z'){
                    output += (char)(letter - (26-shift));
                }
                else {
                    output += (char)(letter + shift);
                }
            } else if (Character.isLowerCase(letter)){
                if (letter + shift  > 'z'){
                    output += (char)(letter - (26-shift));

                }
                else {
                    output += (char)(letter + shift);
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
