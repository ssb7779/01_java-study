package com.sotogito;


public class FirstApplication { //class start

    /**
     * 메인 메서드
     * 1. 최초 실행 메서드 = 시작점, 실행용
     * @param args(수정 가능)
     */
    public static void main(String[] args) {
        System.out.println(1); // 줄바꿈
        System.out.println(2);
        System.out.print('A');
        System.out.print("\n");
        System.out.println("\"awef\"");

        System.out.printf("안녕하세요 %s에 오신걸 환영합니다! %d월 %d일까지 잘해봐요,", "수키vl", 2, 3);
    }

    public void abc() {

    }

    public void def() {

    }

} //class end

/**
 * 패키지
 * 1. 비슷한 클래스 보관
 * 2. 기본 패키지에 클래스 만드는 것 권장하지 않음
 * - 관리, 유지보수 불편
 * - 기본 패키지 안의 클래스는 다른 패키지에서 사용 불가
 * 3. 패키지 생성시 3단계 -> com.회사명.애플리케이션명
 */
