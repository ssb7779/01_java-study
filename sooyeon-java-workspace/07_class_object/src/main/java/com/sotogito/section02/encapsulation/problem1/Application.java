package com.sotogito.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster_Bad m1 = new Monster_Bad();
        m1.name = "두치";
        m1.hp = 200;

        System.out.println(m1.name);
        System.out.println(m1.hp);

        Monster_Bad m2 = new Monster_Bad();
        m2.name = "뿌부";
        m2.hp = -200;

        System.out.println(m2.name);
        System.out.println(m2.hp);


        /**
         * 필드 직접 접근시 발생되는 문제
         * 1. 검증되지 않은 값 통제 불가능
         */


        Monster_Good m3 = new Monster_Good();
        m3.name = "드라큘라";
        m3.setHp(200);

        System.out.println(m3.name);
        System.out.println(m3.hp);


        Monster_Good m4 = new Monster_Good();
        m4.name = "프랑켄";
        m4.setHp(-200);

        System.out.println(m4.name);
        System.out.println(m4.hp);

    }
}
