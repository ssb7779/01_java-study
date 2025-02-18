package com.sotogito.practice8.mvc.controller;

import com.sotogito.practice8.mvc.dto.Member;

import java.util.Arrays;
import java.util.List;

public class MemberController {
    public static int SIZE = 10;
    private int memberCount;
    private Member[] mem = new Member[SIZE];

    {
        mem[0] = new Member("user01", "pass01", "김유신", 20, 'M', "kim12@naver.com");
        mem[1] = new Member("user02", "pass02", "이순신", 60, 'M', "lee2@naver.com");
        mem[2] = new Member("user03", "pass03", "유관순", 17, 'F', "yo5@hanmail.net");
        mem[3] = new Member("user04", "pass04", "연개소문", 57, 'M', "yeon@gmail.com");
        mem[4] = new Member("user05", "pass05", "신사임당", 45, 'F', "shin@naver.com");
        memberCount = 5;
    }

    public int getMemberCount() {
        return memberCount;
    }

    public Member[] getMem() {
        return mem;
    }

    public Member checkId(String userId) {
        for (int i = 0; i < memberCount; i++) {
            if (mem[i].getUserId().equals(userId)) {
                return mem[i];
            }
        }
        return null;
    }

    public void insertMember(Member m) {
        mem[memberCount++] = m;
    }

    public Member searchMember(int menu, String search) {
        if (menu == 1) { //아이디
            return checkId(search);
        }
        if (menu == 2) { //이름
            for (int i = 0; i < memberCount; i++) {
                if (mem[i].getName().equals(search)) {
                    return mem[i];
                }
            }
        }
        if (menu == 3) { //이메일
            for (int i = 0; i < mem.length; i++) {
                if (mem[i].getEmail().equals(search)) {
                    return mem[i];
                }
            }
        }
        return null;
    }

    public void updateMember(Member m, int menu, String update) {
        if (menu == 1) {
            m.setUserPwd(update);
        } else if (menu == 2) {
            m.setName(update);
        } else if (menu == 3) {
            m.setEmail(update);
        } else {
            System.out.println("존재하지 않는 수정 기능입니다.");
        }
    }

    public void deleteMember(String userId) {
        Member member = checkId(userId);
        if (member == null) {
            System.out.println("존재하지 않는 멤버입니다.");
            return;
        }

        Member[] members = new Member[SIZE];
        int checkCount = memberCount;
        int count = 0;
        for (int i = 0; i < checkCount; i++) {
            if (mem[i].getUserId().equals(member.getUserId())) {
                memberCount--;
                continue;
            }
            members[count++] = mem[i];
        }
        mem = members;
    }

}
