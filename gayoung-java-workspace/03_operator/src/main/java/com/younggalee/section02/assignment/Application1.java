package com.younggalee.section02.assignment;

public class Application1 {
    /*
        ## 복합 대입 연산자 ##
        1. 산술연산자와 대입연산자가 결합되어있는 형태
        2. 연산처리 속도가 **빨라지므로** 사용하는걸 권장
        3. 종류
           : += -= *= /= %=

     */
    public static void main(String[] args) {
        int num = 12;

        System.out.println("최초 num: " + num);

        //num = num + 3;
        //연산 순서 : 덧셈연산 >> 대입연산
        num += 3;
        System.out.println("3증가된 num : " + num);

        //문자열과 복합대입연산자
        String str = "Hello";

        str += "World";
        System.out.println(str);

    }
}
