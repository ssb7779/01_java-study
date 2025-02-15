package com.kyungbae.section02.encapsulation.problem1;

public class Application {

    public static void main(String[] args) {

        // 필드 직접 접근시 생기는 문제

        // 배드몬스터1
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "두치";
        mon1.hp = 200;

        System.out.println("mon1 name : " + mon1.name);
        System.out.println("mon1 hp : " + mon1.hp);

        // 배드몬스터2
        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "뿌꾸";
        mon2.hp = -200; // 부적절한 값

        System.out.println("mon2 name : " + mon2.name);
        System.out.println("mon2 hp : " + mon2.hp);

        // 굿몬스터1
        Monster_Good mon3 = new Monster_Good();
        mon3.name = "드라큘라";
        mon3.setHp(200);

        System.out.println("mon3 name: " + mon3.name);
        System.out.println("mon3 hp: " + mon3.hp);

        // 굿몬스터2
        Monster_Good mon4 = new Monster_Good();
        mon4.name = "프랑켄";
        mon4.setHp(-1000);

        System.out.println("mon4 name: " + mon4.name);
        System.out.println("mon4 hp: " + mon4.hp);
    }

} // class end
