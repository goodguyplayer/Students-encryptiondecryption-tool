package com.company.methods.caesarcipher;

public class CaesarCipher {

    private void description(){
        System.out.println("Caesar Cipher. \n" +
                "A favourite classic. \n" +
                "\n" +
                "Encryption.: \n" +
                " - Takes a string and the decimal representation to them. \n" +
                " - For every letter, walk forward or back \"x\" positions. \n" +
                " - Return result. If overflown (Like, say, 26), just repeat back to the first letter and add the rest. \n" +
                "\n" +
                "Decryption.: \n" +
                " - Almost like the encryption, just going back (or forward) x positions");
    }

}
