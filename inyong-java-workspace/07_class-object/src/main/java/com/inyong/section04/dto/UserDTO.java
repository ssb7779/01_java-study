package com.inyong.section04.dto;

public class UserDTO {
    private String id;
    private String pwd;
    private String name;

    public UserDTO(){}

    public UserDTO(String id, String pwd, String name) {
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /*
    ## 메소드
    각 필드를 변경하고 반환하는 setter/getter 메소드

    setter
    장점 명확하게 볼 수 있음
    단점
    너무 번거로움,
    경우의 수 별로 생성자를 만들어야함,
    전달값이 어떤필드에 대입하는지 확인하기 어려움


     */

    public String getId() {
        return id;
    }

    public String getPwd() {
        return pwd;
    }

    public String getName() {
        return name;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getInformation() {
        return "id : "+ id + "pwd :"+ pwd + "name : "+ name;

    }

}
