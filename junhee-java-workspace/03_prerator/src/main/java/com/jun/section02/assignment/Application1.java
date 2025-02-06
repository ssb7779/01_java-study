package com.jun.section02.assignment;

public class Application1 {
    public static void main(String[] args) {


        /*
            ## 복합 대입 연산자 ##
            1. 산술연산자와 대입연산자가 결합되어있는 형태
            2. 연산처리 속도가 빨라지므로 사용하는걸 권장
            3. 종류
               1) +=         a = a + 3; => a += 3;
               2) -=
               3) *=
               4) /=
               5) %=
         */

        int num = 12;

        System.out.println("최초의 num : " + num);

//      num = num + 3;
        num += 3;
        System.out.println("3증가된 num : " + num);

        num -= 5; // num = num - 5;
        System.out.println("5감소된 num : " + num);

        num *= 6; // num == num * 6
        System.out.println("6배 증가된 num : " + num);

        num /= 2; // num = num / 2;
        System.out.println("2배 감소된 num : " + num);

        num %= 4; // num = num % 4;
        System.out.println("최종 num : " + num);


        // 문자열과 복합대입연산자
        String str = "Hello";
//      str = str + "World";
        str += "World";
        System.out.println(str);
    }
}
