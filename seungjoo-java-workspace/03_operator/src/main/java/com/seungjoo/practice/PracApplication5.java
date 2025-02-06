package com.seungjoo.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        
        int num = 14;
        
        String result = (num <=13 ? "어린이" : (num>19 ? "성인" : "청소년"));

        System.out.println("result = " + result);
    }
}
