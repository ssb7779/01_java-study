package com.sotogito.practice;

public class PracApplication4 {
    public static void main(String[] args) {
        char chrA = 'a';
        int numA =/*(int)*/ chrA;

        int asciiNum = 97;
        char asciiChar = (char) asciiNum;

        System.out.printf("문자 %c의 unicode : %d", asciiChar, asciiNum);

       // System.out.printf("문자 %c의 unicode : %d", asciiNum, asciiNum); %c 바로 나옴
    }

}
