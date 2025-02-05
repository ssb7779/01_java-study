package com.john.section04.comparison;

public class Application2 {
    public static void main(String[] args) {

        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 == bool2 " + (bool1 == bool2));
        System.out.println("bool1 != bool2 " + (bool1 != bool2));
        
        // 논리값 간의 비교는 동등비교만 가능
//        System.out.println("bool1 > bool2: " + (bool1 > bool2));

        // 문자값 간의 비교
        char ch1 = 'a';
        char ch2 = 'A';
        System.out.println("ch1 == ch2 " + (ch1 == ch2));
        System.out.println("ch1 != ch2 " + (ch1 != ch2));
        System.out.println("ch1 > ch2 " + (ch1 > ch2));
        System.out.println("ch1 < 90 " + (ch1 < 90));
        System.out.println("ch1 + 90 " + (ch1 + 90));

        String str1 = "java";
        String str2 = "java";
        System.out.println("str1 == str2 " + (str1 == str2));
        System.out.println("str1 != str2 " + (str1 != str2));
//        System.out.println("str1 > str2 " + (str1 > str2));

    }
}
