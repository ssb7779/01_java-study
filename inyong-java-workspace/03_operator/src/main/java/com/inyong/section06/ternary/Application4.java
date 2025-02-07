package com.inyong.section06.ternary;

public class Application4 {
    public static void main(String[] args) {
        // 특정 문자값이 영문자인지 아닌지 판별 후 출력
        // 영문자일 경우 "영문자이다", 그게 아닐경우 "영문자가 아니다"

        char cha = '3';

        char cha2 = 95;
        System.out.println(cha2);
        String result = (cha >= 'A' && cha <= 'Z')
                || (cha >= 'a' && cha <= 'z')
                ? "영문자이다" : "영문자가 아니다";
        System.out.println(result);
        // 우선순위 엔드가 더 높다! and > or



    }
}
