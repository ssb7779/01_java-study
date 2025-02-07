package com.kyungbae.section06.ternary;

public class Application5 { // class start

    public static void main(String[] args) { // main start

//        특정 정수값이 양수인지, 음수인지, 0인지를 판별 후 출력
        int num = -0;

//        String result = (조건문) ? 반환값 : ( (조건문) ? 반환값 : 반환값 )
        String result = (num < 0) ? "음수이다" : (num == 0 ? "0이다" : "양수이다");

        System.out.println(result);


    } // main end

} // class end
