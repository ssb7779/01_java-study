package com.ibe6.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        // 임의의 정수 한 개를 선언하고 해당 정수값이 13세 이하이면 “어린이”, 13세 초과 19세 이하이면 “청소년”, 19세 초과이면 “성인” 출력
        // 18살일 경우

//        int age = 18;
//        String result = (age <= 13) ? "어린이" : (age <= 19) ? "청소년" : "성인";

//        System.out.println(result);

        int age = 18;
        String result = age <= 13 ? "어린이" : age <= 19 ? "청소년" : "성인";
        // 앞에서 이미 false로 넘어왔기 때문에 또 조건문 참 : 거짓을 적음
        System.out.println(result);




    }
}
