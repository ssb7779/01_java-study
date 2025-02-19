package com.ibe6.section02.encapsulation.problem3;

public class Monster_Bad {

    String name;
    int hp;

    public void setHp(int hp){
        if(hp < 0){
            this.hp = 0;
        }else{
            this.hp = hp;
        }
    }

    /*
        ## 문제점2 해결 ##
        이름 정보를 변경하고 확인하는 용도의 각 메소드를 만들어서
        해당 메소드를 이용할 수 있도록
     */

    public void setName(String name){
        this.name = name;
    }

    public String getInfo(){
        return  "몬스터의 이름은 " + this.name + "이고, 체력은 " + this.hp + "입니다.";
    }

}
