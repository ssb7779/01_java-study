package com.podoseee.practice;

public class PracApplication5 {
    public static void main(String[] args){
        float korean = 80.5f;
        float math = 50.6f;
        float english = 70.8f;

        int sum = (int)(korean + math + english);
        int average = (int)((korean + math + english) / 3);

        System.out.println("총점 : " + sum);
        System.out.println("평균 : " + average); //System.out.println("평균 : " + sum/3);

        /* 간결 코드
        System.out.println("총점 : " + (int)(korean + math + english));
        System.out.println("평균 : " + (int)((korean + math + english) / 3));
         */
    }
}
