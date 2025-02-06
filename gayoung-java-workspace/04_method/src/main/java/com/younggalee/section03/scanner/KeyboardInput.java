package com.younggalee.section03.scanner;
import java.util.Scanner;


public class KeyboardInput {
// 값을 입력 받는 과정은 다음과 같다. 입력 데이터는 입력버퍼로 우선 들어온다 이후  변수선언을 통해 메모리에 기록 할 수 있었는데
//키보드로 데이터를 입력 받으면 해당 데이터는 우선 입력 버퍼로 들어오게 된다 이후 이 버퍼에서 데이터를 꺼내 변수선언을 통하여 메모리에 기록될 수 있게 된다.
    /*
        ## Scanner ## (java.utill.Scanner)
        1. 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
        2. 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음
        3. 해당 클래스는 java.util에서 제공되고 있다.
        4. 주요메소드
        next() : 입력된 갑슬 String 형으로 반환함 (띄어쓰기 불가능)
               : 공백 이전까지의 한 토큰만 입력받음
        nextLine() : 입력된 값을 String형으로 반환함 (line 전체)
                   : 개행 이전까지의 값을 입력받음
                   : 그 후, '\n' 제거됨 (그러나 나머지 제거 안됨. 따라서 nextLine 사용 이후, 입력시 주의) ***
                     ㄴ 따라서 nextline 이외의 입력메소드 사용시, nextLine();을 붙여 개행을 지운다.
                     ㄴ ex. nextInt - nextLine 한 세트로
        nextInt() : 입력된 값을 Int형으로 반환함
        nextdouble() : 입력된 값을 double형으로 반환함
        4.사용방법
            1) Scanner 객체 생성
            2) 메소드 호출
     */
    // 기본예제메소드 생성
    public void testBasicScanner(){
        Scanner sc = new Scanner(System.in);  // System.in (고정): 입력받은 값을 바이트단위로 읽어들이겠다는 의미
        System.out.print("인사말 입력: ");
        String greetingMsg = sc.nextLine();

        System.out.print("나이입력:");
        int age = sc.nextInt();

        System.out.print("키 입력:");
        double height = sc.nextDouble();

        System.out.println(greetingMsg);
        System.out.println(age);
        System.out.println(height);
        System.out.print("");
    }

    public void testScannerExample1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("정보를 입력하세요.");
        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("학교 : ");
        String school = sc.nextLine();

        System.out.print("학년 : ");
        int grade = sc.nextInt();

        System.out.println("반 : ");
        int classNum = sc.nextInt();

        //마우스커서 올리면 return형태 확인 가능*******************

        System.out.println("사용자 정보 출력");
        System.out.println(name + " | " + school + " | " + grade + " | " + classNum);
    // 사용자한테 이름, 학교, 학년, 반 순서로 정보를 입력받아 출력
    }

    public void testWarningCase1(){

        /*
         ## Scanner 사용시 유의사항 ##
         nextLine()을 제외한 메소드(next/nextint/n~double)은 공백 기준으로 토큰들을 분리해서 하나의 토큰을 가져옴.
         따라서 여러단어 입력가능성이 있을 경우 nextLine()으로 입력받기
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("주소입력 : ");
        String address = sc.nextLine();

        System.out.print("나이입력 : ");
        int age = sc.nextInt();

        System.out.println(address);
        System.out.println(age);
    }

//    public void testWarningCase1(){
//        /*
//        nextLine()은 개행을 토큰 구분자로 인식함
//        그리고 버퍼 내의 개행을 감지하여 개행이 존재할 경우 입력되었다고 간주해서 값을 읽어들임
//        nextLine()을 제외한 메소드들은 토큰을 읽어들인 후 개행문자를 제거해저지 않음
//         */
//        Scanner sc = new Scanner(System.in);
//        sc.nextLine();
//        sc.nextInt(); // 개행문자안없어져서
//        sc.nextLine(); //실제 입력전에 컷
//
//    }

    public void testSpecialCase(){
        String fruit = "apple";
        System.out.println(fruit.charAt(3));
    }
    public void testScannerExample2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("등록할 상품에 대한 정보를 입력해주세요.");
        System.out.print("상품명 : ");
        String itemName = sc.nextLine();
        System.out.print("브랜드명 : ");
        String brandName = sc.nextLine();
        System.out.print("가격 : ");
        int price = sc.nextInt();
        sc.nextLine();
        System.out.print("제조국가 : ");
        String contry = sc.nextLine();
        System.out.print("할인율 : ");
        double discount = sc.nextDouble();
        sc.nextLine();
        System.out.print("등급 : ");
        char grade = sc.next().charAt(0);

        System.out.println("");
        System.out.println("입력된 상품정보입니다.");
        System.out.println(itemName + " | " + brandName + " | " + price + " | " + contry + " | " + discount + " | " + grade);
    }

}














