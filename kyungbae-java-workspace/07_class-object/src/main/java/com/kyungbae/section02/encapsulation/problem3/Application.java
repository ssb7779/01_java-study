package com.kyungbae.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {

        Monster_Bad mon1 = new Monster_Bad();

        mon1.name = "삐삣";
        mon1.hp =  400;

        System.out.println(mon1.name);
        System.out.println(mon1.hp);
        // 문제점 3
        // 여전히 필드에 직접 접근 가능

        Monster_Good mon2 = new Monster_Good();

//        mon2.name = "미이라"; // 오류 발생 (접근 제한)
        mon2.setName("미이라");
        mon2.setHp(-200);

        System.out.println(mon2.getInfo());

        /*
            # 캡슐화 (Encapsulation)
            1. 필드의 직접 접근 제한 (정보 은닉)
            2. 간접적으로 필드를 수정 및 조회 할 수 있는 메소드(public)를 클래스 내부에 작성하는 기법
            3. 필드(속성)와 메소드(기능)를 묶어서 관리하는 기법
            4. 클래스 작성시 특별한 목적이 아닌 이상 캡슐화가 기본 원칙
         */

    } // main end

} // class end
