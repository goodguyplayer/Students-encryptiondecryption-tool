package com.company.methods.ggpsfuncrypto;

import java.util.Scanner;

public class GGPsFunCrypto {
    Encrypt encrypt = new Encrypt();
    Decrypt decrypt = new Decrypt();

    public void funCrypto(){
        Scanner input = new Scanner(System.in);
        System.out.println("Please select which one you wish to see.");
        int leaveloop = 0;
        while (leaveloop != 1){
            System.out.println( "1 - Encrypt string. \n" +
                                "2 - Decrypt string. \n" +
                                "3 - View description. \n" +
                                "4 - Exit loop.");
            String choice = input.nextLine();
            switch (choice){
                case "1":
                    System.out.println("Please input the string to be encrypted");
                    String toencrypt = input.nextLine();
                    System.out.println(encrypt.encrypt(toencrypt));
                    break;
                case "2":
                    System.out.println("Please input the string to be decrypted");
                    String todencrypt = input.nextLine();
                    System.out.println("dencrypt.dencrypt(todencrypt)");
                    break;
                case "3":
                    description();
                    break;
                case "4":
                    System.out.println("Leaving loop, returning to previous menu");
                    leaveloop = 1;
                    break;
                default:
                    System.out.println("Input not recognized. Please use one of the given ones");
                    break;
            }
        }
    }



    // Description of the crypto method
    private void description(){
        System.out.println(
                "GGP's Fun crypto \n" +
                        "Encryption.: \n" +
                        " - It first takes a string, calculates the size of it. Then, it'll convert the string in a string of oct.  \n" +
                        " - For said size, it'll start 2 string (\"Back\" and \"Front\") and fill it with random numbers (from 100 to 999). \n" +
                        " - After that, it'll combine \"Front\" + main (oct) + \"Back\" into one large string and output it. \n" +
                        "\n" +
                        "Decryption.: \n" +
                        " - It first takes the string, calculates the size of it. Then split it into 3 strings, taking the middle. \n" +
                        " - With the middle string, make it easier and get a list of every 3 numbers. Convert them all into letters \n" +
                        " - Output result "
        );
    }

}
