/**
 * documentation comment (문서주석)
 * 작성자, 작성일자, 설명 등을 API 문서로 제공하기 위한 주석
 * @author gayoung
 * @version 1.0
 * 문서관련주석 (Javadoc)
 */

package com.younggalee; //패키지 선언부(위치정보)
//클래스 역할에 맞춰서 패키지 만들고 그 안에 클래스 만들기 depth 주의

public class FirstApplication { //클래스명과 파일명은 일치해야함  //class start
    // 메소드 == 기능
    // 기능별로 메소드 작성

    public void abc(){// (일반) 메소드  //abc method start

    } //abc method end

    public static void main(String[] args) { //실행용 메소드
        //java application 실행시 최초로 실행되는 메소드
        //안에 있는 소스코드가 자동으로 구동됨

        System.out.println(1);
        System.out.print("한글\n");
        System.out.println("\"Hello\" \\Wo\trld"); //"Hello" \Wo	rld

        //Shift + F10 : Run
        System.out.printf("안녕하세요 %s에 오신걸 환영합니다. %d월 %d일까지 잘해봐요", "SSG", 7, 29); //공간부여
    }

} //class end

/*
    ## 패키지 ##
    1. 비슷한 역할을 하는 클래스들의 보관함 (폴더같은)
    2. 기본 패키지에 클래스 만드는 건 권장하지 않음.
       ㄴ 많은 클래스들을 기본 패키지 안에 두면 관리 및 유지보수 불리
       ㄴ 기본 패키지 안에 있는 클래스는 다른 패키지에서 사용불가 **
    3. 패키지 생성시 세단계 이상으로 만드는 것을 권장
        - 주로 도메인의 역순으로 1, 2레벨 작성
          (도메인의 고유성이 중복 방지기능을 함)
        - 어떤 회사에서 제작된건지 쉽게 파악 가능
          (ex  com.회사명.어플리케이션명.서비스명)
 */















