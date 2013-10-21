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
public class PasswordEncrypter {

    private static String encryptionAlgorithm="MD5";
    private static MessageDigest messageDigester;

    public static String getEncryptedPassword(char[] inp_password) {
        String uncrypted_password = new String(inp_password);
        String encryptedPassword;
        encryptedPassword = getEncryptedPassword(uncrypted_password);
        return encryptedPassword;
    }

    public static String getEncryptedPassword(String inp_password) {
        String encryptedPassword;
        encryptedPassword = encryptPassword(inp_password);
        return encryptedPassword;
    }
        
    private static String encryptPassword(String inp_password){
        String encryptedPassword;
        try {
            messageDigester = MessageDigest.getInstance(encryptionAlgorithm);
            byte[] passwordBytes = inp_password.getBytes();
            messageDigester.reset();
            byte[] digestedBytes = messageDigester.digest(passwordBytes);
            StringBuilder encryptedPasswordBuilder = new StringBuilder();
            
            for (int i = 0; i < digestedBytes.length; i++) {
                encryptedPasswordBuilder.append(Integer.toHexString(0xff & digestedBytes[i]));
            }
            encryptedPassword=encryptedPasswordBuilder.toString();
            return encryptedPassword;
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(PasswordEncrypter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }
}
