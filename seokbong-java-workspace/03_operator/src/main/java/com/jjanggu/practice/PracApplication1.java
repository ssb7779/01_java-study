package com.jjanggu.practice;

public class PracApplication1 {
    public static void main(String[] args) {

        int a = 11;
        int b = -5;
        int c = a++ - b--;
        int d = ++c + a--;

        System.out.println("a : "+ a); //11
        System.out.println("b : "+ b); //-6
        System.out.println("c : "+ c); //17
        System.out.println("d : "+ d); //29
    }
}
