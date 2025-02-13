package com.younggalee.section01.section02.encapsulation.problem2;


//클라이언트쪽 이라고 생각
public class Application {
    public static void main(String args[]){
        Monster_Bad mon1 = new Monster_Bad();
        mon1.name = "드라큘라";
        mon1.setHp(200);

        Monster_Bad mon2 = new Monster_Bad();
        mon2.name = "프랑켄슈타인";
        mon2.setHp(-300);

        System.out.printf("몬스터의 이름은 %s 이고, 체력은 %d입니다. \n", mon1.name, mon1.hp);
        System.out.printf("몬스터의 이름은 %s 이고, 체력은 %d입니다. \n", mon2.name, mon2.hp);

        /*
        ## 필드에 직접 접근시 발생되는 문제점1 ##
        개발 완료 후에 필드에 대한 변경사항이 발생되면
        해당 필드를 직접적으로 사용했던 모든 코드를 수정해야함
        (결합도가 높아서 생긴 일이며) 유지보수에 악영향을 미침
         */

        Monster_Good mon3 = new Monster_Good();
        mon3.name = "미이라";
        mon3.setHp(5000);

        System.out.println(mon3.getInfo());
    }
}
