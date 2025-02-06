package com.sotogito.section02.assigment;

public class Application1 {
    public static void main(String[] args) {
        /**
         * ## 복합 대입 연산자
         * 1. 산술연ㅅ나자와 대입연산자가 결합되어있는 형태
         * 2. 연산처리 속도가 빨라지므로 사용하는 걸 권장
         * 3. 종류 : += -+ *= /= %=
         */

        int num = 12;
        System.out.println("최초 num = " + num);

        num -=5;
        System.out.println("5감소된  num = " + num);

        num +=6;
        System.out.println("6배 증가된  num = " + num);

        num /= 2;
        System.out.println("2배 감소된  num = " + num);

        num %= 2;
        System.out.println("최종  num = " + num);


        //문자열과 복합대입연산자
        String str = "abc";
        str += "def";
        System.out.println(str);

    }


}
