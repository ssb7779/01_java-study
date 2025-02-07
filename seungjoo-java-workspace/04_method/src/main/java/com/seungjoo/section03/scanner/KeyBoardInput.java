package com.seungjoo.section03.scanner;

import java.util.Scanner;

public class KeyBoardInput {

        /*
        ##Scanner## == java.util.Scanner ##
        1. 사용자로부터 입력되는 정수, 실수, 문자열을 처리하는 클래스
        2. 입력값이 담겨있는 버퍼로부터 메모리상으로 값을 읽어들일 수 있음.
        3. java.util에서 제공됨
        4. 주요 제공 메소드
            1)next() : 입력된 값을 String형으로 반환함(공백 이전까지의 한 토큰만 가져온다.)
            2)nextLine() : 입력된 값을 String형으로 반환함(개행 이전까지의 전체 토큰을 가져옴)
            3)nextInt() : 입력된 값을 int형으로 반환함
            4) nextDouble(): 입력된 값을 double형으로 반환함
        5. 사용방법
           1) Scanner 객체 생성
           2) 메소드 호출
         */


        public void testBasicScanner () {
            Scanner sc = new Scanner(System.in); //System.in : 입력받은 값을 바이트 단위로 읽어 들이겠다는 걸 의미
            System.out.print("인사말 입력: ");
            String greetingMsg = sc.nextLine();

            System.out.println("나이 입력:");
            int age = sc.nextInt();

            System.out.println("키 입력: ");
            double height = sc.nextDouble();



            System.out.println("입력하신 인사말은 " + greetingMsg + "입니다.");

            System.out.println("입력하신 나이는 " + age + "입니다.");
            System.out.println("입력하신 키는 " + height + "입니다.");

        }


        public void testScannerExample(){
            Scanner sc = new Scanner(System.in);


            /*
            실습.
            사용자에게 이름, 학교, 학년, 반 순서로 정보를 입력받아 출력해보기

             */
            String name = sc.nextLine();
            System.out.println("입력하신 이름은 : " + name + " 입니다.");
            String school = sc.nextLine();
            System.out.println("입력하신 학교는 : " + school + "입니다. ");
            int level = sc.nextInt();
            System.out.println("입력하신 학년은 : " + level + "학년 입니다. ");
            int ban = sc.nextInt();
            System.out.println("입력하신 반은 : " + ban + "입니다.");
        }

        public void testWarningCase(){
            Scanner sc = new Scanner(System.in);
            System.out.println("주소 입력:");


            String address = sc.next();

            System.out.println("나이 입력:");
            int age = sc.nextInt();

        }
        /*
               ##Scanner 사용시 유의 사항1
               nextLine()을 제외한 메소드(next(), nextInt(), nextDouble()...)들은 공백 기준으로 토큰들을 분리해서 하나의 토큰을 가져옴


               ##해결방법
               여러 단어가 입력될 여지가 있을 경우 nextLine()으로 문자열을 입력받자.
         */



        public void testWarningCase1(){
            Scanner sc = new Scanner(System.in);

            System.out.println("주소 입력:"); //"서울시 강서구" 입력
            String address = sc.next();  //"서울시" 토큰만 읽어들여지고 "강서구" 토큰은 버퍼에 남아있는 상태

            System.out.println("나이 입력");
            int age = sc.nextInt(); //입력도 하기 전에 버퍼에 남아있는 "강서구" 토큰이 곧바로 읽어들여짐
            //int 자료형에 부적합한 문자열이므로 타입불일치 예외 발생
        }

        public void testWarningCase2(){
            /*
            ##scanner 사용시 유의 사항2
            nextLine()dms rogod(enter,\n)을 토큰 구분자로 인식함
            그리고 버퍼 내에 개행을 감지하여 개행이 존재할 경우 입력되었다 간주해서 값을 읽어들임
            nextLine()을 제외한 메서드들은 토큰을 읽어들인 후 개행문자를 제거해주지 않음


             */
            Scanner sc = new Scanner(System.in);
            System.out.println("이름:"); //"강개똥" 입력
            String name = sc.nextLine(); //"강개똥" 읽어들여진 후 개행 제거됨

            System.out.println("나이:"); //12 입력
            int age = sc.nextInt(); //12 읽어들여진 후 개행 제거 안됨(버퍼에 개행이 남아있는 상태)

            sc.nextLine();

            System.out.println("주소:"); //입력도 하기전에
            String address = sc.nextLine(); //버퍼에 개행이 남아있어 입력되었다고 간주되어 곧바로 읽어들여짐

            System.out.println(age + "살 " + name + "님은 " + address + "에 삽니다.");

            /*

            ##해결 방법
             nextLine()을 제외한 메서드들이 실행된 후 nextLine()이 오게될 경우 발생
             버퍼에 남아잇는 개행을 제거하고 nextLine()이 수행될 수 있도록
             */







        }

        public void testSpecialCase(){
            /*\
            ##문자형으로 값 입력하기
            Scanner 에서는 char형으로 값을 반환하는 메소드를 제공하지 않음
            문자와 밀접하게 연관있는 문자열로 값을 읽어들인 후
            원하는 순번째의 문자를 반환받아 기록하면 됨

            ex) "apple"  => 문자열(String)
             */

//            String fruit = "apple";
//            char ch = fruit.charAt(4);
//            System.out.println(ch);
//            Scanner sc = new Scanner(System.in);

        Scanner sc = new Scanner(System.in);
        System.out.println("성별 입력:");
        char gender = sc.nextLine().charAt(0); //"Male".charAt(0) => 'M'

            System.out.println(gender);



        }
        public void testScannerExample2(){
            /*
            실습.
            사용자에게 등록할 상품에 대한 정보 입력받기
            상품명, 브랜드명, 가격, 제조국가, 할인율, 등급(A~D) 순으로 입력받은 후 출력

             */
            Scanner sc = new Scanner(System.in);
            System.out.println("상품명 입력:");
            String item = sc.nextLine();
            System.out.println("브랜드명 입력");
            String brand = sc.nextLine();
            System.out.println("가격 입력");
            int price = sc.nextInt();
            sc.nextLine();
            System.out.println("제조 국가 입력");
            String description = sc.nextLine();
            System.out.println("할인율 입력:");
            double weight = sc.nextDouble();
            sc.nextLine();
            System.out.println("등급 입력:");
            char grade = sc.nextLine().charAt(0);

            System.out.printf("상품명 %s, 브랜드명 %s 가격 %d, 제조 국가 %s, 할인율 %f, 등급 %c" , item, brand, price,description,weight, grade);











        }





    }

