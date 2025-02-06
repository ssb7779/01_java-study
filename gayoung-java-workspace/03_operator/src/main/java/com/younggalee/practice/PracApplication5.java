package com.younggalee.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        int age = 40;
        String result = age <= 13 ? "어린이" : age <=19 ? "청소년" : "성인"; // (age > 13 && age <=19) 이미 앞 조건이 false일때 넘어가는 조건이니까
        System.out.println(result);
    }
}
