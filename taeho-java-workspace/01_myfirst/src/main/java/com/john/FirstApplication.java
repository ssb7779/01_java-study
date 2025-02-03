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
