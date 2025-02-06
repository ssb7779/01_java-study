package com.jjanggu.section06.ternary;

public class Application5 {

    public static void main(String[] args) {
        // 특정 정수값이 양수인지, 음수인지, 0인지를 정확하게 판별 후 출력

        int num = 0;

        String result = (num < 0) ? "음수이다" : (num != 0) ? "양수이다" : "0이다";
        System.out.println(result);

    }
}
