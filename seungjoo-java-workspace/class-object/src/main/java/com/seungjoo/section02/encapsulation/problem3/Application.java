package com.seungjoo.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
//        Monster_Bad mon1 = new Monster_Bad();
//        mon1.name = "프랑케";
//        mon1.hp = -2100;
//
//        System.out.println(mon1.name);
//        System.out.println(mon1.hp);


        Monster_Good mon2 = new Monster_Good();
        mon2.setName("미라");
        mon2.setHp(-200);
        System.out.println(mon2.getInfo());




    }


}
