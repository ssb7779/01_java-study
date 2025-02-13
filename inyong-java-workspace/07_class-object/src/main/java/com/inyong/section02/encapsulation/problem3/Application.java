package com.inyong.section02.encapsulation.problem3;

public class Application {
    public static void main(String[] args) {
        Monster_Bad mon1 =new Monster_Bad();

        mon1.name ="주황버섯";
        mon1.hp = 200;

        System.out.println(mon1.name);
        System.out.println(mon1.hp);

        Monster_Good mon2 = new Monster_Good();

        mon2.setName("주니어발록");
        mon2.setHp(10000);
        /*
        캡슐화
        Encapsulation
        필드의 직접 접근 제한 (정보 은닉)
        간접적으로 필드를 수정 및 조회 할 수 있는 메소드를 클래스 내부에 작성
        -> 필드와 메소드를 묶어서 관리
        캡슐화는  기본원칙
         */

    }
}
