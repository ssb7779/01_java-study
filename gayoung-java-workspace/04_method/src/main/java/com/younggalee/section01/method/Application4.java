package com.younggalee.section01.method;

public class Application4 {
    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int num = calc.returnIntNumber();
        System.out.println(num);

        System.out.println(calc.divide(7, 3));
//        System.out.println(calc.divide(7, 3.0));
        System.out.println(calc.max(5,6));
        System.out.println(calc.min(5,6));

        //ctrl 누르고 마우스 가져다대면 메소드 단에 하이퍼링크 생김 document 확인 가능
        // ****************
    }


}
