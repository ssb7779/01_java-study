package com.younggalee.section01.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args){
        // 직접 접근하면 발생하는 문제들
        // 그로인해 사용하는 캡슐화

        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "주황버섯";
        mon1.hp = 80;

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "리본돼지";
        mon2.hp = 200;

        System.out.println(mon2.name + " " + mon2.hp);

        Monster_Good mon3 = new Monster_Good();
        mon3.name = "달팽이"; // 직접접근
        mon3.setHP(-200);  // 입력을 한번 검사해줘야되면 메소드 활용 (유효성 검사 가능)

        System.out.println(mon3.name + " " + mon3.hp);

        /* 필드 직접 접근시 발생되는 문제점 1 ##
         검증되지 않은 값을 넣을때 통제가 불가능함.
         >> 메소드를 활용하여
         */
    }

}
