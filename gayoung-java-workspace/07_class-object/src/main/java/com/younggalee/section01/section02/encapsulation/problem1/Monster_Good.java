package com.younggalee.section01.section02.encapsulation.problem1;

public class Monster_Good {
    // 메소드 활용하여 접근해오는 필드 입력 제한하기
    /*
    ## 문제점1 해결
    체력값을 수정하는걸 필드에 직접 접근하는게 아니라
    메소드를 통해서 수정하도록 메소드 정의
     */

    String name;
    int hp;

    //체력값을 수정해주는 메소드
    public void setHP(int hp){
        // 매개변수 : hp필드에 대입시킬 값을 전달받기 위한 변수

        /*
        ## 매개변수명과 필드명이 동일할 경우
        메소드 블럭에서 변수 호출시 기본적으로 지역변수(매개변수)를 가리킴
        따라서 해당 객체의 필드에 접근하고자 한다면
        this.필드명 으로 접근해야됨
         */
        if (hp < 0){ // 전달값이 음수일 경우
            this.hp = 0; // 필드 hp
            //this : 객체생성시 해당 객체의 주소값을 저장하고 있는 레퍼런스 변수 (참조변수)
        } else {
            this.hp = hp;
        }
    }
}
