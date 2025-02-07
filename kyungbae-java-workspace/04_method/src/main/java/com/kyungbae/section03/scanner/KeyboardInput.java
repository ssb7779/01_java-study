package com.kyungbae.section03.scanner;

import java.util.Scanner;

public class KeyboardInput {

    /*
        # Scanner == java.util.Scanner
        1. 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
        2. 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음
        3. java.util 에서 제공됨
        4. 주요 제공 메소드
            1) next()       : 입력된 값을 String형으로 반환함 (공백 기준으로 1 Token 만 가져옴)
                                ex) hello world => hello
            2) nextLine()   : 입력된 값을 String형으로 반환함 (개행(enter, \n) 이전까지의 전체 토큰)
                                ex) hello world => hello world
            3) nextInt()    : 입력된 값을 int형으로 반환함
            4) nextDouble() : 입력된 값을 double형으로 반환함
        5. 사용방법
            1) Scanner 객체 생성
            2) 메소드 호출

    */

    public void testBasicScanner() {

        Scanner sc = new Scanner(System.in);
        // System.in : 입력받은 값을 바이트 단위로 읽어 들이겠다는 의미

        System.out.print("이름 입력: ");
//        String greetingMsg = sc.next();
        String name = sc.nextLine(); // 여러 단어가 입력될 여지가 있을 경우 사용

        System.out.print("나이 입력:");
        int age = sc.nextInt();

        System.out.print("키 입력: ");
        double height = sc.nextDouble();


        System.out.println("'" + name + "'");
        System.out.println("나이: " + age);
        System.out.println("키: " + height + "cm");

    } // tBS end

    public void testScannerExample1() {
        Scanner sc = new Scanner(System.in);

    /*
        # 실습
        사용자에게 이름, 학교, 학년, 반 순서로 정보를 입력받아 출력
    */
        System.out.print("이름을 입력: ");
        String name = sc.nextLine();

        System.out.print("학교를 입력: ");
        String school = sc.nextLine();

        System.out.print("학년을 입력: ");
        int grade = sc.nextInt();

        System.out.print("반을 입력: ");
        int classroom = sc.nextInt();

        System.out.printf(
                "이름: %s\n학교: %s\n학년: %d\n반: %d\n ", name, school, grade, classroom
        );


    } // tSE end

    public void testWarningCase1() {

        /*
            # Scanner 사용시 유의사항 1
            nextLine()을 제외한 메소드 들은
            공백(space) 기준으로 토큰들을 분리해서 하나의 토큰을 가져옴
         */

        Scanner sc = new Scanner(System.in);

//        # Case1

        System.out.print("주소 입력: "); // "서울시 강서구" 입력
        String address = sc.next();      // "서울시" 토큰 읽어옴 / "강서구" 토큰은 버퍼에 남아있음

        System.out.print("나이 입력: "); //
        int age = sc.nextInt();          // 입력 전에 버퍼에 남아있는 "강서구" 토큰이 바로 들어옴
//        int 자료형에 부적합만 문자열이 자동으로 입력되어 타입 불일치 예외 (InputMismatchException) 발생

        System.out.println(address);
        System.out.println(age);

        /*
            # 해결방법
            여러단어가(공백포함) 입력될 여지가 있을 경우 nextLine()으로 문자열 입력 받자
         */

    } // tWC1 end

    public void testWarningCase2() {

        Scanner sc = new Scanner(System.in);

        /*
            # Scanner 사용시 유의사항 2
            nextLine()은 개행(enter, \n)을 토큰 구분자로 인식함
            그리고 버퍼 내에 개행을 감지하여 개행이 존재할 경우 입력되었다 간주하여 값을 읽어들임
            nextLine()을 제외한 메소드들은 토큰을 읽어들인 후 개행문자를 제거해주지 않음
         */

//        Case2

        System.out.print("이름: ");   // "이름" 입력
        String name = sc.nextLine();  // "이름" 읽어들여진 후 개행 제거

        System.out.print("나이: ");   // 12 입력
        int age = sc.nextInt();       // 12 읽어들인 후 개행 제거 안함 (버퍼에 개행이 남아있다)

        sc.nextLine();  // <== 버퍼 비우기

        System.out.print("주소: ");
        String address = sc.nextLine(); // 버퍼에 남아있는 개행이 실행되어 바로 읽어드려짐

        System.out.printf("%d살 %s님은 %s에 삽니다.", age, name, address);
//        결과)  **살 ***님은 에 삽니다 / 출력 <= 주소입력이 씹힘

        /*
            # 해결방법
            nextLine()을 제외한 메소드들이 실행된 후 nextLine()이 오게될 경우 발생
            nextLine()이 정상적으로 수행될 수 있도록 버퍼에 남아있는 개행을 제거
             << nextLine()을 넣어 버퍼 비우기
         */


    } // tWC2 end


    public void testSpecialCase() {

            /*
                # 문자형으로 값 입력받기
                Scanner 에서는 char형으로 값을 변환하는 메소드를 제공하지 않음
                문자와 밀접하게 연관있는 문자열로 값을 읽어들인 후
                원하는 순번(자바에서는 인덱스)쨰의 문자를 반환받아 기록하면 됨

                ex)         "apple"     => 문자열 (String)
                    'a' 'p' 'p' 'l' 'e' => 문자 (char)
                     0   1   2   3   4  => 인덱스 (위치)

                문자열.charAt(인덱스) => 해당 문자열의 해당 인덱스 자리의 문자 반환
             */

        /*
        String fruit = "apple";
        char ch = fruit.charAt(3);
        System.out.println(ch);
//        System.out.println(fruit.charAt(3)); // index 범위를 벗어나는 숫자가 들어가면 오류

         */

        Scanner sc = new Scanner(System.in);

        System.out.print("성별 입력 (m/f):");
        char gender = sc.nextLine().charAt(0); // 입력글의 첫자리 불러오기

        System.out.println(gender);


    } // tSC end

    public void testScannerExample2() {
        /*
            사용자에게 등록할 상품에 대한 정보 입력받기
            상품명, 브랜드명, 가격, 제조국가, 할인율, 등급 순으로 입력받고 출력하기
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("상품명: ");
        String product = sc.nextLine();

        System.out.print("브랜드 명: ");
        String brand = sc.nextLine();

        System.out.print("가격: ");
        int price = sc.nextInt();

        sc.nextLine();

        System.out.print("제조국가: ");
        String country = sc.nextLine();

        System.out.print("할인율: ");
        double saleRate = sc.nextDouble();

        sc.nextLine();

        System.out.print("등급(A~D) : ");
        char rate = sc.nextLine().charAt(0);

        System.out.printf(
                "\n%s 국가의 %s 브랜드 %s 상품의 가격은 %d원 이며 %c 등급이고, %.2f%%의 할인율로 등록되었습니다."
                , country, brand, product, price, rate, saleRate
        );


    } // tSE2

} // class end
