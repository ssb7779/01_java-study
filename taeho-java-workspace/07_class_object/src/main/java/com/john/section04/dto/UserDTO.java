package com.john.section04.dto;
/*
    ## 생성자
    - 기본 생성자는 필수
    - 매개변수 생성자는 통상적으로 모든 필드를 초기화해주는 생성자로 작성
 */
public class UserDTO {
    private String id;
    private String pwd;
    private String name;

    public UserDTO() {}

    public UserDTO(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }

    public String getPwd() {
        return pwd;
    }
    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getInfomation(){
        return "id: " + id + ", pwd: " + pwd + ", name: " + name;
    }


}
