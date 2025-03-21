package com.jjanggu.practice8.mvc.view;

import com.jjanggu.practice8.mvc.controller.MemberController;
import com.jjanggu.practice8.mvc.dto.Member;

import java.util.Scanner;

public class MemberMenu {

    private MemberController mc = new MemberController();
    private Scanner sc = new Scanner(System.in);

    public void mainMenu() {

        System.out.print("===== 회원 관리 메뉴 =====\n");
        System.out.println("1. 신규 회원 등록");
        System.out.println("2. 회원 정보 검색");
        System.out.println("3. 회원 정보 수정");
        System.out.println("4. 회원 정보 삭제");
        System.out.println("5. 회원 정보 출력");
        System.out.println("0. 프로그램 종료");
        System.out.print("메뉴 선택 : ");
        int menu = sc.nextInt();
        sc.nextLine();

        switch (menu){
            case 1: insertMember();
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 0:
                System.out.println("프로그램을 종료합니다.");
                return;
            default:
                System.out.println("잘못입력하셨습니다.");
        }
    }

    public void insertMember() {
        // 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
        //    MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
        //    최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능
        if(mc.getMemberCount() > MemberController.SIZE){
            System.out.println("최대 회원수를 초과하였습니다.");
            return;
        }

        // 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
        //    (아이디 중복 체크하는 과정)
        System.out.println("아이디 입력: ");
        String userId = sc.nextLine();

        Member m = mc.checkId(userId);

        // 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
        //      “동일한 아이디가 존재합니다. 회원등록 실패” 출력
        // 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
        //      나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
        //      입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
        //      MemberController의 insertMember() 메소드로 전달
        //      “성공적으로 회원 등록이 되었습니다.” 출력
        if(m != null){
            System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
        }else{
            System.out.println("비밀번호: ");
        }
    }
}
