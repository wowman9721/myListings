package com.company;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatLocale {
    public void makeNumber(){
        int data[] = { 100, 1000, 10000, 1000000 };
        NumberFormat nf = NumberFormat.getInstance(Locale.US);

        for (int i = 0; i < data.length; ++i) {
            System.out
                    .println(data[i] + "\t" + nf.format(data[i]));
            double number = 9876.598;
            NumberFormat nfGer =
                    NumberFormat.getNumberInstance(Locale.GERMANY);
            NumberFormat nfJap =
                    NumberFormat.getNumberInstance(Locale.JAPANESE);
            NumberFormat nfDef = 	NumberFormat.getNumberInstance(Locale.FRANCE);

            System.out.println(": " + nfGer.format(number));
            System.out.println(": " + nfJap.format(number));
            System.out.println(": " + nfDef.format(number));
            

        }



    }
}
