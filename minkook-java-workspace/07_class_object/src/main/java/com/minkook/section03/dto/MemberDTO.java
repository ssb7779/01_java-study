package com.minkook.section03.dto;

public class MemberDTO {
    private Long id;

    private String name;

    private String email;

    private int password;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
    /*
        ##Java Bean##
        1. Jsp에서 표준액션태그로 접근할 수 있는 자바 클래스
        2. 작성 규칙
            1) 특정패키지에 속해있어야됨(default 패키지 사용금지)
            2) 멤버변수의 접근제어자는 private으로 선언
            3) 기본생성자가 명시적으로 작성되어있어야됨(매개변수 생성자는 선택사항)
            4) 모든 멤버변수에 접근 가능한 setter(설정자), getter(접근자)가 public으로 작성되어있어야됨
            5) 직렬화(Serialization 구현)가 되어있어야 됨(선택사항)
     */
}
