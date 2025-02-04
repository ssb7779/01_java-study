package com.sotogito.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        float korean = 80.5f;
        float math = 50.6f;
        float english = 70.8f;

        int total = (int) (korean + math + english);
        int avg = total / 5;

        System.out.printf("총점 : %d\n", total);
        System.out.printf("평균 : %d", avg);

    }

}
