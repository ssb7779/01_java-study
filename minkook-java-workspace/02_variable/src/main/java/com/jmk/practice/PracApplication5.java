package com.jmk.practice;

public class PracApplication5 {
    public static void main(String[] args) {
        float kor = 80.5f;
        float math = 50.6f;
        float eng =  70.8f;

        int sum = (int)(kor + math + eng);
        int avg = (sum / 3);

        System.out.printf("총점:%d\n",sum);
        System.out.printf("평균:%d",avg);



    }
}
