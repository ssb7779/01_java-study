package com.john.section04.dto;

public class Application {
    public static void main(String[] args) {
        /*
            기본 생성자로 생성한 이후 setter를 이용해 필드값 변경
             각 데이터 값이 this로 초기화 되어 저장됨
             1) 장점
                - 전달값이 어떤 필드에 대입될지 확인가능
                - 선택적으로 원하는 필드에만 값을 담을 수 있음.
             2) 단점
                - 객체 생성 구문으로 끝나는 것이 아닌 매번 메서드를 호출해야됨
         */
        UserDTO user1 = new UserDTO();
        user1.setId("user1");
        user1.setPwd("123");
        user1.setName("임꺽정");

        System.out.println(user1.getInfomation());
        
        /*
            매개변수 생성자를 이용한 필드값 초기화
            1) 장점
                - 메서드를 여러번 호출할 필요없이 생성구문만으로 필드값 초기화 가능
            2) 단점
                - 전달값(인자)가 어떤 필드에 대입이 되는지 명확하지 않음
                - 정해져있는 매개변수에 맞는 값만을 전달해야됨.
                    => 만약 선택적으로 원하는 필드에 값을 담고자 하는 경우,
                    해당 경우의 수 만큼 매개변수 생성자를 만들어야 함
         */

        UserDTO user2 = new UserDTO("user02", "pass02", "김비교");
        System.out.println(user2.getInfomation());

        // ex) 비밀번호 변경 요청
        user2.setPwd("1234");

        // ex) 아이디 찾기 요청
        System.out.println(user2.getId());

        System.out.println(user2.getInfomation());

        System.out.println("===================");
    }
}
