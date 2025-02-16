package com.john.section02.encapsulation.problem2;

public class Monster_Good {

    String name;
    int hp;

    public void setHp(int hp) {
        this.hp = Math.max(hp, 0);
    }
    
    /* 높은 결합도 문제에 대한 해결방법
       필드명 변경 시, 동일 클래스에 있는 필드명만 변경하면 되도록 변경.
       외부 클래스에서는 변경할 필요X
     */
    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다";
    }
}
