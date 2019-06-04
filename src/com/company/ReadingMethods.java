package com.company;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public class ReadingMethods {
    public void createReadingMethod() throws UnsupportedEncodingException {
        byte[] data3 = {(byte)0xE3,(byte)0xEE};
        String str = "Мама мыла раму1 !";
        byte[] strCP866 = str.getBytes(Charset.forName("cp866"));
        byte[] strCP1251 = str.getBytes("cp1251");
        for(byte b:strCP866)
            System.out.println(b+" ");
        for (byte b:strCP1251)
            System.out.println(b+" ");
        System.out.println(new String(strCP866));
        System.out.println(new String(strCP866,"cp866"));
        System.out.println(new String(strCP1251));


    }
}
