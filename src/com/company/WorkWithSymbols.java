package com.company;

public class WorkWithSymbols {

    public void createSymbols(){
        String attention = "Внимание: ";
        String s1 = attention.concat("!!!");
        String s2 = attention + "неизвестный символ";
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        String str1 = "2" + 2 + 2;
        String str2 = 2 + 2 + "2";
        String str3 = "2" + (2 + 2);
        System.out.println("str1="+str1+"; str2="+str2+"; str3="+str3);




    }
}
