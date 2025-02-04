/**
 * documentation comment (문서주석)
 * 작성자, 작성일자, 설명 등을 API 문서로 제공하기 위한 주석
 * @author gayoung
 * @version 1.0
 * 문서관련주석
 */

package com.younggalee; //패키지 선언부(위치정보)
//클래스 역할에 맞춰서 패키지 만들고 그 안에 클래스 만들기 depth주의

public class FirstApplication { //클래스명과 파일명은 일치해야함  //class start
    // 메소드 == 기능
    // 기능별로 메소드 작성

    public void abc(){// (일반) 메소드  //abc method start

    } //abc method end

    public static void main(String[] args) { //실행용 메소드
        //java application 실행시 최초로 실행되는 메소드
        //안에 있는 소스코드가 자동으로 구동됨

        /*
        ## 메인 메소드 ##

         */


        System.out.println(1);
        System.out.print("한글\n");
        System.out.println("\"Hello\" \\Wo\trld"); //"Hello" \Wo	rld

        //Shift + F10 : Run
        System.out.printf("안녕하세요 %s에 오신걸 환영합니다. %d월 %d일까지 잘해봐요", "SSG", 7, 29); //공간부여
    }

} //class end
