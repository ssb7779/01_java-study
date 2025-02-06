package com.younggalee.section06.ternary;

public class Application5 {
    public static void main(String[] args) {
        int num = -7;
        String result = (num > 0) ? "양수이다" : (num == 0) ? "0이다": "음수이다";


        System.out.println(result);

    }
}
