package com.sotogito.section02.encapsulation.problem3;

public class Monster_Good {
    /**
     * 문제점 3 해결
     * 외부로부터 필드에 직접 접근이 불가하게 제한 두시
     * -> private 접근제어자
     *
     * 1. access modifier
     * 2. 접근제한자
     * 3. 클래스, 필드, 생성자, 메서드와 같은 클래스의 구성요소마다 접근 권한을 지정하는 키워드
     *
     * - public : 모든 패키지에서 접근 허용
     * - protected : 동일 패키지에서 접근 허용 (단, 상속 구조일 경우 허용)
     * - default : 동일 패키지 접근 허용. 상속도 안됨 (접근제어자 생략)
     * - private : 동일 클래스에서만 접근 가능
     */
    private String name;
    private int hp;

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
