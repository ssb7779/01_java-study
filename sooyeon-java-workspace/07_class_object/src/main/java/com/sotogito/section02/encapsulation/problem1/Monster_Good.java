package com.sotogito.section02.encapsulation.problem1;

public class Monster_Good {
    String name;
    int hp;

    /**
     * 체력값 수정시 메서드를 통해서
     */

    public void setHp(int hp) {
        /**
         * this는 해당 객체의 주소값을 저장하고 있는레퍼런스 변수이다.
         */
        if (hp < 0) {
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }

}
