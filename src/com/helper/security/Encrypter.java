/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.helper.security;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 *
 */
public class Encrypter {

    private static String encryptionAlgorithm="MD5";
    private static MessageDigest messageDigester;

    public static String encryptPassword(char[] inp_password) {
        String uncrypted_password = new String(inp_password);
        try {
            messageDigester = MessageDigest.getInstance(encryptionAlgorithm);
            byte[] passwordBytes = uncrypted_password.getBytes();
            messageDigester.reset();
            byte[] digestedBytes = messageDigester.digest(passwordBytes);
            StringBuilder encryptedPasswordBuilder = new StringBuilder();
            for (int i = 0; i < digestedBytes.length; i++) {
                encryptedPasswordBuilder.append(Integer.toHexString(0xff & digestedBytes[i]));
            }
            return encryptedPasswordBuilder.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String encryptPassword(String inp_password) {
        try {
            messageDigester = MessageDigest.getInstance(encryptionAlgorithm);
            byte[] passwordBytes = inp_password.getBytes();
            messageDigester.reset();
            byte[] digestedBytes = messageDigester.digest(passwordBytes);
            StringBuilder encryptedPasswordBuilder = new StringBuilder();
            for (int i = 0; i < digestedBytes.length; i++) {
                encryptedPasswordBuilder.append(Integer.toHexString(0xff & digestedBytes[i]));
            }
            return encryptedPasswordBuilder.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
