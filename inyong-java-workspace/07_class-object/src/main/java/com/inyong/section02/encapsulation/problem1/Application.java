package com.inyong.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mb = new Monster_Bad();
        Monster_Good mg = new Monster_Good();
        mb.name = "주황버섯";
        mb.hp = 80;

        System.out.println("name" + mb.name);
        System.out.println("hp" + mb.hp);

        Monster_Bad mb2 = new Monster_Bad();

        mb2.name = "슬라임";
        mb2.hp = 60;

        System.out.println("name" + mb2.name);
        System.out.println("hp" + mb2.hp);

        /*
        ##필드 직접 접근시 발생되는 문제점
        검증되지 않은값(유효하지 않은값) 넣을때 통제가 불가능..


         */

        mg.name = "달팽이";
        mg.hp = 10;
        System.out.println("name : " + mg.name);
        System.out.println("hp : " + mg.hp);

        mg.name = "리본돼지";
        mg.setHp(-3);
        System.out.println("name : " + mg.name);
        System.out.println("hp :" + mg.hp);

        }

}
