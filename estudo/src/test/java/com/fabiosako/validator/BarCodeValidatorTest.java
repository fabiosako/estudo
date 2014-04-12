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
        boolean valido = BarCodeValidator.validateBarCode("7891317003715");
        Assert.assertTrue(valido);
        
        valido = BarCodeValidator.validateBarCode("726412175425");
        Assert.assertTrue(valido);
        
    }
}
