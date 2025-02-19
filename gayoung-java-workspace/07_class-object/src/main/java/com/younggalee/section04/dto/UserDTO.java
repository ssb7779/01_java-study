package com.younggalee.section04.dto;

public class UserDTO {
    /* 필드
    반드시 private로 작성해야함
     */

    //DTO 클래스 작성시 규칙
    private String id;
    private String pwd;
    private String name;

    /* 생성자  >> 초기화 (필드) 생성
    기본 생성자는 필수로 작성하기
    이름은 class명과 동일해야함
    *****매개변수 생성자는 토상적으로 모든 필드를 초기화해주는 생성자로 작성
    반환자료형 없음주의
     */

    public UserDTO(){ // 외부에서 기본 생성자를 사용할 일이 있을 수 있는데 매개변수 생성자를 만들면 jvm이 기본 생성자를 자동으로 만들어주지 않기 때문에 습관적으로 만들기를 추천
    }

    public UserDTO(String id, String pwd, String name){
        this.id = id;
        this.pwd = pwd;
        this.name = name;
    }

    /* 메소드
    ***** 각 필드를 변경하고 반환하는 setter/getter 메소드 기본으로 만들어주기
     */

    public void setId(String id){  // 필드 **변경**
        this.id = id;
    }

    // 반환자료형 있음주의
    public String getId(){   // 필드 **조회** (private이라)
        return id;
    }

    public void setPwd(String pwd) { this.pwd = pwd; }
    public void setName(String name) {this.name = name;}
    public String getPwd() {return pwd;}
    public String getName() {return name;}

    //해당 객체의 모든 필드값 확인용
    public String getInformation(){
        return id + pwd + name;
    }
}
