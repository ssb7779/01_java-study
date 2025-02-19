package com.john.practice8.mvc.view;

import com.john.practice8.mvc.controller.MemberController;
import com.john.practice8.mvc.dto.Member;

import java.util.Scanner;

public class MemberMenu {

    // MemberController 클래스 접근을 위해 필드로 선언
    private MemberController mc = new MemberController();
    private Scanner sc = new Scanner(System.in); // 키보드로 입력 받기 위해서

    public void mainMenu() {

        // 메뉴 출력 			>> 반복 실행 처리함
				/*
					====== 회원 관리 메뉴 ======
					1. 신규 회원 등록	 	>> insertMember() 실행
					2. 회원 정보 검색		>> searchMember() 실행
					3. 회원 정보 수정		>> updateMember() 실행
					4. 회원 정보 삭제 		>> deleteMember() 실행
					5. 회원 정보 출력		>> printAllMember() 실행
					0. 프로그램 종료
			  */
        while (true) {
            System.out.println("====== 회원 관리 메뉴 ======");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 정보 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 회원 정보 출력");
            System.out.println("0. 프로그램 종료");
            System.out.print("메뉴 선택 >> ");
            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    insertMember();
                    break;
                case 2:
                    searchMember();
                    break;
                case 3:
                    updateMember();
                    break;
                case 4:
                    deleteMember();
                    break;
                case 5:
                    printAllMember();
                    break;
                case 0:
                    System.out.println("프로그램을 종료합니다");
                    return;
                default:
                    System.out.println("잘못된 입력값입니다. 다시 입력하세요");
            }
        }
    }

    public void insertMember() {
        // 1. 현재 회원 수(memberCount)가 최대 회원 수(SIZE)를 넘어설 경우 return 처리
        //    MemberController의 getMemberCount() 메소드를 통해 현재 회원 수 알아오고
        //    최대 회원 수는 상수필드여서 클래스명. 으로 직접 접근 가능

        // 2. 아이디를 입력 받아 MemberController의 checkId() 메소드로 전달 >> 결과 값 받기
        //    (아이디 중복 체크하는 과정)

        // 2_1. 결과 값이 null이 아닌 경우 즉, 동일한 아이디가 존재하는 경우
        //      “동일한 아이디가 존재합니다. 회원등록 실패” 출력
        // 2_2. 결과 값이 null인 경우 즉, 동일한 아이디가 존재하지 않는 경우
        //      나머지 회원 정보 입력 받도록 (비밀번호, 이름, 나이, 성별, 이메일)
        //      입력 받은 정보를 Member의 매개변수 생성자를 이용하여 객체 생성 후
        //      MemberController의 insertMember() 메소드로 전달
        //      “성공적으로 회원 등록이 되었습니다.” 출력

        // 1. 현재 등록된 멤버 수 조회
        if (mc.getMemberCount() >= MemberController.SIZE) {
            System.out.println("회원수 초과로 등록이 불가능합니다.");
            return;
        }

        System.out.print("등록하려는 아이디를 입력하세요: ");
        String memberId = sc.nextLine();

        // 2. 중복 ID 조회
        if (mc.checkId(memberId) != null) {
            System.out.println("동일한 아이디가 존재합니다. 회원등록 실패");
            return;
        }
        System.out.print("비밀번호를 입력하세요: ");
        String memberPwd = sc.nextLine();
        System.out.print("이름을 입력하세요: ");
        String memberName = sc.nextLine();
        System.out.print("나이를 입력하세요: ");
        int memberAge = sc.nextInt();
        sc.nextLine();
        System.out.print("성별을 입력하세요: ");
        char memberGender = sc.nextLine().charAt(0);
        System.out.print("이메일을 입력하세요: ");
        String memberEmail = sc.nextLine();

        Member member = new Member(memberId, memberPwd, memberName, memberAge, memberGender, memberEmail);
        mc.insertMember(member);
        System.out.println("성공적으로 회원 등록이 되었습니다.");

    }

    public void searchMember() {

        // 메뉴 출력 			>> 반복 실행 처리함
				/*
					====== 회원 정보 검색 ======
					1. 아이디로 검색하기
					2. 이름으로 검색하기
					3. 이메일로 검색하기
					0.  이전 메뉴로
					메뉴 선택 : 			>> 키보드로 입력 받기 (menu : int)
					검색 내용 : 			>> 키보드로 입력 받기 (search : String)
				*/

        // 1. MemberController의 searchMember() 메소드로 menu와 search 문자열 전달 >> 결과 값
        //    1_1. 결과 값이 null인 경우 즉, 검색 결과가 없는 경우 >> “검색된 결과가 없습니다.” 출력
        //    1_2. 결과 값이 null이 아닌 경우 즉, 검색 결과가 존재하는 경우 >> 회원 정보 출력

        while (true) {
            System.out.println("====== 회원 정보 검색 ======");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("0.  이전 메뉴로");
            System.out.print("메뉴 선택 >> ");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    System.out.print("검색할 아이디를 입력하세요: ");
                    break;
                case 2:
                    System.out.print("검색할 이름을 입력하세요: ");
                    break;
                case 3:
                    System.out.print("검색할 이메일을 입력하세요: ");
                    break;
                case 0:
                    return;

            }
            String str = sc.nextLine();
            Member member = mc.searchMember(choice, str);
            if (member != null) {
                System.out.println(member.getInformation());
            } else {
                System.out.println("검색된 결과가 없습니다.");
            }
            break;
        }
    }


    public void updateMember() {
        // 메뉴 출력 			>> 반복 실행 처리함
				/*
					====== 회원 정보 수정 ======
					1. 비밀번호 수정
					2. 이름 수정
					3. 이메일 수정
					0.  이전 메뉴로
					메뉴 선택 : 			        >> 키보드로 입력 받기 (menu : int)
					변경할 회원 아이디 : 		>> 키보드로 입력 받기 (userId : String)
				*/

        // 1. MemberController의 checkId()로 userId 전달 	>> 결과 값 (m : Member)
        //    1_1. 결과 값이 null인경우 >> “변경할 회원이 존재하지 않습니다” 출력
        //    1_2. 결과 값이 null이 아닌 경우 기존 정보 출력 후
        //         변경내용(update : String) 입력 받고
        //         MemberController의 updateMember()에 m, menu, update 전달
        //         “회원의 정보가 변경되었습니다.” 출력

        while (true) {
            System.out.println("====== 회원 정보 수정 ======");
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이름 수정");
            System.out.println("3. 이메일 수정");
            System.out.println("0.  이전 메뉴로");
            System.out.print("메뉴 션택 : ");
            int menu = sc.nextInt();
            sc.nextLine();

            if (menu == 0) {
                return;
            }

            System.out.print("변경할 회원 아이디를 입력하세요: ");
            String userId = sc.nextLine();
            Member m = mc.checkId(userId);

            if (m == null) {
                System.out.println("변경할 회원이 존재하지 않습니다.");
                return;
            } else {
                System.out.println("유저의 이전 정보: " + m.getInformation());
                System.out.print("변경할 값: ");
                String update = sc.nextLine();
                mc.updateMember(m, menu, update);
                System.out.println("회원의 정보가 변경되었습니다.");
            }
        }
    }

    public void deleteMember() {

        // 삭제할 회원 아이디 : 			>> 키보드로 입력 받기 (userId : String)

        // 1. MemberController의 checkId()에 userId 전달 	>> 결과 값 (m : Member)
        //    1_1. 결과 값이 null인 경우 “삭제할 회원이 존재하지 않습니다.” 출력
        //    1_2. 결과 값이 null이 아닌 경우 기존 정보 출력
        //         “정말 삭제하시겠습니까? (y/n) : “ 		>> 키보드로 입력 받기
        //         대소문자 구분 없이 ‘Y’인 경우 MemberController의 deleteMember()에 userId 전달
        //         “회원의 정보가 삭제되었습니다.” 출력

        System.out.print("삭제할 회원 아이디를 입력하세요: ");
        String userId = sc.nextLine();
        Member m = mc.checkId(userId);
        if (m == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다.");
        } else {
            System.out.println("기존 회원 정보");
            System.out.println(m.getInformation());
            System.out.println("정말 삭제하시겠습니까? (y/n) : ");
            char choice = sc.nextLine().charAt(0);
            if (choice == 'y' || choice == 'Y') {
                mc.deleteMember(userId);
                System.out.println("회원의 정보가 삭제되었습니다.");
            } else {
                System.out.println("잘못된 입력값입니다. 회원이 삭제되지 않았습니다.");
            }
        }
    }

    public void printAllMember() {
        // MemberController의 getMem() 메소드 호출 	>> 결과 값 (mem : Member[])
        // 반복문을 통해 결과 값 안의 존재하는 회원들 정보 출력
        Member[] members = mc.getMem();

        for (Member m : members) {
            if (m != null) {
                System.out.println(m.getInformation());
            }
        }
    }
}
