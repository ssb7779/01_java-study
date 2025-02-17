package com.kyungbae.section04.dto;

public class UserDTO {
    // ## DTO 클래스
    /*
        # field
        반드시 private 으로
     */

    private String id;
    private String pwd;
    private String name;

    /*
        # constructor
        default constructor 는 필수
            ( constructor 가 비어있을경우 default constructor는 JVM에서 자동으로 생성해주지만
            parameter constructor 을 언제 작성할 지 몰라 필수적으로 작성해준다.)
        parameter constructor 는 통상적으로 모든 field를 초기화해주는 constructor로 작성
     */

    // default constructor 작성
    public UserDTO(){}

    // 모든 feild 를 초기화 해주는 parameter constructor
    public UserDTO(String id,String pwd,String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /*
        # method
        각 field 를 변경하고 반환하는 setter/getter method
     */

    public String getId(){
        return id;
    }

    public void setId(String id){
        this.id = id;
    }

    public String getPwd(){
        return pwd;
    }

    public void setPwd(String pwd){
        this.pwd = pwd;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    // 해당 object 의 모든 field 값 확인용
    public String getInformation(){
        return "id: " + id + ", pwd: " + pwd + ", name: " + name;
    }

} // class end
