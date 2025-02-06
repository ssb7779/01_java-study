package com.kyungbae.section02.assignment;

public class Application1 { // class start

    public static void main(String[] args) {

        int num = 12;
        System.out.println("origin num : " + num);

        num += 5;
//        num = num + 5;
        System.out.println("num +5 : " + num);

        num -= 5;
        System.out.println("num -5  : " + num);

        num *= 2;
        System.out.println("num *2 : " + num);

        num /= 2;
        System.out.println("num /2 : " + num);

        num %= 4;
        System.out.println("num %4 : " + num);

        // 문자열과 복합대입연산자
        String str = "Hello";

        str += "World";
        System.out.println(str);


    }



} // class end
