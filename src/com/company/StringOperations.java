package com.company;

public class StringOperations {
    public void operate(){

        StringBuilder sb = new StringBuilder();
        sb.append("Java StringBuilder");
        System.out.println("StringBuilder1 : " + sb);
        sb.append(" Example");
        System.out.println("StringBuilder2 : " + sb);
        StringBuilder sb1 = new StringBuilder();
        sb1.append("Java StringBuilder");
        sb1.insert(5, "insert ");
        System.out.println("StringBuilder :" + sb1);
        StringBuilder sb3 = new StringBuilder();
        sb3.append("Java StringBuilder");
        sb3.setCharAt(5, 'S');
        System.out.println("StringBuilder : "+sb3);


    }
}
