package com.jjanggu.section04.dto;

public class Application {
    public static void main(String[] args) {

        // 객체 생성시 필드에 값을 초기화하는 방법

        /*
            1. 기본생성자로 생성한 후에 setter를 이용해서 필드값 변경
               1) 장점
                  - 어떤 필드에 어떤 값이 대입될 지 명확하게 볼 수 있음
                  - 선택적으로 원하는 필드에만 값을 담을 수 있음
               2) 단점
                  - 객체 생성 구문으로 끝나는게 아니라 매번 메소드를 호출해야되는 번거로움 있음
         */
        UserDTO user1 = new UserDTO();
        user1.setId("user01"); // this.id = "user01"
        user1.setPwd("pass01"); // this.pwd = "pass01"
        user1.setName("홍길동"); // this.pwd = "홍길동"

        System.out.println(user1.getInformation());

        /*
            2. 매개변수 생성자를 이용하여 필드값 초기화
               1) 장점
                  - 메소드를 여러번 호출할 필요 없이 생성 구문만으로 필드값을 초기화할 수 있음
               2) 단점
                  - 전달값이 어떤 필드에 대입되는지 명확하게 확인 하기 어려움
                  - 정해져있는 매개변수에 맞는 값만을 전달해야됨
                    따라서 선택적으로 원하는 필드에만 값을 담고자할 경우
                    경우의 수 별로 매개변수 생성자를 만들어야됨
         */
        UserDTO user2 = new UserDTO("user02", "pass02", "김말똥"); // this.id="user02", this.pwd="pass02", this.name="김말똥"
        System.out.println(user2.getInformation());

        // ex) 비밀번호 변경 요청
        user2.setPwd("1234"); // setter가 무조건 존재해야함!!

        // ex) 아이디 찾기 요청
        System.out.println(user2.getId()); // getter가 무조건 존재해야됨!!!!!

        System.out.println(user2.getInformation());

        System.out.println("====================================");

        /*
            실습.
            화장품과 관련된 데이터를 보관할 CosmeticDTO 클래스 작성해보세요.
            이름, 가격, 브랜드, 카테고리, 할인여부를 속성으로 가져야된다.

            CosmeticDTO 클래스 작성이 다 끝나면 실행용 클래스에서
            1. 기본생성자 + setter 이용해서 객체 생성
               - 화장품명 : 젠틀토닝로션
               - 가격 : 23000
               - 브랜드 : 아벤느
               - 카테고리 : 스킨케어
               - 할인여부 : 할인안함

            2. 매개변수생성자 이용해서 객체 생성
               - 화장품명 : 펜라이너
               - 가격 : 15000
               - 브랜드 : 클리오
               - 카테고리 : 아이메이크업
               - 할인여부 : 할인함
         */

        CosmeticDTO cos1 = new CosmeticDTO();
        cos1.setName("젠틀토닝로션");
        cos1.setPrice(23000);
        cos1.setBrand("아벤느");
        cos1.setCat("스킨케어");
        cos1.setIsdc(false); // this.isdc = false

        System.out.println(cos1.getInformation());

        System.out.println();

        CosmeticDTO cos2 = new CosmeticDTO("펜라이너", 15000, "클리오", "아이메이크업", true); // this.id="user02", this.pwd="pass02", this.name="김말똥"
        System.out.println(cos2.getInformation());

        System.out.println("================================================================");

        // 1. 빵 객체 생성(기본생성자+setter)
        BreadDTO br1 = new BreadDTO();
        br1.setBreadName("소금빵");
        br1.setBreadPrice(2000);

        System.out.println(br1.getInformation());
        System.out.println();

        // 2. 빵집 객체 생성(기본생성지+setter)
        BakeryDTO bk1 = new BakeryDTO();
        bk1.setBakeryName("파리바게뜨");
        bk1.setBakeryAddr("삼성동");
        System.out.println(bk1.getInformation());

        // 3. 빵집 객체 생성
        BakeryDTO bk2 = new BakeryDTO();
        bk2.setBakeryName("뚜레주르");
        bk2.setBakeryAddr("마곡동");
//        bk2.setBread(br1); // 이미 생성해둔 Bread 객체 전달
        bk2.setBread(new BreadDTO("크로와상" , 4000));
        System.out.println(bk2.getInformation());

        System.out.println("=================================");

        /*
            2500원짜리 튀김소보로를 판매하는 성심당(대전시) 빵집 만들기 => bk3

            빵집정보출력
            성심당에서 판매하는 빵정보만 출력
         */

        BakeryDTO bk3 = new BakeryDTO("성심당", "대전시" , new BreadDTO("튀김소보로" , 2500));
        System.out.println(bk3.getInformation());
        System.out.println("판매하는빵: " + bk3.getBread().getInformation());


    }

}
