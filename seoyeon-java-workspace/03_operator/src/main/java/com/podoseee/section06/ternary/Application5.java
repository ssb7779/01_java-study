package com.podoseee.section06.ternary;

public class Application5 {
    public static void main(String[] args) {
        // 특정 정수값이 양수인지, 음수인지, 0인지를 정확하게 판별한 후 출력
        int num = 0;

        //내가쓴오류코드         String result = (num > 0 || num < 0 || num = 0) ? "양수" : "음수" : "0";
        String result = (num < 0 ) ? "음수" : (num == 0 ? "0" : "양수");
        System.out.println(result);
    }
}
