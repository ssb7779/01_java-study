package com.kyungbae.section02.encapsulation.problem2;

public class Application {

    public static void main(String[] args) {

        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "드라큘라";
        mon1.setHp(200);

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "프랑켄";
        mon2.setHp(-300);

        System.out.printf("몬스터의 이름은 %s이고 체력은 %d입니다.\n", mon1.name, mon1.hp);
        System.out.printf("몬스터의 이름은 %s이고 체력은 %d입니다.\n", mon2.name, mon2.hp);

        // 필드에 직접 접근시 발생되는 문제점 2
        /*
            제작 후 필드에 대한 변경사항 발생 시
            필드를 직접 접근했던 모든 코드를 수정해야됨
            => 유지보수에 문제
            ex) String.name => name 이름을 수정하면 사용한 모든 코드에서 이름 수정해야함
         */

        Monster_Good mon3 = new Monster_Good();
        mon3.setName("미이라");
        mon3.setHp(400);

        System.out.println(mon3.getInfo());

    } // main end

} // class end
