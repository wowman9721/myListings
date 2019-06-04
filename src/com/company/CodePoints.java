package com.company;

public class CodePoints {

    public void createCodePoints(){
        char ch = '现';
        String str = new String("现");
        int b = str.getBytes().length;
        System.out.println("String size = "+str.getBytes().length);
        System.out.println(ch);
        System.out.println(str);
        String str1 ="现紁細";
        System.out.println("Строка- "+str1);
        System.out.println("Длина строки- "+str1.length());
        System.out.println("Длина строки в байтах - "+str1.getBytes().length);
        for (int i=0;i<str1.codePointCount(0,str1.length());i++){
            int index = str1.offsetByCodePoints(0,i);
            int code = str1.codePointAt(index);
            int [] mas = {code};
            System.out.println(i+"-й символ: "+Integer.toHexString(code)+" "+new String(mas,0,mas.length));

        }


    }
}
