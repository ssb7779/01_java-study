package com.jmk.section02.variable;

public class Application3 {
    /*
        ##변수 명명 규칙##
        1. 동일한 영역({})에는 중복된 변수 선언 불가
        2. 예약어(자바에서 사용된 키워드) 사용불가
        3. 숫자 가능 (단 숫자로 시작하면 안됨)
        4. 특수문자 가능(단 , _ $ 만 가능)
        5. 권장사항 : 영문, 낙타표기법

     */
    public static void main(String[] args) {
        int age;
//    double age;
//    int true;
//    int void;
//    int class;
//    int public;
        int tRue;
        int num1;
//    int 1num;
        int num2;
        int num$1;
        int num$2;
        int $num2;

        String 이름;     // 오류는 안나지만 권장사항x
        String username; // 두 단어를 조합할 경우 권장사항X
        String userName; // 낙타 표기법
    }

}
