   package com.jun;

   // single line comment (한 줄 주석)

    /*
  multi line comment
  (여러 줄 주석)
       *프로젝트
          ㄴ패키지1
              ㄴ 패키지1_1
                  ㄴ 클래스1(.java) => 소스코드 작업
                  ㄴ 클래스2(.java) => 소스코드 작업
              ㄴ 패키지1_2
           ㄴ 패키지2
              ㄴ 패키지2_1


     *{}

     *클래스
     public class 클래스명{

          // 메소드 == 기능
          // 기능별로 메소드 작성

          A 기능의 메소드1 {
              소스코드
              소스코드
          }


          B 기능의 메소드2 {
              소스코드
              소스코드
          }


          실행용 메소드(++ main 메소드){
              소스코드
              소스코드
          }


    */

   /**
    *  documentation comment
    *  (문서 주석)
    *  작성자, 작성일자, 설명 등을 API 문서로 제공하기 위한 주석
    *
    * @author junhee
    * @version 1.0
   */

   public class FirstApplication { // class start

        public void abc() { // abc method start
            // ~~~
            // ~~~
        } // abc method end

        public void def() {

        }

        /*
           ## 메인(main)메소드 ##
           1. java Application 실행시 최초로 실행되는 메소드
           2. 즉, 프로그램의 시작점
           3. 실행용 메소드라고도 함
           4. 작성형식
              public static void main(String[] args) { }
         */
        public static void main(String[] args) {
            /*
               ## 출력문 ##
               1. 특정 값을 화면(콘솔)에 출력하고자 할 떄 작성하는 명령문
               2. 종류
                  1) System.out.println( 값 ) : 값 출력 후 자동으로 줄바꿈 처리
                  2) System.out.print( 값 ) : 값 출력 후 줄바꿈 처리 x
                  3) System.out.printf( "출력 형식", 값, 값, ...) : 지정한 형식대로 값들이 출력됨 (줄바꿈 처리 x)
              */

            System.out.println(1);
            System.out.println(2);
            System.out.print('A');
            System.out.print("B\nCD\n");
            System.out.println("\"Hello\" \\Wo\trld");

            // 안녕하세요 xxx에 오신걸 환영합니다! x월 x일까지 잘해봐요!
            System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일 까지 잘해봐요!", "SSG", 7, 29);



        }
} // calss end
