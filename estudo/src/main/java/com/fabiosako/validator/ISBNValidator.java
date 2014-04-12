/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fabiosako.validator;

/**
 *
 * @author fabio
 */
public class ISBNValidator {
    
    private static final String ONLY_NUMBER_X = "[^0-9Xx]+";
    
    public static String validateISBN10(String isbn) {
        
        String isbnValidated = null;
        if(isbn != null){
            
            String onlyNumberAndX = isbn.replaceAll(ONLY_NUMBER_X, "");
            
            if(onlyNumberAndX.length() == 10){
                int checkSum = 0;
                Character digitChar = Character.toLowerCase(onlyNumberAndX.charAt(9));
                int digit = digitChar.equals('x')?10:Character.getNumericValue(digitChar);
                for(int i=2; i <= onlyNumberAndX.length();i++){
                    Character charInteger = onlyNumberAndX.charAt(onlyNumberAndX.length()-i);
                    if(Character.isDigit(charInteger)){
                     checkSum += Character.getNumericValue(charInteger) * i;   
                    }else{
                        break;
                    }
                    
                }
                if((checkSum+digit)%11 == 0){
                    isbnValidated = onlyNumberAndX;
                }
             
            }
        } 
        return isbnValidated;
    }
    
    public static String validateISBN13(String isbn13) {
        String resultado = null;
        if(isbn13 != null && (isbn13.startsWith("978") || isbn13.startsWith("979"))){
            String isbn13OnlyNumber = isbn13.replaceAll(BarCodeValidator.ONLY_NUMBER, "");
            if(isbn13OnlyNumber.length() == 13){
             resultado = BarCodeValidator.validateBarCode(isbn13OnlyNumber);   
            }
            
        }
        return resultado;
    }
    
}
