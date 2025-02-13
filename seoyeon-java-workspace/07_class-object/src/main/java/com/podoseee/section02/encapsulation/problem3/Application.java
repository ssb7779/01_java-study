package com.podoseee.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "프랑케";
        mon1.hp = -200;

        System.out.println(mon1.name);
        System.out.println(mon1.hp);
        
        /*
            ## 문제점3 ##
            메소드를 두긴했지만 여전히 필드에 직접 접근이 가능하긴함
         */

        Monster_Good mon2 = new Monster_Good();
        /*
        mon2.name = "미이라";
        mon2.hp = 200;
        System.out.println(mon2.name);
        System.out.println(mon2.hp);
         */
        mon2.setName("미이라");
        mon2.setHp(-200);
        System.out.println(mon2.getInfo());


        /*
            ## 캡슐화 ##
            1.
         */
    }
}
