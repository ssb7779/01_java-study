package com.pch.section.user_type;

public class Application {
    public static void main(String[] args) {
        /* 변수를 이용한 회원 데이터 관리 시 단점
         * 1. 변수명을 다 관리해야 하는 어려움이 생긴다.
         * 2. 모든 회원 정보를 인자로 메소드 호출 시 값을 전달해야 하면
         *     너무 많은 값들을 인자로 전달해야 해서 한 눈에 안들어온다.
         * 3. 리턴은 1개의 값만 가능하기 때문에 회원정보를 묶어서 리턴값으로 사용할 수 없다.
         *    (서로 다른 자료형들이기 때문)
         * */
        String id = "user01";
        String pwd = "pass01";
        String name = "홍길동";
        int age = 20;
        char gender = '남';
        String[] hobby = new String[] {"축구", "볼링", "테니스"};

        System.out.println("id : " + id);
        System.out.println("pwd : " + pwd);
        System.out.println("name : " + name);
        System.out.println("age : " + age);
        System.out.println("gender : " + gender);
        System.out.print("hobby : ");
        for(int i = 0; i < hobby.length; i++) {
            System.out.print(hobby[i] + " ");
        }
        System.out.println();

        Member member = new Member();

        /* 필드에 접근하기 위해서는 레퍼런스변수명.필드명 으로 접근한다.
         * '.'은 참조연산자 라고 하는데, 레퍼런스 변수가 참고하고 있는 주소로 접근한다는 의미를 가진다.
         * 각 공간은 필드명으로 접근한다. (배열은 인덱스로 접근, 객체는 필드명으로 접근이다)
         * */
        System.out.println("member.id : " + member.id);
        System.out.println("member.pwd : " + member.pwd);
        System.out.println("member.name : " + member.name);
        System.out.println("member.age : " + member.age);
        System.out.println("member.gender : " + member.gender);
        System.out.println("member.hobby : " + member.hobby);



//        Monster monster1 = new Monster();
//        monster1.name = "두치";
//        monster1.hp = 200;
//
//        System.out.println("monster1 name : " + monster1.name);
//        System.out.println("monster1 hp : " + monster1.hp);
//
//        Monster monster2 = new Monster();;
//        monster2.name = "뿌꾸";
//        /* 몬스터2의 체력을 음수로 지정하였다. */
//        monster2.hp = -200;
//
//        System.out.println("monster2 name : " + monster2.name);
//        System.out.println("monster2 hp : " + monster2.hp);



        Monster monster1 = new Monster();
        monster1.name = "드라큘라";
        monster1.hp = 200;

        Monster monster2 = new Monster();
        monster2.name = "프랑켄슈타인";
        monster2.hp = 300;

        Monster monster3 = new Monster();
        monster3.name = "미이라";
        monster3.hp = 400;

        System.out.println("monster1 name : " + monster1.name);
        System.out.println("monster1 hp : " + monster1.hp);
        System.out.println("monster2 name : " + monster2.name);
        System.out.println("monster2 hp : " + monster2.hp);
        System.out.println("monster3 name : " + monster3.name);
        System.out.println("monster3 hp : " + monster3.hp);
    }
}
