package com.company;

import java.util.Calendar;
import java.util.Formatter;
import java.util.Timer;

public class FormatOperation {
    public void operateWithFormat(){

        Formatter formatter = new Formatter();
        boolean b1 = true;
        Boolean b2 = null;
        formatter.format("1. - %b, %b\n", b1, b2);
        System.out.print(formatter);
        System.out.println("-------------------------------");
        Timer t = new Timer();
        formatter.format("2. - %h", t);
        System.out.println(formatter);
        System.out.println(Integer.toHexString(t.hashCode()));
        Formatter formatter1 = new Formatter();
        double d1 = 16.78967;
        formatter1.format("%1$e, %<f, %<g, %<a\n", d1);
        System.out.println(formatter1);
        Formatter formatter2 = new Formatter();
        int i1 = 17;
        double d2 = 16.78967;
        formatter2.format("1. (%%o) %o%n", i1);
        formatter2.format("2. (%%a) %a%n", d2);
        formatter2.format("3. (%%x) %x%n", i1);
        formatter2.format("4. (%%#o) %#o%n", i1);
        formatter2.format("5. (%%#a) %#a%n", d2);
        formatter2.format("6. (%%#x) %#x%n", i1);
        System.out.println(formatter);
        Formatter formatter3 = new Formatter();
        int i2 = 345;
        double d3 = 16.78967;
        formatter.format("- %-7dok%n", i2);
        formatter.format("- %+7dok%n", i2);
        formatter.format("- % 7dok%n", i2);
        formatter.format("- %07dok%n", i2);
        formatter.format("- %#fok%n", d3);
        formatter.format("- %.2fok%n", d3);
        System.out.println(formatter);
        Formatter formatter4 = new Formatter();
        Calendar calendar = Calendar.getInstance();
        formatter.format("%tr", calendar);
        System.out.println(formatter4);




    }
}
