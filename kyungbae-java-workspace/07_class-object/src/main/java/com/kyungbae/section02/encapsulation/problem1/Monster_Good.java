package com.kyungbae.section02.encapsulation.problem1;

public class Monster_Good {

    String name;
    int hp;

    // 직접 접근이 아닌 메소드를 통해서 수정하도록
    // 전달받을 Hp값이 음수일 경우 0 대입
    public void setHp(int hp) { // hp 필드에 대입시킬 값을 전달받기 위한 변수

        // this : 객체생성시 해당 객체의 주소값을 저장하고 있는 레퍼런스 변수
        if (hp < 0) {
            this.hp = 0; // 필드hp =0;
        } else {
            this.hp = hp;
        }
    }

} // class end
