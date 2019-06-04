package com.company;

import javax.print.attribute.standard.MediaSize;

public class LiteralPool {
    public void createPool(){
        String s1 = "Hello";
        String s2 =new StringBuffer("He").append("llo").toString();
        String s3 = s2.intern();
        System.out.println("s1==s2 "+(s1==s2));
        System.out.println("s1==s3 "+(s1==s3));
        String hello = "Hello", lo="lo";
        System.out.println((hello=="Hello")+" ");

    }
}
