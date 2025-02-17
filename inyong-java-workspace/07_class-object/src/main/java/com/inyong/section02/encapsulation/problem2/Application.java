package com.inyong.section02.encapsulation.problem2;

public class Application {
    public static void main(String[] args) {

        Monster_Bad mon1 = new Monster_Bad();
        mon1.name="주황버섯";
        mon1.setHp(100);

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name="슬라임";
        mon2.setHp(-300);

        System.out.printf("몬스터의 이름은 %s이고 체력은 %d입니다. \n", mon1.name, mon1.hp);
        System.out.printf("몬스터의 이름은 %s이고 체력은 %d입니다. \n", mon2.name, mon2.hp);


        /*
        필드에 직접 접근시 발생되는 문제점2
        개발 완료 후에 필드에 대한 변경사항이 생기면
        해당 필드를 직접적으로 사용했던 모든 코드를 수정해야함


         */

        Monster_Good mon3 = new Monster_Good();
        mon3.setName("빨간 달팽이");

        System.out.println(mon3.getInfo());


    }
}
