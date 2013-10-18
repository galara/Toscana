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

    private static MessageDigest md;

    public static String encryptPassword(char[] passwd) {
        String password = new String(passwd);
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passBytes = password.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }

    public static String encryptPassword(String passwd) {
        try {
            md = MessageDigest.getInstance("MD5");
            byte[] passBytes = passwd.getBytes();
            md.reset();
            byte[] digested = md.digest(passBytes);
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digested.length; i++) {
                sb.append(Integer.toHexString(0xff & digested[i]));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(Encrypter.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }
}
