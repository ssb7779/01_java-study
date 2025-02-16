package com.minkook.practice3.controller;

public class Function{

    public void printLottoNumbers() {
        // 1~45까지의 임의의 정수 6개를 발생시켜 출력하는 메소드
        int [] arr = new int[6];
        for(int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 45+ 1);
        }
        System.out.print("랜덤 값: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

    }

    public void outputChar(int num, char c) {
        // 매개변수로 전달받은 문자 c를 전달받은 num 갯수 만큼 출력하는 메소드
        char [] arr = new char[num];

        for(int i = 0; i < arr.length; i++){
            arr[i] = c;
        }
        System.out.print(c+"문자 5개 출력: ");
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }

    public char alphabette() {
        // 알파벳 범위의 임의의 영문자를 하나 발생시켜 리턴하는 메소드
        // 주의! 소문자 대문자 모두 포함
        char[] arr = new char[58];


        for(int i = 0; i <58;  i++) {
            if(i > 26 && i < 32){
               break;
            }else {
                arr[i] = (char)(Math.random() * 58 + 'A');
            }
        }
        return arr[0];
    }

    public String mySubstring(String str, int index1, int index2) {
        // 매개변수로 문자열과 시작 인덱스, 끝 인덱스를 전달 받고
        // 해당 인덱스 범위의 문자열을 추출하여 리턴
        // 단, res 문자열은 반드시 값이 있어야 한다. --> 없으면 null 리턴
        char[] arr = new char[str.length()];
        String res = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = str.charAt(i);
        }
        for (int i = 0; i < arr.length; i++) {
            if (i >= index1 && i < index2) {
                res += arr[i];
            }
        }
        System.out.print(str + "의" + " " + index1 + "번 인덱스와 " + index2 + "번 인덱스 사이값 출력: ");
        return res;

    }
}