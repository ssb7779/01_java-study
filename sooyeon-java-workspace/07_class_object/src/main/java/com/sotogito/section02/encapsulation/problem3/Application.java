package com.sotogito.section02.encapsulation.problem3;

public class Application {
    Monster_Bad m1 = new Monster_Bad();


    public static void main(String[] args) {
        Monster_Good m2 = new Monster_Good();
        m2.setName("ewar");
        m2.setHp(234);
        m2.getInfo();
        /**
         * 캡슐화
         * 1. Encapsulation
         * 2. 필드의 직접 접근 제한 - > 정보 은닉
         * 3. 필드로 수정 및 조회
         * 4. 기본 원칙
         */
    }
}
