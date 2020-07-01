package com.company.methods.caesarcipher;

import java.util.Scanner;

public class CaesarCipher {
    Scanner input = new Scanner(System.in);
    EncrDecr encrDecr = new EncrDecr();

    public void caesarCipher(){
        int leaveloop = 0;
        String toChange;
        System.out.println("Now at \"Caesar Cipher - Shift Cipher\". \n" +
                "Warning.: Only accept lowercase characters, no special character or spaces. \n" +
                "Please select which one you wish to see.");
        while (leaveloop != 1){
            System.out.println( "1 - Encrypt or decrypt. \n" +
                                "2 - Bruteforce. \n" +
                                "3 - Description. \n" +
                                "4 - Exit");
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Please input the string");
                    toChange = input.nextLine();
                    System.out.println("Please input the shift");
                    String shift = input.nextLine();
                    System.out.println(encrDecr.encrDecr(toChange, Integer.parseInt(shift)));
                    break;

                case "2":
                    System.out.println("Please input the string");
                    toChange = input.nextLine();
                    encrDecr.bruteForce(toChange);
                    break;

                case "3":
                    description();
                    break;

                case "4":
                    System.out.println("Exiting...");
                    leaveloop = 1;
                    break;

                default:
                    System.out.println("Input error. Please try again.");
                    break;
            }
        }


    }

    private void description(){
        System.out.println("Caesar Cipher. \n" +
                "A favourite classic. \n" +
                "\n" +
                "Encryption.: \n" +
                " - Takes a string and the decimal representation to them. For now, no space, special character or caps. \n" +
                " - For every letter, walk forward or back \"x\" positions. \n" +
                " - Return result. If overflown (Like, say, 26), just repeat back to the first letter and add the rest. \n" +
                "\n" +
                "Decryption.: \n" +
                " - Almost like the encryption, just going back (or forward) x positions");
    }



}
