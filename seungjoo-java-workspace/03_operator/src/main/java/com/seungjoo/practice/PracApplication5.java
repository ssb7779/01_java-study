package com.seungjoo.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        
        int age = 14;
        
        String result = (age <=13 ? "어린이" : (age>19 ? "성인" : "청소년"));

        System.out.println("result = " + result);
    }
}
