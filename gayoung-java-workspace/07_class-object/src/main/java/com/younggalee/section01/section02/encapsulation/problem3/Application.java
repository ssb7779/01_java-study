package com.younggalee.section01.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args){
        Monster_Bad mon1 = new Monster_Bad();

        mon1.name = "프랑켄슈타인";
        mon1.hp = -200;

        System.out.printf("몬스터의 이름은 %s 이고, 체력은 %d입니다. \n", mon1.name, mon1.hp);

        /*
        ## 문제점3 #3
        메소드를 두긴 했지만 여전히 필드에 직접 접근이 가능함
         */

        Monster_Good mon2 = new Monster_Good();
//        mon2.name = "미이라"; // private으로 인해 직접접근 불가능 (클라이언트쪽에서 함부로 데이터를 넣거나 하지 못함)
        //그럼 메소드(입력조건을 만족 시키는)를 이용해서 데이터를 접근하는 방식으로 사용해야함.
        //메소드 : 입력 데이터를 어떻게 처리할 것인가

        mon2.setName("미이라");
        mon2.setHp(-200);
        System.out.println(mon2.getInfo());
    }
}
