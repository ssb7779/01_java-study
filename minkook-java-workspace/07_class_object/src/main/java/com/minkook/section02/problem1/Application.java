package com.minkook.section02.problem1;

public class Application {
    public static void main(String [] args){
        Monster_Bad m1 = new Monster_Bad();
//        m1.name = "두치";
//        m1.hp = -200;
//
//        System.out.println("mo1 name:" + m1.name);
//        System.out.println("mo1 hp:" + m1.hp);
        
        /*
            ## 필드 직접 접근시 발생되는 문제점1 ##
            검증되지 않은(유효하지 않은 값)을 넣을 때 통제가 불가능함
         */

        Monster m2 = new Monster();
        m2.name = "드라큘라";
        m2.setHp(-1);

        System.out.println(m2.name);
        System.out.println(m2.hp);
    }
}
