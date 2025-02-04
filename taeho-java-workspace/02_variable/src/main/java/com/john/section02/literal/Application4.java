package com.john.section02.literal;


public class Application4 {
    public static void main(String[] args) {
        /* Format Keyword
            System.out.printf();
            1. %d : 정수
            2. %c : 문자
            3. %s : 문자열
            4. %f : 실수
            5. %b : 논리값
         */

        int i1 = 10;
        int i2 = 20;

        // exam
        System.out.println(i1 + " " + i2 + "%");
        System.out.printf("%d %d %%\n", i1, i2);
        System.out.printf("%d %d %d \n", i1, i2, i1 + i2);
        System.out.printf("%d \n", i1, i2, i1 + i2);
//        System.out.printf("%d %d \n", i1);

        System.out.printf("%5d \n", i1);
        System.out.printf("%10d \n", 250);
        System.out.printf("%10d \n", 12000);
        System.out.printf("%15d \n", i2);
        System.out.printf("%-5d \n", i1 + i2);

        double d1 = 1.23456789;
        double d2 = 4.53;

        System.out.printf("%f %f \n", d1, d2);
        System.out.printf("%.2f %.1f \n", d1, d2);
        System.out.printf("%.3f %-2f \n", d1, d2);

        char ch = 'a';
        String str = "hello";

        System.out.printf("%c %s\n", ch, str);
        System.out.printf("%C %S\n", ch, str);
        System.out.printf("%s %s %s\n", ch, str, ch);
//        System.out.printf("%c %c %c\n", ch, str, str, ch);
    }
}
