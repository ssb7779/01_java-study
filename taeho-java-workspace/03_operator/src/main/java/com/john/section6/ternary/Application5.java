package com.john.section6.ternary;

public class Application5 {
    public static void main(String[] args) {

        int num;
        num = -1;

        String result;

        // 중첩삼항연산자
        result = (num < 0) ? "음수이다" : (num == 0 ? "0이다" : "양수이다");
    }
}
