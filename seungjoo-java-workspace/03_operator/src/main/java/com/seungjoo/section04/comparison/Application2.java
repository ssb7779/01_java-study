package com.seungjoo.section04.comparison;

public class Application2 {
    public static void main(String[] args) {
        // 논리값 간의 비교는 동등비교만 가능(대소비교 불가능)

        char ch1 = 'a'; //97
        char ch2 = 'A'; //65
              //문자 값간의 비교연산

        //System.out.println("ch1 == ch2 " + (ch1 == ch2);
        System.out.println("ch1 == ch2 " + (ch1 != ch2));
        System.out.println("ch1 == ch2 " + (ch1 > ch2));
        //System.out.println("ch1 == ch2 " + (ch1 <90);

        //문자열값 간의 비교연산
        String str1 = "java";
        String str2 = "java";
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 != str2: " + (str1 != str2));
    }
}