package com.sotogito.section03.scanner;

import java.util.Scanner;
import java.util.regex.Pattern;

public class KeyboardInput {
    Scanner scanner = new Scanner(System.in);

    /**
     * ## Scanner
     * - 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
     * - 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음
     * - java.util에서 제공
     * <p>
     * ## 주요 메서드
     * - next() : 입력된 값을 String으로, 공백 이전까지의 한 토큰만 가져옴
     * - nextLine() :: 입력된 값을 String으로
     * - nextInt()
     * - nextDouble()
     * <p>
     * ## 사용 방법
     * - Scanner 객체 생성 - import
     * - 메서드 호출
     */

    public void testBasicScanner() {
        Scanner sc = new Scanner(System.in); // TODO System.in : 입력받은 값을 BYTE단위로 읽겠다.

        System.out.print("인사말 입력 : ");
        String greetingMsg = sc.next(); //Hello world -> Hello만 받음
        String greetingMsgL = sc.nextLine(); //Hello world -> 전체받음

        System.out.print("나이 입력 : ");
        int age = sc.nextInt();

        System.out.print("키 입력 : ");
        double height = sc.nextDouble();

        System.out.println("입력하신 인사말 -> " + greetingMsg);
        System.out.println("입력하신 나이 -> " + age);
        System.out.println("입력하신 키 -> " + height);
    }

    public void testScannerExample1() {
        Scanner sc = new Scanner(System.in);
        //사용자에게 입력받기 -> 이름, 학교, 학년, 반

        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        System.out.print("학교 입력 : ");
        String school = sc.nextLine();

        System.out.print("학년 입력 : ");
        int grade = sc.nextInt();

        System.out.print("반 입력 : ");
        int group = sc.nextInt();

        System.out.println("입력하신 이름 -> " + name);
        System.out.println("입력하신 학교 -> " + school);
        System.out.println("입력하신 학년 -> " + grade);
        System.out.println("입력하신 반 -> " + group);
    }

    public void testWarningCase() {
        Scanner sc = new Scanner(System.in);

        System.out.println("주소 입력 : ");
        String address = sc.nextLine(); //nextLine()을 제외한 다른 메서드는 하나의 token만을 받음

        System.out.println("나이 입력 : ");
        int age = sc.nextInt();
        //InputMismatch예외


    }

    public void testWarningCase2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 입력 : ");
        String name = sc.nextLine();

        System.out.println("나이 입력 : ");
        int age = sc.nextInt();

        sc.nextInt();

        System.out.println("주소 입력 : ");
        String address = sc.nextLine();
        ;

        System.out.println(age + "살" + name + "님은" + address + "에 삽ㄴ디다");
        /**
         * 1. 이름 입력
         * 2. 이름 읽기 -> 개행제거
         * 3. 나이 입력
         * 4. 나이 읽기 -> 개행 제거 X (buffer에 개행이 남아있음)
         * 5. 주소 입력 -> 버퍼에 나이 개행이 남아있음
         * 6. 주소 읽기 불가
         *
         *
         * ## 해결 방법
         * nextLine() ->  nextLine()외 나머지 : 문제 없음
         * nextLine 외 나머지 -> nextLine() : 읽기 불가
         *
         */
    }

    public void testWarningCase3() {
        Scanner sc = new Scanner(System.in);
        /**
         * ## 문자형으로 값 입력받기
         * scanner는 char형 변환 메서드 x
         * 문자열로 입력받기 -> 인덱스 분리하여 저장
         */


//        String fruit = "apple";
//        char ch = sc.next().charAt(0);
//        System.out.println(ch);

        System.out.println("성별(M/F) 입력 : ");
        char gender = sc.next().charAt(0);
    }

    public void testScannerExample4() {
        Scanner sc = new Scanner(System.in);
        /**
         * 실습
         * 사용자에게 등록할 상품 입력받기
         * 상품, 브랜드, 가격, 제조국가, 할인율, 등급
         */

        System.out.print("상품 입력 : ");
        String name = sc.nextLine();

        System.out.print("브랜드 입력 : ");
        String brand = sc.nextLine();

        System.out.print("가격 입력 : ");
        int price = sc.nextInt();
        sc.nextLine(); //FIXME

        System.out.print("제조국가 입력 : ");
        String manufacturingCountry = sc.nextLine();

        System.out.print("할인율 입력 : ");
        double discountRate = sc.nextDouble();

        System.out.print("등급(A~D) 입력 : "); //FIXME
        char rating = sc.next().charAt(0);

        System.out.printf("브랜드가 %s인 상품 %s는 %s에서 생산되며 가격은 %d이고 할인은 %d%%입니다. 등급은 %c입니다.",
                brand, name, manufacturingCountry, price, (int) (discountRate * 100), rating);
    }

}
