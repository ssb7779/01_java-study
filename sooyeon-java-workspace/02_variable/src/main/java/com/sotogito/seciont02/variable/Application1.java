package com.sotogito.seciont02.variable;

public class Application1 {
    public static void main(String[] args) {
        System.out.println("변수 사용 전");
        System.out.println(9860 * 8); //일당
        System.out.println(9860 * 8 * 5); //주급
        System.out.println(9860 * 8 * 5 * 4); //월급
        System.out.println(9860 * 8 * 5 * 4 * 0.1); //세금

        /**
         * ## 변수
         * 특정 값을 메모리에 저장
         *
         * ## 메모리
         * 1. 램
         * 2. 프로그램 동작시 필요값 저장
         * 3. 휘발성
         * 4. 변수 생성 필요
         */

        System.out.println("변수 사용 후");
        int pay = 10030;
        int hour = 8;
        int day = 5;
        int week = 4;
        double tax = 0.1;

        System.out.println(pay * hour); //일당
        System.out.println(pay * hour * day); //주급
        System.out.println(pay * hour * day * week); //월급
        System.out.println(pay * hour * day * week * tax); //세금

        /**
         * 1. 가독성
         * 2. 재사용
         * 3. 유지보수

         */

    }

}
