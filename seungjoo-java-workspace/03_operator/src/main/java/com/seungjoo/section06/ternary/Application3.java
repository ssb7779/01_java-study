package com.seungjoo.section06.ternary;

public class Application3 {

    //틋정 종료의사값을 가지고 판별해서 출력
    //종료의사값이 대소문자 구분없이 y일경우 " 프로그램을 종료합니다",
    // 그게 아닐 경우 "계속 진행하겠습니다. 출력
    public static void main(String[] args) {


        char ch = 'y';

        String result = (ch == 'y' || ch == 'Y') ? "프로그램을 종료합니다" : "계속 진행하겠습니다.";
        System.out.println(result);
    }
}
