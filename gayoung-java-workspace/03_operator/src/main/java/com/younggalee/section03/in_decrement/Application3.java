package com.younggalee.section03.in_decrement;

public class Application3 {
    public static void main(String[] args) {

        int a = 10;
        int b = 20;
        int c = 30;

        System.out.println(a++); // 10
        System.out.println((++a)+(b++)); // 12+20
        System.out.println((a++)+(--b)+(--c)); //12+20+29

    }
}
