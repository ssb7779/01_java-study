package com.podoseee.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        int a = 23;

        String result = (a <= 13) ? "어린이" : ((a > 13 && a <=19) ? "청소년" : "성인");
        System.out.println(result);

        /*
            선생님 풀이
             String result = (a <= 13) ? "어린이" : ((a <=19) ? "청소년" : "성인");
         */
        //질문 : 음수처리? -> 음수 고려 안함
    }
}
