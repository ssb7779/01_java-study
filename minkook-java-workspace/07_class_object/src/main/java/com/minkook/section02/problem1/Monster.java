package com.minkook.section02.problem1;

public class Monster {
    /*
        ## 문제점1 해결 ##
        체력값을 수정하는걸 필드에 직접접근이 아니라
        메소드를 통해서 수정하도록 메소드 정의
     */
    //필드
    String name; //이름
    int hp; //체력
    
    public void setHp(int hp){
        /*
            ## 매개변수명과 필드명이 동일할 경우 ##
            메소드 블럭에서 변수 호출시 기본적으로 지역변수(매개변수)를 가리킴
            this 필드명으로 접근해야됨
            this 객체생성시 해당 객체의 주소값을 저장하고 있는 레퍼런스 변수

         */
        if(hp < 0){
            this.hp = 0;
        }else {
            this.hp = hp;
        }

    }
}
