package com.jmk;
/* multi line comment
    (여러줄 주석)
 */

/**
 * (문서 주석)
 * 작성자, 작성일자, 설명등을 API 문서로 제공하기 위한 주석
 * @author jominkook
 * @version  01
 */
public class FirstApplication {
    public void abc() {
        //메소드함수1

    }

    public void def() {
        //메소드함수2
    }
    /*
        ##메인(main)메소드##
        1. java Application 실행시 최초로 실행되는 메소드
        2. 즉 , 프로그램의 시작점
        3. 실행용 메소드라고도 함
        4. 작성형식
            public static void main(String[] args) { }
     */
    public static void main(String[] args) {
        /*
            ##출력문
            1)System.out.println("값") 값 출력후 자동으로 줄바꿈 처리
            2)System.out.print("값") 값 출력후 자동으로 줄바꿈 처리 X
            3)System.out.printf("출력형식", 값,...) 지정한 형식대로 출력후 자동으로 줄바꿈 처리
        */
        System.out.println(1);
        System.out.println(2);
        System.out.println(3);
        System.out.print('A');
        System.out.print("B\nCD\n");
        System.out.print("\"Hello\" \\Wo\trld\n");

        //안녕하세요 xxx에 오신걸 환영합니다! x월 x일까지 잘해봐요!
        System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일까지 잘해봐요","신세계", 2, 2);

    } //class end

    /*
        ##패키지 Package ##
        1. 비슷한 역할을 하는 클래스들의 보관함(폴더같은)
        2. 기본패키지에 클래스 만드는건 권장하지 않음
            L 많은 클래스들이 한 기본 패키지안에 두개 되면 관리 불편, 유지보수 불편
        3. 패키지 생성시 세단계 이상으로 만드는걸 권장
            L 주로 도메인의 역순으로 1, 2레벨 작성
            L 어떤 회사에서 제작된건지 쉽게 파악 가능
            ex) com.회사명.애플리케이션명
     */

}
