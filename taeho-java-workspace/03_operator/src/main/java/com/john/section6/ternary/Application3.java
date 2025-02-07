package com.john.section6.ternary;

public class Application3 {
    public static void main(String[] args) {

        char ch;
        ch = 'y';

        String result = "";

        System.out.println((ch == 'y') || (ch == 'Y') ? "프로그램을 종료합니다" : "계속 진행하겠습니다");
    }
}
