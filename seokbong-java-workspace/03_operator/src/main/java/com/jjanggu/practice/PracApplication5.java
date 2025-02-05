package com.jjanggu.practice;

public class PracApplication5 {
    public static void main(String[] args) {

        int year = 18;

        String result = year <= 13 ? "어린이" : year > 13 && year <= 19 ? "청소년" : "성인";
        System.out.println(result);


    }
}
