package com.john.section02.encapsulation.problem3;

import com.john.section02.encapsulation.problem2.Monster_Good;

/*
    ## 캡슐화(Encapsulation) - 기본 원칙
    1. 필드값에 대한 직접적인 접근 제한(private) -> 정보 은닉
    2. 간접적으로 필드에 접근할 수 있는 메서드를(public) 클래스 내부에 작성하는 기법
    3. 필드와 메서드를 묶어서 관리
 */

public class Application {
    public static void main(String[] args) {

        Monster_Bad mb1 = new Monster_Bad();
        mb1.name = "코코";
        mb1.hp = -200;

        Monster_Good mb2 = new Monster_Good();
        /*
        mb2.name = "좀비";
        mb2.hp = 200;
         */
        mb2.setName("좀비");
        mb2.setHp(-200);
        System.out.println(mb2.getInfo());
    }

}
