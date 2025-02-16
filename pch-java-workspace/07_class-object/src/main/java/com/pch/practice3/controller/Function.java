package com.pch.practice3.controller;

import java.util.Random;

public class Function {
    public void printLottoNumbers() {
        // 1~45까지의 임의의 정수 6개를 발생시켜 출력하는 메소드
        System.out.print("1. 랜덤 값 : ");
        for (int i = 0; i < 6; i++) {
            System.out.print((new Random().nextInt(45) + 1)+" ");
        }
        System.out.println();
    }

    public void outputChar(int num, char c) {
        // 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
        System.out.print("2. "+c+"문자 "+num+"개 출력 :");
        for(int i = 0; i<num; i++) {
            System.out.print(" "+c);
        }
        System.out.println();
    }

    public char alphabette() {
        // 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
        // 주의! 소문자 대문자 모두 포함
        int rand1 = new Random().nextInt(26);
        int rand2 = new Random().nextInt(26);
        if(rand1+rand2>26) return (char)(rand1+'A');
        else return (char)(rand1+'a');
    }

    public String mySubstring(String str, int index1, int index2) {
        // 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
        // 해당 인덱스 범위의 문자열을 추출하여 리턴
        // 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
        if (str == null || str.length() == 0) return null;
        return str.substring(index1, index2);
    }
}
