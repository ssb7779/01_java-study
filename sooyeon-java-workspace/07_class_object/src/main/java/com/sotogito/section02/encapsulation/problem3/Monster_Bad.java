package com.sotogito.section02.encapsulation.problem3;

public class Monster_Bad {
    String name;
    int hp;

    public void setHp(int hp){
        if(hp<0){
            this.hp = 0;
            return;
        }
        this.hp = hp;
    }


    /**
     * .이름 정보를 변경하는 메서드를 활용
     */

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.name + "이고, 체력은" + this.hp+"입니다.";
    }

    /**
     * 필드 변경시 선언한 클래스의 필드명만 변경해주면 됨
     */
}
