package com.jun.practice;

public class PracApplication2 {
    public static void main(String[] args) {

        double width = 12.5; //사각형의 너비
        double height = 36.4; //사각형의 높이
        System.out.println("면적 : " + width * height); // 사각형의 면적
        System.out.println("둘레 : " + (width + height) * 2); // 사각형의 둘레
        System.out.println("둘레 : " + ((width + height) + (width + height))); // 사각형의 둘레 2
    }
}
