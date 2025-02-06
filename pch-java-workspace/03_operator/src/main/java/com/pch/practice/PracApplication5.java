package com.pch.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        int n = 15;

        String ans = n <=13 ? "어린이" : n<=19 ? "청소년" : "성인";
        System.out.println(ans);
    }
}
