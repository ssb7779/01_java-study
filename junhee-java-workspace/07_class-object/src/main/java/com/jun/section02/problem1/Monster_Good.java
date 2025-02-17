package com.jun.section02.emcapsulat.problem1;

public class Monster_Good {

    String name;
    int hp;

    /*
        ## 문제점1 해결 ##
        체력값을 수정하는걸 필드에 직접접근하는게 아니라
        메소드를 통해서 수정하도록 메소드 정의

        => 전달된 체력값이 음수일 경우 hp필드에 0대입,
                             아닐 경우 hp필드에 전달값 대입
     */
    public void setHp(int hp){ // 매개변수 : hp필드에 대입시킬값을 전달받기위한 변수

        /*
            ## 매개변수명과 필드명일 동일할경우 ##
            메소드 블럭에서 변수 호출시 기본적으로 지역변수(매개변수)를 가리킴
            따라서 해당 객체의 필드에 접근하고자 한다면
            this.필드명 으로 접근해야됨
            * this : 객체생성시 해당 객체의 주소값을 저장하고있는 레퍼런스변수
         */
        if(hp < 0){ // 전달값이 음수일 경우
            this.hp = 0; // 필드hp = 0;
        }else {
            this.hp = hp;
        }
    }

}
