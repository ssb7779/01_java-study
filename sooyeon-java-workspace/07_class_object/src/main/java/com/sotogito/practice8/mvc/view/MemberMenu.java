package com.sotogito.practice8.mvc.view;

import com.sotogito.practice8.mvc.controller.MemberController;
import com.sotogito.practice8.mvc.dto.Member;

import java.util.Scanner;

public class MemberMenu {
    MemberController mc = new MemberController();
    Scanner sc = new Scanner(System.in);

    public void mainMenu() {
        while (true) {
            System.out.println("====== 회원 관리 메뉴 ======");
            System.out.println("1. 신규 회원 등록");
            System.out.println("2. 회원 정보 검색");
            System.out.println("3. 회원 정보 수정");
            System.out.println("4. 회원 정보 삭제");
            System.out.println("5. 회원 정보 출력");
            System.out.println("0. 프로그램 종료");
            int functionNum = sc.nextInt();

            if (functionNum == 0) {
                System.out.println("종료합니다.");
                return;
            }

            if (functionNum == 1) {
                insertMember();
            } else if (functionNum == 2) {
                searchMember();
            } else if (functionNum == 3) {
                updateMember();
            } else if (functionNum == 4) {
                deleteMember();
            } else if (functionNum == 5) {
                printAllMember();
            } else {
                System.out.println("존재하지 않는 기능입니다.");
            }
        }
    }

    public void insertMember() {
        if (mc.getMemberCount() == MemberController.SIZE) {
            System.out.println("더이상 멤버를 추가할 수 없습니다.");
            return;
        }

        System.out.println("id : ");
        sc.nextLine();
        String id = sc.nextLine();
        System.out.println("pwd : ");
        String pew = sc.nextLine();
        System.out.println("이름 : ");
        String name = sc.nextLine();
        System.out.println("나이 : ");
        int age = sc.nextInt();
        System.out.println("성별");
        sc.nextLine();
        char gender = sc.nextLine().charAt(0);
        System.out.println("이메일 : ");
        String email = sc.nextLine();

        if (mc.checkId(id) != null) {
            System.out.println("이미 존재하는 아이디입니다.");
            return;
        }

        Member newMember = new Member(id, pew, name, age, gender, email);
        mc.insertMember(newMember);
        System.out.println("성공적으로 회원 등록이 되었습니다.");
    }

    public void searchMember() {
        while (true) {
            System.out.println("====== 회원 정보 검색 ======");
            System.out.println("1. 아이디로 검색하기");
            System.out.println("2. 이름으로 검색하기");
            System.out.println("3. 이메일로 검색하기");
            System.out.println("0. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();

            if (menuNum == 0) {
                return;
            }

            System.out.print("검색 내용 : ");
            sc.nextLine();
            String search = sc.nextLine();


            Member member = mc.searchMember(menuNum, search);
            if (member == null) {
                System.out.println("검색된 결과가 없습니다.");
                return;
            }
            System.out.println(member.getInformation());
        }
    }

    public void updateMember() {
        while (true) {
            System.out.println("====== 회원 정보 수정 ======");
            System.out.println("1. 비밀번호 수정");
            System.out.println("2. 이름 수정");
            System.out.println("3. 이메일 수정");
            System.out.println("0. 이전 메뉴로");
            System.out.print("메뉴 선택 : ");
            int menuNum = sc.nextInt();

            if (menuNum == 0) {
                return;
            }

            System.out.print("변경할 회원 아이디 : ");
            sc.nextLine();
            String userId = sc.nextLine();

            Member member = mc.checkId(userId);
            if (member == null) {
                System.out.println("변경할 회원이 존재하지 않습니다.");
                return;
            }

            System.out.println("변경할 내용을 입력하세요.");
            String update = sc.nextLine();

            mc.updateMember(member, menuNum, update);
            System.out.println("회원의 정보가 변경되었습니다.");
        }
    }

    public void deleteMember() {
        System.out.println("삭제할 회원 아이디");
        sc.nextLine();
        String userId = sc.nextLine();

        Member member = mc.checkId(userId);
        if (member == null) {
            System.out.println("삭제할 회원이 존재하지 않습니다.");
            return;
        }

        System.out.println("정말 삭제하시겠습니다?(y/n)");
        char deleteAnswer = sc.nextLine().charAt(0);
        if (deleteAnswer == 'y' || deleteAnswer == 'Y') {
            mc.deleteMember(userId);
            System.out.println("삭제되었습니다.");
            return;
        }
        System.out.println("삭제처리 실패");
    }

    public void printAllMember() {
        for(Member member : mc.getMem()){
            System.out.println(member.getInformation());


//            if(member == null){  //FIXME null뒤에는 데이터가 없기 때문에 return으로 끝내는 게 좋을 거 같다./ 문제 : 여전히 null처리해야함
//                return;
//            }
//            System.out.println(member.getInformation());

//            if(member !=null){ //FIXME 비효율적
//                System.out.println(member.getInformation());
//            }
        }
    }

}
