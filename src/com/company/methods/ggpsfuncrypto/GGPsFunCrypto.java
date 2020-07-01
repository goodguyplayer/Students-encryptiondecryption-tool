package com.company.methods.ggpsfuncrypto;

public class GGPsFunCrypto {



    // Description of the crypto method
    public void description(){
        System.out.println(
                "GGP's Fun crypto \n" +
                        "Encryption.: \n" +
                        " - It first takes a string, calculates the size of it. Then, it'll convert the string in a list of oct.  \n" +
                        " - For said size, it'll start 2 lists (\"Back\" and \"Front\") and fill it with random numbers (from 100 to 999). \n" +
                        " - After that, it'll combine \"Front\" + main list (oct) + \"Back\" into one large string and output it. \n" +
                        "\n" +
                        "Decryption.: \n" +
                        " - It first takes the string, calculates the size of it. Then split it into 3 strings, taking the middle. \n" +
                        " - With the middle string, make it easier and get a list of every 3 numbers. Convert them all into letters \n" +
                        " - Output result "
        );
    }

}
