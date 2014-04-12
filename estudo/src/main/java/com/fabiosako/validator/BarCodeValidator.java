/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.fabiosako.validator;

import org.apache.commons.lang3.StringUtils;

/**
 *
 * @author fabio
 */
public class BarCodeValidator {

    public static final String ONLY_NUMBER = "[^0-9]+";

    public static String validateBarCode(String barcode) {
        String barcodeValidated = null;
        if (barcode != null) {
            String bar = barcode.replaceAll(ONLY_NUMBER, "");
            int checkSum = 0;

            if (bar.length() == 13 || bar.length() == 12) {
                Integer digit;
                bar = StringUtils.leftPad(bar, 13, "0");
                for (int i = 0; i < bar.length(); i++) {
                    digit = Character.getNumericValue(bar.charAt(i));
                    checkSum += i % 2 == 0 ? digit : digit * 3;
                }
                if (checkSum % 10 == 0) {
                    barcodeValidated = bar;
                }
            }
        }

        return barcodeValidated;
    }

}
