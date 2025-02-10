package com.jjanggu.practice.run;
import com.jjanggu.practice.controller.PracController;

public class PracApplication {
    public static void main(String[] args) {

        PracController pc = new PracController();

//        pc.practice1();
//        pc.practice2();
//        pc.practice3();
//        pc.practice4();
//        pc.practice5();
//        pc.practice6();
//        pc.practice7();

        String a = "abc";


        System.out.println(a.getClass()); // String 즉, 참조자료형은 .getClass()로 확인가능

        char b = 'b';

        System.out.println(Character.class.isInstance(b)); // 그런데 기본자료형은 불가능에 가깝다..? 제때제때 확인할 것!


    }
}
