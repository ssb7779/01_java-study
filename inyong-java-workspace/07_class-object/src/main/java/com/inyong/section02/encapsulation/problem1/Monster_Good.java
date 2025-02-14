package com.inyong.section02.encapsulation.problem1;

public class Monster_Good {

    String name;
    int hp;


    /*
    문제점1 해결
    체력값을 수정하는걸 필드에 직접접근하는게 아니라
    메소드를 통해서 수정하도록 메소드 정의

    -> 전달된 체력값이 음수일 경우 hp필드에 0대입
          아닐 경우 hp 필드에 전달값 대입
     */


    public void setHp(int hp) {
        // 기본적으로 지역변수(매개변수)를 가리킴
        // 객체 필드명으로 접근 하자면 this.필드명으로 접근
        if (hp <= 0) {
            this.hp = 1;
        } else {
            this.hp= hp;
        }
    }
}
