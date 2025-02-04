package com.Kyungbae.section02.veriable;

public class Application1 { // class start

    public static void main(String[] args) { // static main start

        /*
        System.out.println("변수 사용 전");
        System.out.println(9480 * 8);               // 일당 : 최저시급 * 근무시간
        System.out.println(9480 * 8 * 5);           // 주급 : 최저시급 * 근무시간 * 근무요일
        System.out.println(9480 * 8 * 5 * 4);       // 월급 : 최저시급 * 근무시간 * 근무요일 * 근무주수
        System.out.println(9480 * 8 * 5 * 4 * 0.1); // 세금 : 월급 * 0.1
        */

        System.out.println("변수 사용 후");
        int pay = 10030;    // 최저시급
        int hour = 8;       // 근무시간
        int day = 5;        // 근무일수
        int week = 4;       // 근무주수
        double tax = 0.1;   // 세금 10%

        System.out.println(pay * hour);
        System.out.println(pay * hour * day);
        System.out.println(pay * hour * day * week);
        System.out.println(pay * hour * day * week * tax);

        System.out.println("최저시급: " + pay);



    } // static main end

} // class end
