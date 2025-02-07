package com.podoseee.section06.ternary;

public class Application4 {
    public static void main(String[] args) {
        // 특정 문자값이 영문자인지 아닌지 판별 후 출력
        // 영문자일 경우 "영문자이다", 그게 아닐 경우 "영문자가 아니다"
        char ch = '3';
        //내가쓴오류코드         String result = ((ch >= 'a') || (ch <= 'z'))  ? "영문자이다" : "영문자가 아니다";
        String result = (ch >= 'a' && ch <= 'z'
                            || ch >= 'A' && ch <= 'Z') ? "영문자이다"
                                                       : "영문자가 아니다"; // &&이 ||보다 먼저 계산
        System.out.println(result);
    }
}
