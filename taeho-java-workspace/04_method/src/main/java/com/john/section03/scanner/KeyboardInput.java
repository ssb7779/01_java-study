package com.john.section03.scanner;

import java.sql.SQLOutput;
import java.util.Scanner;

/*
    ## Scanner
    1. 사용자로부터 입력되는 값을 받아 처리하는 클래스
    2. 입력값이 담긴 버퍼로부터 메모리상으로 값을 읽어들일 수 있음

*/
public class KeyboardInput {
    public void testBasicScanner() {
        
        // 입력 받은 값을 byte 단위로 읽음
        java.util.Scanner sc = new java.util.Scanner(System.in);

        System.out.print("인사말 입력: ");
//        String greetingMsg = sc.next(); // next() 단일 토큰만 읽음(토큰: ' ' 공백기준)
        String greetingMsg = sc.nextLine();


        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        System.out.print("키 입력: ");
        double height = sc.nextDouble();

        System.out.println("입력하신 인사말은 '" + greetingMsg + "'입니다.");
        System.out.println("입력하신 나이는 '" + age + "' 살 입니다.");
        System.out.println("입력하신 키는 '" + height + "'cm 입니다.");
    }

    public void testScannerExample() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();
        System.out.print("학교: ");
        String school = sc.next();
        System.out.print("학년: ");
        int grade = sc.nextInt();
        System.out.print("반: ");
        int classTeam = sc.nextInt();
        System.out.println("당신의 이름은 "
                            + name + " 이고 "
                            + school + " 학교 "
                            + grade + " 학년 "
                            + classTeam + " 반 입니다.");

        System.out.printf("%s에 다니는 %d학년 %d반 %s", school, grade, classTeam, name);
    }

    public void testWarningCase() {
        /*
            sc.next()의 경우 A B로 입력하면
            A와 B가 둘다 Buffer에 들어감
            여기서 A는 sc.next()로 읽히는데
            이후 sc.nextInt()에서 입력값을 받기도 전에
            이미 버퍼에 남아있는 B값을 읽어 InputMismatchException 발생
            nextLine()을 제외, 나머지는 공백기준으로 나눈 입력값을 단일 토큰으로 받음
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("주소 입력: ");
//        String address = sc.next();
        String address = sc.nextLine();
        


        System.out.print("나이 입력: ");
        int age = sc.nextInt();

        System.out.println(address);
        System.out.println(age);
    }

    public void testWarningCase2() {
        /*
            nextLine()은 개행(enter, \n)을 토큰 구분자로 사용
            nextLine()을 제외한 메서드들은 토큰값을 읽고 개행문자를 제거하지 않음
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();

        /*
            nextInt()에서 개행이 제거 되지 않아 주소 값이 입력된 것으로 간주 돼,
            빈 문자열이 출력됨.
         */
        sc.nextLine(); // 버퍼 비우기

        System.out.print("주소: ");
        String address = sc.nextLine();

        System.out.println(age + "살" + name + "님" + address + "에 거주");

    }
    public void testCharCase(){
        /*
            char값을 반환하고 싶을 때 적용
            우선 문자열로 값을 읽은 후, 원하는 인덱스 위치의 문자값을 저장
            String fruit = "apple";
            char ch = fruit.charAt(0);
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("성별(MorF) 입력: ");
        char gender = sc.next().charAt(0);
        System.out.println(gender);

    }
    public void testScannerExample2() {
        /*
            상품(String), 브랜드(String), 가격(int),
            제조국(String), 할인율(double), 등급(char/A~D)
            순으로 입력받은 이후 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("상품명 ");
        String goods = sc.nextLine();
        System.out.print("브랜드 ");
        String brand = sc.nextLine();
        System.out.print("가격 ");
        int price = sc.nextInt();

        sc.nextLine(); // 버퍼 flush
        System.out.print("제조국 ");
        String country = sc.nextLine();
        System.out.print("할인율 ");
        double discountRate = sc.nextDouble();
        sc.nextLine(); // 버퍼 flush
        System.out.print("등급 ");
        char grade = sc.nextLine().charAt(0);
        System.out.printf("상품 : %s\n브랜드 : %s\n가격 : %d\n제조국 : %s\n할인율 : %.1f%%\n등급 : %s\n"
                                ,goods, brand, price, country, discountRate, grade);
    }
}