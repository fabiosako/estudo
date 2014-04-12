/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.fabiosako.validator;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author fabio
 */
public class ISBNValidatorTest {
    @Test
    public void testValidaISBN10(){
       boolean valido = ISBNValidator.validateISBN10("85-86470-29-5");
       Assert.assertTrue(valido);
       
       valido = ISBNValidator.validateISBN10("8586470295");
       Assert.assertTrue(valido);
       
       valido = ISBNValidator.validateISBN10("858647029X");
       Assert.assertFalse(valido);
       
       valido = ISBNValidator.validateISBN10("85864x0295");
       Assert.assertFalse(valido);
       
       valido = ISBNValidator.validateISBN10("013602212X");
       Assert.assertTrue(valido);
       
       valido = ISBNValidator.validateISBN10("013602212x");
       Assert.assertTrue(valido);
       
       valido = ISBNValidator.validateISBN10("0136022125");
       Assert.assertFalse(valido);
    }
    
    @Test
    public void testValidaISBN13(){
        boolean valido = ISBNValidator.validateISBN13("9788586470295");
        Assert.assertTrue(valido);
        
        valido = ISBNValidator.validateISBN13("9788582460672");
        Assert.assertTrue(valido);
        
        valido = ISBNValidator.validateISBN13("7891317003715");
        Assert.assertFalse(valido);
    }
}
