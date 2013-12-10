/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.toscana.helper.parsing;

/**
 *
 * @author arandilopez
 */
public class ToscanaParseUtility {
    
    public static String toString(Double doubleToParse){
        return String.valueOf(doubleToParse);
    }
    
    public static String toString(Integer integerToParse){
        return String.valueOf(integerToParse);
    }
    
    public static Double stringToDouble(String stringToParse){
        return Double.parseDouble(stringToParse);
    }
    
    public static int stringToInt(String stringToParse){
        return Integer.parseInt(stringToParse);
    }
    
    
}
