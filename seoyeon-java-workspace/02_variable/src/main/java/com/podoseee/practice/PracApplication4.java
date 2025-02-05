package com.podoseee.practice;

public class PracApplication4 {
    public static void main(String[] args){
        // 처음 오류 코드
        /*
        char A = 0;
        A = 'a';
        System.out.println("문자 a의 unicode : " + A);
        */

        // 수정 코드
        char charA = 'a';
        System.out.println("문자 a의 유니코드 : " + (int)charA);

        // 선생님 코드
        /*
        char ch = 'a';
        System.out.println("문자 %c의 unicode : %d", ch, (int)ch);
         */
        /*
        int chInt = ch;
        System.out.println("문자 " + ch = "의 unicode : " + chInt);
         */
    }
}
