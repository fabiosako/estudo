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
public class BarCodeValidatorTest {
    @Test
    public void validaEAN13(){
        Assert.assertEquals("7891317003715", BarCodeValidator.validateBarCode("7891317003715"));
    }
    
    public void validateUPC(){
        Assert.assertEquals("0726412175425", BarCodeValidator.validateBarCode("726412175425"));
    }
}
