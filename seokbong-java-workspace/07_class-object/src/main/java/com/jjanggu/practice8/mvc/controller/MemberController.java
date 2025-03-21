package com.jjanggu.practice8.mvc.controller;

import com.jjanggu.practice8.mvc.dto.Member;

public class MemberController {

    public static final int SIZE = 10;
    private int memberCount;
    private Member[] mem =  new Member[SIZE];

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

    public Member[] getMem () {
        return mem;
    }

    public Member checkId(String userId) {
        Member m = null; 	// 아이디로 검색된 결과를 담을 변수 초기화
        // mem 에서 매개변수로 전달받은 userId와 동일한 아이디를 가지고 있는 회원을 m에 대입
        for(int i = 0; i < memberCount; i ++){
            if(mem[i].getName().equals(userId)){
                m = mem[i];
            }
        }
        // m 리턴
        return m;
    }

    public void insertMember(Member m) {
        // 매개변수로 전달받은 회원객체를 mem 배열에 추가
        mem[memberCount] = m;
        // memberCount 1 증가
        memberCount++;
    }







}
