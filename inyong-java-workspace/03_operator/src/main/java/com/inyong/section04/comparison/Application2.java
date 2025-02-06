package com.inyong.section04.comparison;

public class Application2 {
    public static void main(String[] args) {
        // 논리값 간의 비교 연산

        boolean boo1 = true;
        boolean boo2 = false;
        System.out.println(boo1 == boo2);
        System.out.println(boo1 != boo2);

        char a = 'a';
        char b = 'b';
          System.out.println(a > b);

          // 문자열 비교는 동등 비교만 가능
        String str1 = "abc";
        String str2 = "abc";
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
    }
}
