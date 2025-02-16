package com.john.practice3.controller;

public class Function {

    public void printLottoNumbers() {
        int count = 0;
        String lottoNumbers = "랜덤 값: ";
        while (count < 6) {
            lottoNumbers += (int) (Math.random() * 45 + 1) + " ";
            count++;
        }
        System.out.println(lottoNumbers);
        // 1~45까지의 임의의 정수 6개를 발생시켜 출력하는 메소드
    }

    public void outputChar(int num, char c) {
        System.out.printf("%c문자 %d개 출력: ", c, num);
        for (int i = 0; i < num; i++) {
            System.out.print(c);
        }
        // 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
    }

    public char alphabette() {
        String alphaAlpha = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        int randomAlphaNum = (int) (Math.random() * alphaAlpha.length());
        // 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
        // 주의! 소문자 대문자 모두 포함
        return alphaAlpha.charAt(randomAlphaNum);
    }

    public String mySubstring(String str, int index1, int index2) {
        if(str.isEmpty()){
            return null;
        }
        String result = "";
        for(int i = index1; i < index2; i++){
            result += str.charAt(i);
        }
        // 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
        // 해당 인덱스 범위의 문자열을 추출하여 리턴
        // 단, 전달받은 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
        return result;
    }
}
