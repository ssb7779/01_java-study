package com.john.practice8.mvc.controller;

import com.john.practice8.mvc.dto.Member;

public class MemberController {

    public static final int SIZE = 10;              // 최대 회원 수 상수필드로 10 초기화
    private int memberCount;                        // 현재 회원 수 필드
    private Member[] mem = new Member[SIZE];    // 회원들의 정보를 담는 객체 배열

    // 초기화 블럭을 이용하여 회원 5명 정도 초기화, memberCount 수 5 초기화 (복사해 갈 것)
    // * 초기화 블록 : 필드에 초기값을 세팅하기 위해 사용 (주로 테스트할 때 사용함)
    // 		             MemberController 객체 생성시 메모리상에 필드 할당될 때 동시에 수행됨
    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public int getMemberCount() {
        // memberCount 리턴
        return memberCount;
    }

    public Member[] getMem() {
        // mem 주소 값 리턴
        return mem;
    }

    public Member checkId(String userId) {
        // mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
        // m 리턴
        Member m = null;    // 아이디로 검색된 결과를 담을 변수 초기화
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                m = mem[i];
            }
        }
        return m;
    }

    public void insertMember(Member m) {
        // 매개변수로 전달받은 회원객체를 mem 배열에 추가
        // memberCount 1 증가
        mem[memberCount] = m;
        memberCount++;
    }

    public Member searchMember(int menu, String search) {
        Member searchMember = null;        // 검색된 회원 정보를 담을 변수 초기화

        // 매개변수로 전달받은 search 문자열을 menu 번호에 따라

        // 1 인 경우 아이디로 검색 후 결과를 searchMember에 대입하고
        // 2 인 경우 이름으로 검색 후 결과를 searchMember에 대입하고
        // 3 인 경우 이메일로 검색 후 결과를 searchMember에 대입하고

        // searchMember 주소 값 리턴
        for (int i = 0; i < memberCount; i++) {
            if ((menu == 1 && mem[i].getUserId().equals(search)) ||
                    (menu == 2 && mem[i].getName().equals(search)) ||
                    (menu == 3 && mem[i].getEmail().equals(search))) {
                return mem[i];
            }
        }
        return null;
    }

    public void updateMember(Member m, int menu, String update) {
        // 매개변수로 전달받은 m 회원과 변경 내용인 update 문자열을 menu에 따라

        // 1 인 경우 setter 메소드를 이용하여 m의 비밀번호를 update 문자열로 변경
        // 2 인 경우 setter 메소드를 이용하여 m의 이름을 update 문자열로 변경
        // 3 인 경우 setter 메소드를 이용하여 m의 이메일을 update 문자열로 변경
        if (menu == 1) {
            m.setUserPwd(update);
        } else if (menu == 2) {
            m.setName(update);
        } else {
            m.setEmail(update);
        }
    }

    public void deleteMember(String userId) {
        // 매개변수로 전달받은 userId가 mem에 존재하는 경우 해당 회원 삭제 후
        // 다음 인덱스 객체들의 정보를 한 칸씩 앞으로 이동 시킴
        // 실행 시 NullPointerException 발생할 수 있음 -> 왜 그런지 생각해보고 해결하시오

        // memberCount 1 감소

        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                for (int j = i; j < memberCount - 1; j++) {
                    mem[j] = mem[j + 1];
                }
                mem[--memberCount] = null;
                System.out.println("회원의 정보가 삭제되었습니다.");
                return;
            }
        }
        System.out.println("삭제할 회원이 존재하지 않습니다.");
    }
}