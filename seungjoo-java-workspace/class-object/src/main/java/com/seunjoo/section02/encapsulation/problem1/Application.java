package com.seunjoo.section02.encapsulation.problem1;

import java.sql.SQLOutput;

public class Application {
    public static void main(String[] args) {

        //1번 몬스터
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "두치";
        mon1.hp = 200;
        System.out.println(mon1.name);
        System.out.println(mon1.hp);






        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "뿌꾸";
        mon2.hp = -200;

        System.out.println(mon2.name);
        System.out.println(mon2.hp);   //필드에 올바르지 않은 값을 넣어도 통제가 불가능함.


        /*
            # 필드 직접 접근시 발생되는 문제점1
            검증되지 않은 값(유효하지 않은 값)을 넣을 때 통제가 불가능함
         */

        Monster_Good mon3 = new Monster_Good();
        mon3.name = "드라큘라";
        mon3.setHp(200);
        System.out.println(mon3.name);
        System.out.println(mon3.hp);



        Monster_Good mon4 = new Monster_Good();
        mon4.name = "프랑켄슈타인";
        mon4.setHp(-1000); //유효하지않은 값을 setter를 이용할 경우 조건검사를 통해 0이 대입되게함.

        System.out.println(mon4.name);
        System.out.println(mon4.hp);

















    }
}
