package com.john.section02.encapsulation.problem1;

/*
    캡슐화 진행
    - 필드에 직접 접근하도록 허용하는 게 아닌
    메서드를 통해 수정하도록 메서드를 정의
 */

public class Monster_Good {
    String name;
    int hp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }


    public void setHp(int hp) {
    /*
        해당 메서드의 매개변수( setHp(int hp)): 필드에 대입시킬 값을 전달받기 위한 변수
        전달된 필드값이 음수인 경우 0 대입,
        아닐 경우 그대로 전달값 대입

        매개변수명과 필드명이 동일한 경우 기본적으로 지역변수(매개변수)를 가리킴.
        해당 객체의 필드에 접근하기 위해 this.필드명으로 사용
        this: 객체 생성시, 해당 객체의 주소값을 저장하고 있는 레퍼런스 변수
    */
        this.hp = (hp < 0 ? 0 : hp);
//        this.hp = Math.max(hp, 0);
    }
}

