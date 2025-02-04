package com.pch.practice;

public class PracApplication3 {
    public static void main(String[] args) {
        /**
         * 문제
         * 이름과 나이, 성별(여 또는 남), 키 에 대한 정보를 기록 할 수 있는 변수를 만든 후
         * 해당 변수에 각 본인 정보의 데이터를 대입한 후 출력하시오.
         */
        int age = 26;
        String name = "박찬혁";
        String sex = "남자";
        double height = 188.2;

        System.out.printf("%d 살 %s %s님 키가 %.1fcm 이시군요!",age,name,sex,height);
    }
}
