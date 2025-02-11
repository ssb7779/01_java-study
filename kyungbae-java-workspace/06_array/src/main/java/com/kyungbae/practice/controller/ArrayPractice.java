package com.kyungbae.practice.controller;

import java.util.Scanner;

public class ArrayPractice {

    public void practice1(){

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i + 1;
        }

        for (int j : arr){
            System.out.print(j + " ");
        }

    } // p1 end

    public void practice2(){

        int[] arr = new int[10];
        for (int i = (arr.length - 1); i >= 0; i--){
            arr[i] = i + 1;
        }

        for (int j : arr){
            System.out.print(j + " ");
        }

    } // p2 end

    public void practice3() {
        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수 : ");
        int num = sc.nextInt();
        int[] arr = new int[num];

        for (int i = 0; i < num; i++) {
            arr[i] = i + 1;
        }

        for (int j : arr) {
            System.out.print(j + " ");
        }

    } // p3 end

    public void practice4(){

        String[] sarr = {"사과", "귤", "포도", "복숭아", "참외"};

        System.out.println(sarr[1]);

    } // p4 end

    public void practice5(){
        Scanner sc = new Scanner(System.in);

        // 문자열 입력
        System.out.print("문자열 : ");
        String str = sc.nextLine();
        // 문자 입력
        System.out.print("문자 : ");
        char ch = sc.nextLine().charAt(0);

        // 문자 배열 생성 ( 문자열 길이 )
        char[] carr = new char[str.length()];

        // 문자 배열에 문자 넣기
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            carr[i] = str.charAt(i);
            // 문자 비교
            if (carr[i] == ch){
                count++; // 같으면 +1
            }
        }
        // 출력
        System.out.printf("%c 개수 : %d", ch, count);

    } // p5 end

    public void practice6(){
        Scanner sc = new Scanner(System.in);

        // 요일 문자열 배열 생성
        String[] sarr = {"월", "화", "수", "목", "금", "토", "일"};

        // 숫자 입력
        System.out.print("0 ~ 6 사이 숫자 입력 : ");
        int num = sc.nextInt();

        // 잘못입력
        if (!(num >= 0 && num <= 6)){
            System.out.println("잘못 입력하셨습니다.");
            return;
        }

        // 요일 찾기
        for(int i = 0; i < sarr.length; i++){
            if (i == num){
                System.out.println( sarr[i] + "요일");
            }
        }

    } // p6 end

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수 : ");
        int num = sc.nextInt();

        int[] arr = new int[num];

        int sum = 0;
        String sik = "";
        for ( int i = 0; i < arr.length; i++){
            System.out.print("배열 " + i + "번째 인덱스에 넣을 값 : ");
            int j = sc.nextInt();
            sum += j;
            sik += j + " ";
        }
        System.out.println(sik);
        System.out.println("총 합 : " + sum);

    } // p7 end

    public void practice8(){
        Scanner sc = new Scanner(System.in);

        // 반복
        while (true) {
            // 정수 입력받기
            System.out.print("정수 : ");
            int num = sc.nextInt();

            // 홀수인지 확인
            if (num != 1 && num % 2 == 1) {

                // 순차적인 숫자를 넣을 배열 생성 (배열크기 주의)
                // if 3 == 1, 2, 3, 2, 1 ==> 5개
                // if 5 == 1, 2, 3, 4, 5, 4, 3, 2, 1 ==> 9개
                // if x == 1 ,2 ,3 ... x ... 3, 2, 1 ==> x * 2 - 1
                int[] arr = new int[num * 2 - 1];


                // 커지기
                int count = 0;
                for (int i = 0; i < num; i++) {
                    arr[count] = i + 1;
                    count++;
                }
                // 작아지기
                for (int i = (num - 1); i > 0; i--) {
                    arr[count] = i;
                    count++;
                }
                // 출력
                for (int i = 0; i < arr.length; i++) {
                    if (!(i + 1 == arr.length)){
                        System.out.print(arr[i] + ", ");
                    }else{
                        System.out.println(arr[i]); // 마지막 숫자에 , 안넣기
                    }
                }
                break;
            }
            System.out.println("다시 입력하세요.");
        }

    } // p8 end

    public void practice9(){
        Scanner sc = new Scanner(System.in);
        // 치킨 배열
        String[] menu = {"후라이드", "양념", "간장", "파닭"};

        // 치킨 검색
        System.out.print("치킨 이름을 입력하세요 : ");
        String ck = sc.nextLine();

        // 치킨 대조
        for (String s : menu) {
            if (ck.equals(s)) {
                System.out.println(s + "치킨 배달 가능");
                return;
            }
        }

        System.out.println(ck + "은(는) 없는 메뉴입니다.");


    } // p9 end

    public void practice10(){

        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = (int)(Math.random() * 10 + 1);
        }

        for (int i : arr){
            System.out.print(i + " ");
        }

    } // p10 end

    public void practice11(){

        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호(-포함) : " );
        String str = sc.nextLine();

        String[] sarr = new String[14];

        for (int i = 0; i < str.length(); i++){
            if (i > 7) {
                sarr[i] = "*";
            }else {
                sarr[i] = str.charAt(i) + "";
            }
        }
        for (String i : sarr){
            System.out.print(i);
        }

    } // p11 end



} // class end
