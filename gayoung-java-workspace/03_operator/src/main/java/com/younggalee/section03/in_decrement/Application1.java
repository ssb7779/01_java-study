package com.younggalee.section03.in_decrement;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## 증감 연산자 ##
            1. 단항 연산자
            2. 종류
              1) ++
              2) --
            3. 작성 위치
              1) 전위 연산 : ++i  (선 증감 후 처리)
              2) 후위 연산 : i++  (선 처리 후 증감)
         */
        int num1 = 10;
        System.out.println(++num1);
        System.out.println(num1--);
        System.out.println(num1);
        num1+=1;
        System.out.println(num1);



    }
}
