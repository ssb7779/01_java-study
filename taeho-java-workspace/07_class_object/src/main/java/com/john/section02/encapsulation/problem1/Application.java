package com.john.section02.encapsulation.problem1;

public class Application {
    public static void main(String[] args) {

        Monster_Bad mb = new Monster_Bad();
        System.out.println(mb.hashCode());
        mb.name = "두더지";
        mb.hp = 100;

        System.out.println("monster name: " + mb.name);
        System.out.println("monster hp: " + mb.hp);

        System.out.println("==================");

        // 캡슐화 되지않은 클래스의 문제
        Monster_Bad mb2 = new Monster_Bad();
        System.out.println(mb2.hashCode());

        mb2.name = "보글보글";
        mb2.hp = -200;

        System.out.println("monster2 name: " + mb2.name);
        System.out.println("monster2 hp: " + mb2.hp);

        System.out.println("==================");

        // 캡슐화된 클래스를 사용(hp)
        Monster_Good mb3 = new Monster_Good();
        mb3.name = "키키";
        mb3.setHp(200);
        System.out.println("monster3 name: " + mb3.name);
        System.out.println("monster3 hp: " + mb3.hp);

        System.out.println("=================");

        Monster_Good mb4 = new Monster_Good();
        mb4.name = "좀비";
        mb4.setHp(-1000);
        System.out.println("monster4 name: " + mb4.name);
        System.out.println("monster4 hp: " + mb4.hp);
    }
}
