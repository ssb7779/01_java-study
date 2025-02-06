package com.kyungbae.section06.ternary;

public class Application3 { // class start

    public static void main(String[] args) { // main start

//        특정 종료 의사값(y/n)을 가지고 판별해서 출력
//        종료 의사값이 대소문자 구분 없이 y일 경우 "프로그램을 종료합니다".
//              그게 아닐 경우 "계속 진행하겠습니다" 출력

        char ch = 'k'; // 종료 의사값

        String result = ((ch == 'y') || (ch == 'Y')) ? "프로그램을 종료합니다" : "계속 진행하겠습니다";
        System.out.println(result);


    } // main end

} // class end
