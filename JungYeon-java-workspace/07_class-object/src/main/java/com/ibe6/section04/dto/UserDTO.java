package com.ibe6.section04.dto;

import com.ibe6.section04.constructor.User;

import java.util.SplittableRandom;

public class UserDTO {
    /*
        ## 필드 ##
        반드시 private으로
     */

    private String id;
    private String pwd;
    private String name;

    /*
        ## 생성자 ##
        기본생성자는 필수
        매개변수 생성자는 통상적으로 모든 필드를 초기화해주는 생성자로 작성
     */

    public UserDTO(){}

    public UserDTO(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /*
        ## 메소드 ##
        각 필드를 변경하고 반환하는 setter/getter 메소드
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

    // 해당 객체의 모든 필드값 확인용
    public String getInformation(){
        return "id: " + id + ", pwd: " + pwd + ", name: " + name;
    }


}
