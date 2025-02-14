package com.sotogito.section02.encapsulation.problem2;

import com.sotogito.section02.encapsulation.problem2.Monster_Bad;

public class Application {
    public static void main(String[] args) {
        Monster_Bad m1 = new Monster_Bad();
        m1.name = "드라큘라";
        m1.setHp(200);

        Monster_Bad m2 = new Monster_Bad();
        m2.name = "프슈";
        m2.setHp(-300);

        System.out.printf("몬스터의 이름은 %s이고, 체력은 %d입니다.\n",m1.name,m1.hp);
        System.out.printf("몬스터의 이름은 %s이고, 체력은 %d입니다.\n",m2.name,m2.hp);


        /**
         * 필드에 직접 접근시 발생하는 문제점2
         * 필드명이 변경되면 필드를 직접적으로 사용했던 모든 코드를 수정해야함
         */


        Monster_Good m3 = new Monster_Good();
        m3.setName("미라");
        m3.setHp(1000);
        m3.getInfo();
    }
}
