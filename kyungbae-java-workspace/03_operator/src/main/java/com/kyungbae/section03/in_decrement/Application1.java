package com.kyungbae.section03.in_decrement;

public class Application1 { // class start

    public static void main(String[] args) { // main start

        /*
            # 증감연산자
            1. 단항 연산자
            2. 종류
                1) ++ : 변수값 + 1
                    [표현법] ++변수, 변수++
                2) -- : 변수값 - 1
                    [표현법] --변수, 변수--
            3. 작성위치에 따라
                1) 전위 연산 : (증감연산자)변수 => 선증감 후처리
                2) 후위 연산 : 변수(증감연산자) => 선처리 후증감

         */

        // 전위 연산
        // 연산 후 표출
        int num1 = 10;
        System.out.println("origin num1 = " + num1);
        System.out.println("1회 증가 num1 = " + ++num1);   // num1 = 11
        System.out.println("2회 증가 num1 = " + ++num1);   // num1 = 12
        System.out.println("3회 증가 num1 = " + ++num1);   // num1 = 13
        System.out.println("최종 num1 = " + num1);    // 13 출력


        System.out.println("-------------------");

        // 후위 연산
        // 표출 후 연산
        int num2 = 10;
        System.out.println("origin num2 = " + num2);
        System.out.println("1회 증가 num2 = " + num2++); // 10 출력 후 num2 = 11 증가
        System.out.println("2회 증가 num2 = " + num2++); // 11 출력 후 num2 = 12 증가
        System.out.println("3회 증가 num2 = " + num2++);
        System.out.println("최종 num2 = " + num2);






    } // main end

} // class end
