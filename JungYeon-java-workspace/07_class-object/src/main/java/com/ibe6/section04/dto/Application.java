package com.ibe6.section04.dto;

public class Application {
    public static void main(String[] args) {

        // 객체 생성시 필드에 값을 초기화하는 방법

        /*
            1. 기본생성자로 생성한 후 setter를 이용해서 필드값 변경
               1) 장점
                  - 어떤 필드에 어떤 값이 대입될 지 명확하게 볼 수 있음
                  - 선택적으로 원하는 필드에만 값을 담을 수 있음
               2) 단점
                  - 객체 생성 구문으로 끝나는게 아니라 매번 메소드를 호출해야되는 번거로움 있음
         */
        UserDTO user1 = new UserDTO();
        user1.setId("user01"); // this.id = "user01"
        user1.setPwd("pass01"); // this.pwd = "pass01"
        user1.setName("홍길동"); // this.name = "홍길동"
        System.out.println(user1.getInformation());

        /*
           2. 매개변수 생성자를 이용하여 필드값 초기화
              1) 장점
                 - 메소드를 여러번 호출할 필요 없이 생성 구문만으로 필드값을 초기화할 수 있음
              2) 단점
                 - 전달값이 어떤 필드에 대입되는지 명확하게 확인하기 어려움
                 - 정해져있는 매개변수에 맞는 값만을 전달해야됨
                   따라서 선택적으로 원하는 필드에만 값을 담고자할 경우
                   경우의 수 별로 매개변수 생성자를 만들어야됨
         */
        UserDTO user2 = new UserDTO("user02", "pass02", "김말똥"); // this.id="user02", this.pwd="user02"...
        System.out.println(user2.getInformation());

        // Ex) 비밀번호 변경 요청
        user2.setPwd("1234"); // setter가 무조건 존재해야됨!!

        // Ex) 아이디 찾기 요청
        System.out.println(user2.getId()); // getter가 무조건 존재해야됨!!

        System.out.println(user2.getInformation());

        System.out.println("===========");

    }
}
