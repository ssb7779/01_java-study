package com.test.pratice;

public class PracApplication5 {
    public static void main(String[] args) {
        double korean = 80.5;
        double math = 50.6;
        double english = 70.8;

        String a = "a";
        System.out.println(a.toLowerCase());

        int sum = (int) (korean + math + english);

        System.out.printf("총점: %d", (int) (korean + math + english));
        System.out.println();
        System.out.printf("평균: %d", sum / 3);
    }
}
