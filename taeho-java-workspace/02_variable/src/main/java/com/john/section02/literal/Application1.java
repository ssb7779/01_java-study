package com.john.section02.literal;

/* 다른 패키지에 같은 이름의 클래스 생성확인
    ## 변수:특정 값을 메모리에 저장하기 위한 공간
        1. 값에 의미부여(가독성)
        2. 유지보수의 용이성
    ## 메모리
        1. 값이 저장되는 장소
        2. 휘발성으로 종료시 사라짐
        3. 값을 메모리에 보관하고자 하는 경우 변수를 설정해서 저장필요
 */
public class Application1 {
    public static void main(String[] args) {

        System.out.println("변수 사용 전");

        System.out.println(9860 * 8);               // 일당
        System.out.println(9860 * 8 * 5);           // 주급
        System.out.println(9860 * 8 * 5 * 4);       // 월급
        System.out.println(9860 * 8 * 5 * 4 * 0.1); // 세금

        // 변수 선언
        int pay = 9860;
        int hour = 8;
        int day = 5;
        int week = 4;
        double tax = 0.1;

        System.out.println("변수 사용 후");
        
        System.out.println(pay * hour);               // 일당
        System.out.println(pay * hour * day);           // 주급
        System.out.println(pay * hour * day * week);       // 월급
        System.out.println(pay * hour * day * week * tax); // 세금
    }
}
