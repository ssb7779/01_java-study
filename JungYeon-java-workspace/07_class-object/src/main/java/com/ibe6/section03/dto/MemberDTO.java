package com.ibe6.section03.dto;

public class MemberDTO {

    /*
        프로그램 목적에 맞춰 취급하고자 하는 회원정보를 고려해서 필드로 구성
        주로 화면(UI) 또는 DB의 테이블 기준으로 필드 작성

        회원번호, 회원명, 나이, 성별, 키, 몸무게, 회원탈퇴여부
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
        1. 해당 객체의 필드값을 외부에서 변경할때 필요한 메소드
        2. 설정자 라고도 함
        3. 작성 규칙
           1) 메소드명 : set+필드명 (Camel Case)
           2) 매개변수 : 필드에 대입시킬 값을 전달받을 변수 (필드 타입과 동일하게 작성)
           3) 반환타입 : void
           4) 본문내용 : 필드 = 매개변수;
     */

    public void setNumber(int number){
        this.number = number;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setAge(int age){
        this.age = age;
    }

    public void setGender(char gender){
        this.gender = gender;
    }

    public void setHeight(double height){
        this.height = height;
    }

    public void setWeight(double weight){
        this.weight = weight;
    }

    public void setActivated(boolean isActivated){
        this.isActivated = isActivated;
    }

    /*
        ## getter 메소드 ##
        1. 해당 객체의 필드값을 외부에서 조회할 때 필요한 메소드
        2. 접근자 라고도 함
        3. 작성 규칙
           1) 메소드명 : get+필드명 (Camel Case)
           2) 매개변수 : 없음
           3) 반환타입 : 반환할 필드의 자료형 (필드의 타입)
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

    public double getHeight(){
        return height;
    }

    public double getWeight(){
        return weight;
    }

    public boolean isActivated(){
        return isActivated;
    }





}