package com.sotogito.section06.ternary;

public class Application3 {
    public static void main(String[] args) {
        //특정 종료 의사값을 가지고 판별하여 출력
        //yes : "프로그램을 종료합니다."
        //no : "계속 진행하겠습니다."


        char ch = 'y';

        String result = (ch == 'Y' || ch == 'y') ? "프로그램을 종료합니다." : "계속 진행하겠습니다.";
        System.out.println(result);
    }
}
