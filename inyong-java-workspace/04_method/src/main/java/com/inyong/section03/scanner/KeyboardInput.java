package com.inyong.section03.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;
public class KeyboardInput {
    /*
    Scanner = java.util.Scanner
    1. 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
    2. 입력값이 담겨져있는 버퍼로 부터 메모리상으로 값을 읽을 수 있음
    java.util

    next()      : 입력된 값을 String으로 반환 (공백이전)
    nextLine()  : 입력된 값을 String으로 반환
    nextInt()   : 입력된 값을 int로 반환
    nextDouble(): 입력된 값을 double로 반환
     */
    Scanner sc = new Scanner(System.in);

    public void testBasicScanner () {
        System.out.print("인사말 입력 : ");
        String input = sc.nextLine();


        System.out.print("나이 입력 : ");
        String input2 = sc.nextLine();

        System.out.print("키 입력: ");
        double height = sc.nextDouble();


        System.out.println("입력하신 인사말 : " + input);
        System.out.println("입력하신 나이 : " + input2);
        System.out.println("키 입력 : " + height);

        this.testScannerExample1();
    }

    public void testScannerExample1 () {
        System.out.println("정보를 입력하세요");
        System.out.print("이름 : ");
        String input = sc.nextLine();

        System.out.print("학교 :");
        String input2 = sc.nextLine();

        System.out.print("반 :");
        int input3 = sc.nextInt();

        System.out.println(input + " " + input2 + " " + input3);
    }

    public void testWarningCase1 () {
        // 유의사항 nextLine
        System.out.print("주소 입력: ");
        String address = sc.next();
        // 주소 입력: 나이입력: Exception in thread "main" java.util.InputMismatchException
        // 서울시 강서구 (서울시만 포함 강서구는 버퍼에 남아있음)
        // 여러 단어를 입력될 여지는 -> nextLine

        System.out.print("나이입력: ");
        int age = sc.nextInt();

        System.out.println(address);
        System.out.println(age);

    }

    public void testWarningCase2 () {
        /*
        nextLine은 개행(enter \n)을 토큰 구분자로 인식함
        그리고 버퍼 내에 개행을 감지하여 개행이 존재할 경우 입력되었다 간주해서 값을 읽어들임
        개행문자를 제거해주지 않음
         */

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();
        // 여기서 사용한 enter(개행 \n') 이 버퍼에 남아 다음 nextLine에 영향을 준다
        System.out.print("주소: ");
        String adress = sc.nextLine();


        System.out.print(name);
        System.out.print(age);
        System.out.print(adress);

    }

    public void testSpacialCase () {
        // 문자형으로 값 입력받기

        /*
        Scanner 에서는 char형으로 값을 반환하는 메소드를 제공하지 않음

        문자열.charAt(인덱스) => 해당 문자열의 인덱스 리턴
         */

        String fruit = "apple";
        //System.out.println(fruit.charAt(7));
        //Exception in thread "main" java.lang.StringIndexOutOfBoundsException

        System.out.println("성별 m/f 입력: ");
        char gender = sc.next().charAt(0);

        System.out.println(gender);



    }

    public void testScannerExample2 () {
        // 상품명 string, 브랜드명 string, 가격 int, 제조국가 string, 할인율(double), 등급(char)

        System.out.print("상품명: ");
        String product = sc.nextLine();

        System.out.print("브랜드: ");
        String brand = sc.nextLine();

        System.out.print("가격: ");
        int price = sc.nextInt();

        System.out.print("제조국가: ");
        String country = sc.next();

        System.out.print("할인율: ");
        double discount_rate = sc.nextDouble();

//        sc.nextLine();

        System.out.print("등급(a~z): ");
        char rank = sc.next().charAt(0);

        System.out.println(product + " " + brand + " " + price +  " " + country + " " + discount_rate + " " + rank);
    }

}
