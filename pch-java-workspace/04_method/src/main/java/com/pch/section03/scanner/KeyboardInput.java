package com.pch.section03.scanner;

import java.io.*;
import java.util.Scanner;

public class KeyboardInput {
    /**
     * ## Scanner == java.util.Scanner ##
     * 1. 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
     * 2. 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음
     * 3. java.util 에서 제공됨
     * 4. 주요 제공 메서드
     *  1) next()       : 입력된 값을 String 형으로 반환함
     *  2) nextLine()   : 입력된 값을 String 형으로 반환함
     *  3) nextInt()    : 입력된 값을 int 형으로 반환함
     *  4) nextDouble() : 입력된 값을 double 형으로 반환함
     *
     * 5. 사용 방법
     *  1) Scanner 객체 생성
     *  2) 메소드 호출
     */

    public void testBasicScanner(){
        Scanner sc = new Scanner(System.in);
        String greeting = "";
        System.out.print("인사말 입력 : ");
//        greeting = sc.next();
        greeting = sc.nextLine();

        System.out.println("입력하신 인사말은 " + greeting + "입니다.");
    }

    public void testBasicBuffered() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder();

        sb.append("입력하신 인삿말은 ").append(br.read()).append(" 입니다.");

        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

    public void testWarningCase2(){
        /*
            ## Scanner 사용시 유의사항 2 ##
            nextLine()은 개행(enter, \n) 을 토큰 구분자로 인식함
            그리고 버퍼 내에 개행을 감지하여 개행이 존재할 경우 입력되었다 간주해서 값을 읽어들임
            nextLine()을 제외한 메서드들은 토큰을 읽어들인 후 개행문자를 제거하지 않음
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine(); // 읽어들인 후 개행 제거함

        System.out.print("나이 : ");
        int age = sc.nextInt(); // 읽어들인 후 개행 제거 안함

        sc.nextLine(); // 개행문자 제거. 버퍼 비우기

        System.out.print("주소 : ");
        String address = sc.nextLine(); // 버퍼에 개행이 남아있어 입력되었다고 간주되어 곧바로 읽어들여짐

        System.out.println(age + "살 "+name+"님은 "+address+"에 삽니다.");

        /*
            ## 해결방법 ##
            문제상황   : nextLine()을 제외한 메서드들이 실행된 후 nextLine()이 오게 될 경우 발생됨
            해결책     : 버퍼에 남아있는 개행을 제거하고 nextLine()이 수행될 수 있도록 하기
         */
    }

    public void testSpecialCase(){
        /*
            ## 문자형으로 값 입력받기 ##
            Scanner 에서는 char 형으로 값을 반환하는 메서드를 제공하지 않음
            문자와 밀접하게 연관있는 문장려로 값을 읽어들인 후
            원하는 순번(자바에선 index)째의 문자를 반환받아 기록하면됨

            ex)     "apple"     => 문자열 (String)
                0   1   2   3   4   => 인덱스(위치)
                'a' 'p' 'p' 'l' 'e' => 문자 (char)
         */

//        String fruit = "apple";
//        System.out.println(fruit.charAt(4));

        Scanner sc = new Scanner(System.in);
        System.out.print("성별(M/F) 입력: ");
        char gender = sc.next().charAt(0);

        System.out.println(gender);
    }

    public void testSpecialCase2(){
        /*
            실습
            상품 등록 화면이라 가정.
            사용자에게 등록할 상품에 대한 정보 입력받기
            상품명, 브랜드명, 가격, 제조국가, 할인율, 등급 순으로 입력받기
         */

        Scanner sc = new Scanner(System.in);
        System.out.println("상품 정보를 입력해주세요");
        System.out.print("상품명 입력(String) : ");
        String productName = sc.nextLine();

        System.out.print("브랜드명 입력(String) : ");
        String brandName = sc.nextLine();

        System.out.print("상품 가격 입력(int) : ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("상품 제조국가 입력(String) : ");
        String nation = sc.nextLine();

        System.out.print("상품 할인율 입력(double) : ");
        double salePercent = sc.nextDouble();
        sc.nextLine();

        System.out.print("상품 등급 입력(char) : ");
        char grade = sc.next().charAt(0);
        sc.nextLine();
        System.out.printf("상품명 : %s\n브랜드명 : %s\n상품 가격 : %d\n제조국가 : %s\n할인율 : %.1f%%\n등급 : %c",productName,brandName,price,nation,salePercent,grade);
    }
}
