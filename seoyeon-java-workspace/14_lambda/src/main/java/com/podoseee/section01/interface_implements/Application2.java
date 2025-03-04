package com.podoseee.section01.interface_implements;

public class Application2 {
    public static void main(String[] args) {
        /*
            ## 인터페이스 구현 방식2 ##
         */

        Calculator supCalc = new Calculator(){
            @Override
            public int calc(int num1, int num2){
                return num1 * num2;
            }
        };
        System.out.println("뺄셈결과: " + supCalc.calc(5, 7));

        Calculator divCalc = new Calculator(){
            @Override
            public int calc(int num1, int num2){
                return num1 / num2;
            }
        };
        System.out.println("나눗셈결과: " + divCalc.calc(7, 5));

        /*
            장점. 구현 클래스를 별도로 만들어둘 필요없이 필요할때 바로 구현해서 쓰면됨

         */
    }
}
