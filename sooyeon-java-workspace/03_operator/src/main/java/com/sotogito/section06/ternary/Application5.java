package com.sotogito.section06.ternary;

public class Application5 {
    public static void main(String[] args) {
        //특정 정수값이 양수인지 음수인지 0인지 판별 후 출력

        int num = -2;

        String result = (num == 0) ? "0" : (num > 0) ? "양수" : "음수";
        String result2 = (num > 0) ?
                             (num == 0) ?
                                 "0" : "양수" : "음수";

        System.out.println(result);
        System.out.println(result2);
    }
}
