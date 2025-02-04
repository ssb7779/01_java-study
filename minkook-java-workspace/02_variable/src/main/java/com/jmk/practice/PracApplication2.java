package com.jmk.practice;

public class PracApplication2 {
    public static void main(String[] args) {
        float width = 12.5f;
        float height = 36.4f;

        float circumference = (width * 2) + (height * 2);
        float area = width * height;

        System.out.printf("면적:%.1f\n" ,area);
        System.out.printf("둘레:%.1f" ,circumference);


    }
}
