package com.john.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        int x = 21;
        System.out.println(x < 0 ? "잘못된 값" :
                (x <= 13) ? "어린이" :
                (x > 13 && x < 19) ? "청소년" : "성인");
    }
}
