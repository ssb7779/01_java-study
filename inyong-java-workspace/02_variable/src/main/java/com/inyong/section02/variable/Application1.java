package com.inyong.section02.variable;

public class Application1 {
    public static void main(String[] args) {

        System.out.println("변수 사용 후");

        int pay = 9860;
        int hour = 24;
        int day = 5;
        int week = 4;
        double tax = 0.1;

        System.out.println(pay);
        System.out.println(pay * hour);
        System.out.println(pay * day);
        System.out.println(pay * day * week);
        System.out.println(pay * day * week * tax);




    }
}
