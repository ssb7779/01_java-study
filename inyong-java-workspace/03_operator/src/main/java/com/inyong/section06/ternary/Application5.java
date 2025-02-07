package com.inyong.section06.ternary;

public class Application5 {
    public static void main(String[] args) {
        // 특정 정수값이 양수인지, 음수인지, 0인지를 정확하게 판별한 후 출력

        int num = 1;
        String result = (num < 0) ? "음수이다" : (num == 0 ? "0이다" : "양수이다");
        String result1 = (num < 0) ? (num < -50? "너무 작습니다": "조금 작습니다") : "적당합니다" ;

        System.out.println(result);
    }
}
