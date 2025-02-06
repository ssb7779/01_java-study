package com.kyungbae.section04.comparison;

public class Application2 { // class start

    public static void main(String[] args) { // main start

        // 논리값 간의 비교 연산
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println("bool1 == bool2 = " + (bool1 == bool2)); // false
        System.out.println("bool1 != bool2 = " + (bool1 != bool2)); // true

//        System.out.println("bool1 > bool2 = " + (bool1 > bool2));
//        논리값 간 대소비교는 사용 불가

//        문자값 간 비교 연산
        char ch1 = 'a'; // 97
        char ch2 = 'A'; // 65

        System.out.println("ch1 == ch2 = " + (ch1 == ch2));
        System.out.println("ch1 != ch2 = " + (ch1 != ch2));
        System.out.println("ch1 > ch2 = " + (ch1 > ch2));   // 문자를 코드 값으로 계산하여 대소구분 가능
        System.out.println("ch1 < 90 = " + (ch1 < 90));

//         문자열값 간 비교연산
        String str1 = "java";
        String str2 = "java";
        System.out.println("str1 == str2 = " + (str1 == str2));
        System.out.println("str1 != str2 = " + (str1 != str2));
//        System.out.println("str1 > str2 = " + (str1 > str2)); // 대소비교 불가

        char c1 = 'a';
        System.out.println("c1 = " + c1);
        char c2 = c1++;
        System.out.println("c1 = " + c1);
        System.out.println("c2 = " + c2);


    } // main end

} // class end
