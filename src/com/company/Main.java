package com.company;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.Locale;

public class Main {

    public static void main(String[] args) throws IOException {
        CreatingStrings create = new CreatingStrings();
        create.createString();
        CodePoints code = new CodePoints();
        code.createCodePoints();
        ReadingMethods reading = new ReadingMethods();
        reading.createReadingMethod();
        LiteralPool pool = new LiteralPool();
        pool.createPool();
        WorkWithSymbols working = new WorkWithSymbols();
        working.createSymbols();
        BlueSky sky = new BlueSky();
        sky.createBlueSky();
        PatternComparator comparator = new PatternComparator();
        comparator.compareWithPattern();
        StringOperations operation = new StringOperations();
        operation.operate();
        RegEx regEx = new RegEx();
        regEx.compareWithPattern();
        regEx.workWithGroups();
        Charset charset = new Charset();
        charset.workWithCharset();
    }
}
