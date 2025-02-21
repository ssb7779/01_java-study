package com.sh.section04.dto;

public class Application {
    public static void main(String[] args) {
        //객체 생성시 필드에 값을 초기화하는 방법
        /*
            1.기본생성자로 생성후 setter를 이용해서 필드값변경
            장점
                어떤 필드에 어떤 값이 대입될지 명확하게 볼 수 있음
                선택적으로 원하는 필드에만 값을 담을 수 있음
            단점
                객체 생성 구문으로 끝나는게 아니라 매번 메소드를 호출
         */
        UserDTO user1 = new UserDTO();
        user1.setId("u01");
        user1.setPw("pw01");
        user1.setName("ksh");
        System.out.println(user1.getIF());
        System.out.println();
        /*
        2. 매개변수 생성자를 이용하여 필드값 초기화
            장점
                메소드를 여러번 호출할 필요 없음
            단점
                전달값이 어떤 필드에 대입되는지 명확하게 확인 어렵다
                정해쳐있는 매개변수에 맞는 값만을 전달해야 됨
                ㄴ따라서 선택적으로 원하는 필드에만 값을 담고자할 경우
                ㄴ경우의 수 별로 매개변수 생성자를 만들어야 됨
         */
        UserDTO user2 = new UserDTO("u02","pw02","ksh02");
        System.out.println(user2.getIF());


        System.out.println("========================");
        /*
        실습 화장품 관련 데이터 보관 CosmeticDTO 클래스 작성
        이름 가격 브랜드 카테고리 할인여부 속성으로 가져라
        작성 종료시 실행용 클래스에서
        1.기본생성자랑 setter이용해서 객체 생성
        -명 젠틀로션
        /가격 23000
        카테 스킨케어
        할인  안 함
        2.매개변수 이용해서 객체
        -명 라이너
        /가격 13000
        카테 눈
        할인  함
 */
        CosmeticDTO cdto =new CosmeticDTO();
        cdto.setName("젠틀로션");
        cdto.setpri("23000");
        cdto.setkat("스킨");
        cdto.setDc(false);
        System.out.println(cdto.getIF());
        System.out.println();


        CosmeticDTO cdto2 = new CosmeticDTO("라이너","13000","눈",true);
        System.out.println(cdto2.getIF());


        System.out.println("========================");
        Bdto br1 = new Bdto("초코빵",1000);
        System.out.println(br1.toString());

        Bkdto br2 = new Bkdto();
        br2.setBkName("김성호빵집");
        br2.setBkAddr("집앞");
        br2.setBread(br1);
        System.out.println(br2.toString());

        Bkdto br3 = new Bkdto();
        br3.setBkName("김성호빵집2호점");
        br3.setBkAddr("집뒤");
        br3.setBread(br1);
        System.out.println(br3.toString());

        Bkdto br4 = new Bkdto("성심당","대전시",new Bdto("튀김소보로",2500));
        System.out.println(br4.toString());
        System.out.println("파는빵"+ br4.getBread().toString());
    }
    //2500원짜리 튀김 소보로를 판매하는 성심당 대전 빵집 만들기 br4
    //빵집정보 출력 성심당에서 판매하는 빵정보만 출력


}
