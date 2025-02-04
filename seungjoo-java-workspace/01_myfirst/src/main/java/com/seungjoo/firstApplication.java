package com.seungjoo; //패키지 선언부
/* --> 이것만 작성하고 엔터치면 알아서 나머지 생김
여러 줄 주석
 */

/** 슬래시 별별 엔터하면 이렇게 생김 (문서 주석)
 * 작성자, 작성일자, 설명 등을 API 문서로 제공하기 위한 주석임.
 * @author seungjoo
 * @version 1.0
 * 
 */

public class firstApplication { //클래스 선언부,클래스명과 파일명은 일치해야함 class start
    
    public void abd(){ //abc method start

    } //abc method end

    /*
    ##메인 메소드란##
    1. 자바 어플리케이션 실행 시 최초로 실행되는 메서드
    2. 즉, 프로그램의 시작점
    3. 실행용 메소드라고도 함.
    4.작성 형식
        public static void main(String[] args){}
     */
    public static void main(String[] args){ //메인메서드
        System.out.println(1);
        System.out.println(2); //출력문: 특정 값을 화면(콘솔)에 출력하고자 할 떄 작성하는 명령문
        System.out.print('A'); //줄바꿈이 안됨.
        System.out.print("BCD\n"); //\n은 개행문자
        System.out.println("\"Hello\" \\ Wo\trld"); // \\은 \출력

        // 안녕하세요 xxx에 오신걸 환영합니다! x월 x일까지 잘해봐요!
        System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일까지 잘해봐요!", "SSG", 7,29);

        //System.out.printf("출력 형식", 값, 값, ..) : 지정한 형식대로 갑들이 출력됨(줄바꿈 처리 x)
    }
} //class end
