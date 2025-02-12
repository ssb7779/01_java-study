package com.inyong.practice.controller;

import java.util.Scanner;

public class ArrayPractice {
    Scanner sc = new Scanner(System.in);

    public void practice1() {
        int[] arr = new int[10];
        for (int i = 0; i < 10; i++) {
            arr[i] = 1 + i;

            System.out.println(arr[i]);
        }
    }

    public void practice2() {
        int[] arr = new int[10];
        for (int i = 9; i >= 0; i--) {
            arr[i] = i + 1;

            System.out.println(arr[i]);
        }
    }

    public void practice3() {
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        int[] arr = new int[num];
        for (int i = 0; i < num; i++) {
            arr[i] = 1 + i;

            System.out.println(arr[i]);
        }

    }

    public void practice4() {

        String[] arr = new String[]{"사과", "귤", "포도", "복숭아", "참외"};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    public void practice5() {
        System.out.println("문자열을 입력하세요");
        String str = sc.nextLine();
        System.out.println("문자를 입력하세요");
        String c = sc.next();
        String[] arr = new String[str.length()];
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            arr[i] = String.valueOf(str.charAt(i));

            if (arr[i].equals(c)) {
                System.out.println(i);
                count++;
            }

        }
        System.out.println(count);
    }

    public void practice6() {
        System.out.println("숫자를 입력하세요");
        int c = sc.nextInt();

        String[] arr = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        if(c>6 || c < 0){
            System.out.println("잘못입력하셨습니다.");
        }

        System.out.println(arr[c]);
    }

    public void practice7() {
        System.out.println("숫자를 입력하세요");
        int num = sc.nextInt();
        int [] arr = new int[num];

        for (int i = 0; i < num; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값:", i);
            int input = sc.nextInt();

            arr[i] = input;
        }
        int sum = 0;
        for(int i : arr){
            sum += i;
            System.out.println(i);
        }
        System.out.println("총합 : " + sum);

    }

    public void practice8() {
        int num = 0;
        while (true) {
            System.out.println("숫자를 입력하세요");
            num = sc.nextInt();

            if (num % 2 == 0 || num < 3) {
                System.out.println("다시 입력하세요");
            }
            break;
        }


        int [] arr = new int[num];


        for (int i = 0; i < (num + 1) / 2; i++) {
            arr[i] = arr[num - i - 1] = i + 1;
        }

        for(int numbers : arr){
            System.out.println(numbers);
        }




    }

    public void practice9() {
        System.out.println("치킨 이름을 입력하세요");
        String str = sc.next();

        String[] ch = {"후라이드", "양념", "간장"};

        for(int i = 0; i < ch.length; i++){
            if(ch[i].equals(str)){
                System.out.println(str + "치킨은 배달가능");
                return;
            }
        }

        System.out.println(str + "치킨은 없는 매뉴 입니다.");
    }

    public void practice10() {
        int [] arr = new int [10];

        for(int i = 0; i < 10; i++){
            arr[i] = (int) (Math.random() * 10 + 1 );

            System.out.println(arr[i]);
        }

    }

    public void practice11() {
        System.out.println("주민번호를 입력하세요 - 포함");
        String str = sc.next();
        char [] arr = new char [str.length()];

        for(int i = 0; i < str.length(); i++){
            arr[i] = str.charAt(i);
        }

        String [] personNumber = new String [str.length()];
        for(int i = 0; i < str.length(); i++){
            if(i>=8){
                personNumber[i] = "*";
            }else {
                personNumber[i] = String.valueOf(arr[i]);
            }
            System.out.print(personNumber[i]);
        }

    }

    public void homework(){
        // arr[i] = (char)(str.charAt(i) + 1);
        // String.valueOf() (문자열화시키고자하는값) : 전달값을 가지고 문자열로 만들어 반환
        // -> arr도 가능 String.valueOf(arr) => 모두 합침
        // Arrays.toString(arr) : 구분자로 나누어 합침


    }

}
