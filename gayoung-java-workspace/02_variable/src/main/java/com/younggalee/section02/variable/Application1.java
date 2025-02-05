package com.younggalee.section02.variable;

public class Application1 {
    public static void main(String[] args){
        System.out.println(9860 * 8 * 5 * 4 * 0.1);

        /*
            ## 메모리 ##
            1. 램(RAM)
            2. 프로그램 동작시 필요한 값들이 저장되는 장소
            3. 휘발성이기 때문에 프로그램 종료시 메모리상에 존재하는 것들은 사라짐
            4. 특정값을 메모리상에 기록하고자 할 경우 변수를 먼저 생성해야함.
         */

        int pay = 9860;  //최저시급
        int hour = 8;  //일일 근무시간
        int day = 5;  // 주당 근무일수
        int week = 4;  // 한달 근무주수
        double tax = 0.1;  // 세금 10%

        System.out.println(pay * hour * day * week * tax);
    }
}
