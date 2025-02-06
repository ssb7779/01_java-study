package com.minkook.section03.scanner;

import java.util.Scanner;

public class KeyboardInput {

        /*
    ## Scanner == java.util.Scanner ##
    1. 사용자로부터 입력되는 정수, 실수 ,문자열을 처리하는 클래스
    2. 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음
    3. java.util에서 제공됨
    4. 주요 제공 메소드
        1) next()                   : 입력된 값을 String형으로 반환 (공백 이전까지의 한 토큰만)
        2) nextLine()               : 입력된 값을 String형으로 반환 (개행 이전까지의 전체 토큰만)
        3) nextInt()                : 입력된 값을 int형으로 반환
        4) nextDouble()             : 입력된 값을 double형으로 반환
 */


    public void testBasicScanner() {
       Scanner scanner = new java.util.Scanner(System.in);

        System.out.print("인사말 입력: ");
//        String greetingMsg = scanner.next();
        String greetingMsg = scanner.nextLine(); //여러 단어가 있을 경우 사용


        System.out.print("나이 입력: ");
        int age = scanner.nextInt();

        System.out.print("키 입력: ");
        double height = scanner.nextDouble();

        System.out.println("입력하신 인사말은 " + greetingMsg + "입니다");
        System.out.println("입력하신 나이는 " + age + "입니다");
        System.out.println("입력하신 키는 " + height + "입니다");

    }

    public void testScannerExample1() {
        /*
            실습
            사용자에게 이름,학교,학년,반 순서대로 정보를 입력받아 출력

         */
        Scanner sc = new Scanner(System.in);

        System.out.print("입력받은 이름은:");
        String name = sc.nextLine();
//        System.out.println("이름은: " + name);

        System.out.print("입력받은 학교는:");
        String school = sc.nextLine();
//        System.out.println("학교는: " + school);

        System.out.print("입력받은 학년은:");
        int grade = sc.nextInt();
//        System.out.println("학년은: " + grade);

        System.out.print("입력받은 반은:");
        String cla = sc.next();
//        System.out.println(" 반: " + cla);

        System.out.printf("이름은: %s\n",name);
        System.out.printf("학교는: %s\n",school);
        System.out.printf("학년은: %s\n",grade);
        System.out.printf("반은 %s",cla);


    }

    public void testWarningCase1() {
        
        /*
                ## Scanner 사용시 유의사항 1 ##
                nextLine()을 제외한 메소드 (next(), nextInt(), nextDouble(),..)들은
                공백기준으로 토큰들을 분리해서 하나의 토큰을 가져옴
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("주소 입력: "); //"서울시 강서구" 입력
        String address = sc.next();     //"서울시" 토큰만 읽어들여지고 "강서구" 토큰은 버퍼에 남아있는 상태

        System.out.print("나이 입력: "); //입력도 하기 전에
        int age = sc.nextInt();         // 버퍼에 남아있는 "강서구" 토큰이 곧바로 읽어들여짐

        System.out.println(address);
        System.out.println(age);
        
        /*
            ## 해결방법 ##
                nextLine() 사용
         */
    }

    public void textWarningCase2() {
        /*
            ## Scanner 사용시 유의사항 2 ##
            nextLine()은 개행(enter,\n)을 토큰 구분자로 인식함
            그리고 버퍼 내에 개행을 감지하여 개행이 존재할 경우 입력되었다 간주해서 값을 읽어드림
            nextLine()을 제외한 메소드들은 토큰을 읽어들인 후 개행문자를 제거하지 않음
         */
        Scanner sc = new Scanner(System.in);



        System.out.print("이름: ");
        String name = sc.nextLine();

        System.out.print("나이: ");
        int age = sc.nextInt();
        sc.nextLine(); //해결방법 버퍼비우기
        System.out.print("주소: ");
        String address = sc.nextLine();

        System.out.println(age + "살 " + name + "님은 " + address + "에 삽니다.");

         /*
            ## 해결 방법 ##
            nextLine()을 제외한 메소드들이 실행후 nextLine()이 오게될 경우 발생

         */

    }
    public void testSpecialCase() {
        /*
            ## 문자형으로 값 입력받기 ##
            Scanner에서는 char형으로 값을 반환하는 메소드를 제공하지 않음
            문자와 밀접하게 연관있는 문자열로 값을 읽어들인 후
            원하는 순번째의 문자를 반환받아 기록하면됨
            
            문자열.charAt(인덱스) -> 해당 문자열의 해당 인덱스자리의 문자 반환
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("성별(M/F) 입력: ");
        char gender = sc.nextLine().charAt(0);
//        String genderStr = (gender == 'M' ? "남자" : "여자");
//        System.out.println("성별은: " + genderStr);
        System.out.print("성별은: "+ gender);

    }
    public void testScannerExample2() {
        /*
            실습.
            사용자에게 등록할 상품에 대한 정보 입력받기
            상품명(String) , 브랜드명(String), 가격(int), 제조국가(String),
            할인율(double), 등급(char)(A~D) 순으로 입력받은 후 출력
         */

        Scanner sc = new Scanner(System.in);

        System.out.print("상품명 입력: ");
        String itemName = sc.nextLine();

        System.out.print("브랜드명 입력: ");
        String brandName = sc.nextLine();

        System.out.print("가격 입력: ");
        int price = sc.nextInt();
        sc.nextLine();

        System.out.print("제조국가 입력: ");
        String description = sc.nextLine();

        System.out.print("할인율 입력: ");
        double percent = sc.nextDouble();
        sc.nextLine();

        System.out.print("등급 입력: ");
        char grade = sc.nextLine().charAt(0);

        System.out.println(itemName);
        System.out.println(brandName);
        System.out.println(price);
        System.out.println(description);
        System.out.println(percent);
        System.out.println(grade);




    }


}
