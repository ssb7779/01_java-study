package com.pch.section02.variable;

import java.io.*;

public class Application2 {

    public static void main(String[] args) throws IOException {

        float f = 12.412433f;
        double d = 12.4124345123;

        System.out.println("f의 값 : " + f);
        System.out.println("d의 값 : " + d);

        char c1 = 'A';
        char c2 = '힇';

        System.out.println("c1의 값 : " + c1);
        System.out.println("c2의 값 : " + c2);

        String str = new String("헬로헬로");

        System.out.println("str의 값 : " + str);

        int etc = 123_41_433;
        System.out.println("etc의 값 : " + etc);
    }
}
