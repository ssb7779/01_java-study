package com.minkook.section01.user_type;

import java.util.Scanner;

public class Application {
    public static void main(String [] args){
        //사용자 정의 자료형(Member) 클래스를 가지고 필드에 정보를 담기 위해서
        //클래스를 가지고 객체 생성해야 함
        Member member = new Member();
        Scanner sc = new Scanner(System.in);

        System.out.print("이름을 입력하시오: ");
        member.setName(sc.nextLine());

        System.out.print("나이를 입력하세요: ");
        member.setAge(sc.nextInt());

        member.printProfile();
        

        
    }
}
