package com.company;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class Charset {
    public void workWithCharset() throws IOException {

        InputStreamReader isrBE = new InputStreamReader(
                new FileInputStream("test16be.txt"), "utf16");
        InputStreamReader isrLE = new InputStreamReader(
                new FileInputStream("test16le.txt"), "utf16");
        char[] cbuf = new char[40];
        isrBE.read(cbuf);
        System.out.println(new String(cbuf).trim());
        cbuf = new char[40];
        isrLE.read(cbuf);
        System.out.println(new String(cbuf).trim());
        isrBE.close();
        isrLE.close();

    }
}
