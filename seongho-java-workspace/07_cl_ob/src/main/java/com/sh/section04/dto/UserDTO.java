package com.sh.section04.dto;

public class UserDTO {
    /*
    필드 반드시 private로
     */
    private  String id;
    private String pw;
    private String name;

    /*
    기본 생성자는 필수
    매개변수 생성자는 통상적으로 모든 필드를 초기화하는 생성자로작성
     */
    public UserDTO(){}

    public UserDTO(String id, String pw, String name){
        this.id = id;
        this.pw = pw;
        this.name = name;
    }
    /*
    ##메소드
    각 필드를 변경하고 반환하는 setter/getter메소드
     */
    public String getId(){
        return id;
    }
    public void setId(String id){
        this.id = id;
    }
    public String getPw(){
        return pw;
    }
    public void setPw(String pw){
        this.pw = pw;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    //모든 필드값 확인용
    public String getIF(){
        return "id: "+id+ "pw: "+pw+"name: "+name;
    }



}
