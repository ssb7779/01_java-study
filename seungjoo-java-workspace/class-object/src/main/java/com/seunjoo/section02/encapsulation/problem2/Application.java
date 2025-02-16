package com.seunjoo.section02.encapsulation.problem2;

import com.seunjoo.section02.encapsulation.problem2.Monster_Bad;

public class Application {
    public static void main(String[] args) {

        Monster_Bad mon1 = new Monster_Bad();

        mon1.name = "드라큘라";
        mon1.setHp(200);

        Monster_Bad mon2 = new Monster_Bad();

        mon2.name = "프랑켄슈타인";
        mon2.setHp(-300);


        System.out.printf("몬스터의 이름은 %s이고, 체력은 %d입니다.\n", mon1.name, mon1.hp);
        System.out.printf("몬스터의 이름은 %s이고, 체력은 %d입니다.\n", mon2.name, mon2.hp);





        Monster_Good mon3 = new Monster_Good();
        mon3.setName("미라");
        mon3.setHp(400);
        System.out.println(mon3.getInfo());





    }
}
