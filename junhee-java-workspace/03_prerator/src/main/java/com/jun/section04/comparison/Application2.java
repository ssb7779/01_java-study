package com.jun.section04.comparison;

public class Application2 {
    public static void main(String[] args) {

        // 논리값 간의 비교 연산(대소비교 x)
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 == bool2 : " + (bool1 == bool2));
        System.out.println("bool1 != bool2 : " + (bool1 != bool2));

//        System.out.println("bool1 > bool2 : " + (bool1 > bool2));
        // 논리값 간의 비교는 동등비교만 가능 (대소비교 불가능)

        // 문자값 간의 비교 연산(대소비교 o)
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65
        char ch3 = 'h';
        System.out.println("ch1 == ch2 : " + (ch1 == ch2));
        System.out.println("ch1 != ch2 : " + (ch1 != ch2));
        System.out.println("ch1 > ch2 : " + (ch1 > ch2));
        System.out.println("ch1 < 90 : " + (ch1 < 90));
        System.out.println("ch3 > 15 : " + (ch3 > 15));


        // 문자열값 간의 비교 연산(대소비교 x)
        String str1 = "java";
        String str2 = "java";
        System.out.println("str1 == str2 : " + (str1 == str2));
        System.out.println("str1 != str2 : " + (str1 != str2));
//        System.out.println("str1 > str2 : " + (str1 > str2));

    }
}
