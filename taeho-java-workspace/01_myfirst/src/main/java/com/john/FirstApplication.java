package com.john;


// single line comment (단줄 주석)

/*
    여러줄 주석
*/

/*
    클래스
    public class [ClassName] {
        method A {

        }

        method B {

        }
    }

 */
/**
 * docs comment
 * 문서 주석
 * 작성자, 년도, 역할 등을 API로 제공
 *
 * @author
 *
 */
public class FirstApplication {

    // abc method start
    public void abc() {
        System.out.println("abc");
    }
    // abc method end

    /*
        ## main
        1. App 시작시 가장 먼저 실행되는 메서드
        2. psvm 구조가 변하면 안된다
     */
    public static void main(String[] args) {
        System.out.println(1);
        System.out.println(2);
        System.out.print('A');
        System.out.print("BC\n");
        System.out.println("\"Hello\" \\World");

        System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일 까지 잘해봐요", "신세계" ,1,2);
    }
}

/*  
    ## 패키지
    1. 패키지는 세단계 이상을 권장 (도메인 역순, com.[회사명].[App명])
    # 클래스를 기본 패키지에 두지 않는 이유
    1. 관리 및 유지보수 문제
    2. 기본패키지에 속한 클래스는 다른 패키지에서 사용불가
 */