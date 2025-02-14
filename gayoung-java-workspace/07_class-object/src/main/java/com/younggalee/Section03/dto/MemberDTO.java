package com.younggalee.Section03.dto;

public class MemberDTO {
    /*
    프로그램 목적에 맞춰 취급하고자 하는 회원정보를 고려해서 필드로 구성
    주로 화면(ui) 또는 **DB 테이블 기준**으로 필드 작성

    DTO는 캡슐화가 기본
    getter, setter
     */

    // ## 필드 ##
    private int number;
    private String name;
    private int age;
    private char gender;
    private double height;
    private double weight;
    private boolean isActivated;

    /*
    ## setter 메소드 ##
    1. 해당 객체의 필드값을 외부에서 변경할 때 필요한 메소드
    2. 설정자라고도 함.

    객체의 필드 값을 변경하는 메서드
    set필드명() 형식

    1) 메소드명 : set+필드명 (Camel Case)
    2) 매개변수 : 필드에 대입시킬 값을 전달받을 변수 (필드 타입과 동일하게 작성)
    3) 반환타입 : void
    4) 본문내용 : 필드 = 매개변수; (필드에 넣어줌)
     */

    // number직접접근 불가능 따라서 호출 할 수 있는 메소드 작성
    public void setNumber(int number){
        this.number = number;
    }

    // Alt + Insert (setter,getter 등 제너레이터) ****************
    public void setAge(int age) {
        this.age = age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setActivated(boolean activated) {
        this.isActivated = activated;
    }

    /*
    ## getter 메소드 ##
    1. 해당 객체의 필드값을 외부에서 조회할때 필요한 메소드
    2. 접근자 라고도 함
    3. 작성규칙
       1) 메소드명 : get+필드명 (camel case)
       2) 매개변수 : 없음
       3) 반환타입 : 반환할 필드의 자료형(필드의 타입)
       4) 본문내용 : return 필드명;
     */

     public int getNumber(){
         return number;
     }

     public String getName(){
         return name;
     }
     public int getAge(){
         return age;
     }
     public char getGender(){
         return gender;
     }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public boolean isActivated() {
        return isActivated;
    }
}
