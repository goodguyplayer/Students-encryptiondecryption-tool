package com.company.methods.caesarcipher;

class EncrDecr {

    public String encrDecr(String input, int shift){
        String output = "";
        int size = input.length();

        // For every char, shift based on the given shift.
        for(int i = 0; i < size; i++){
            char letter = (char)(input.charAt(i) + shift);

            // We should fix this later, add spaces, special characters and caps.
            if (letter > 'z')
                output += (char)(input.charAt(i) - (26-shift));
            else
                output += (char)(input.charAt(i) + shift);
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
