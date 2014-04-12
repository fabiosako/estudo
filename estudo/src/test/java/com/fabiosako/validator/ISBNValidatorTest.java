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
    public void testValidaISBN10() {
        Assert.assertEquals("8586470295", ISBNValidator.validateISBN10("85-86470-29-5"));

        Assert.assertEquals("8586470295", ISBNValidator.validateISBN10("8586470295"));

        Assert.assertNull(ISBNValidator.validateISBN10("858647029X"));

        Assert.assertNull(ISBNValidator.validateISBN10("85864x0295"));

        Assert.assertEquals("013602212X", ISBNValidator.validateISBN10("013602212X"));

        Assert.assertEquals("013602212x", ISBNValidator.validateISBN10("013602212x"));

        Assert.assertNull(ISBNValidator.validateISBN10("0136022125"));

    }

    @Test
    public void testValidaISBN13() {
        Assert.assertEquals("9788586470295", ISBNValidator.validateISBN13("9788586470295"));
        Assert.assertEquals("9788582460672", ISBNValidator.validateISBN13("9788582460672"));
        Assert.assertNull(ISBNValidator.validateISBN13("7891317003715"));
    }
}
