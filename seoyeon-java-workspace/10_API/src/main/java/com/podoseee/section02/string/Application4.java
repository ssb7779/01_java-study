package com.podoseee.section02.string;

public class Application4 {
    public static void main(String[] args) {

        /*
            문자열을 관리하는 클래스 3가지

            ## java.lang.String ##

            ## java.lang.StringBuilder|StringBuffer ##

            ##
         */

        String str = "반가워!";
        System.out.println(System.identityHashCode(str));

        str += "난 String이야!"; // str = str + "난 String이야!";
        System.out.println(System.identityHashCode(str));
        // 주소값이 달라짐 == 새로운 곳을 참조 == 기존에 참조하던건 GC가 언젠간 지워줌

        System.out.println("=================================================");

        // StringBuilder 객체 생성시 처음에 16개의 문자들을 기록할 수 있는 버퍼가 내부적으로 생성
        StringBuilder sb = new StringBuilder("반가워!"); // 16 + 4글자

        System.out.println("sb: "+ sb/*.toString()*/);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 16+4 == 20
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("=====================");

        // * append(String) : 기존에 문자열 뒤에 인자로 전달된 새 문자열이 추가됨, 현재의 StringBuilder 주소값 반환
        sb.append("안녕!");

        System.out.println("변경후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 16+4 == 20
        System.out.println("문자열의 길이: " + sb.length());
        // 주소값 변동 없음 == 기존에 참조하던 곳에서 변경 발생 == 가변클래스

        System.out.println("===================");
        
        sb.append("다들 조금만 힘내세요!!!"); // 14글자

        System.out.println("변경후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity()); // 16+4 == 20 // 기존의 수용량 * 2 + 2
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("===================");
        
        // * delete(int, int) : 기존의 문자열로부터 start <=  < end 범위의 문자열을 제거함, 현재 StringBuilder 주소값 반환
        sb.delete(2, 5); // 워   녕

        System.out.println("변경후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("==================");

        // * insert(int, String) : 인자로 전달된 인덱스 위치에 전달된 문자열 추가됨, 현재 StringBuilder 주소값 반환
        sb.insert(1, "ㅎㅎㅎ");

        System.out.println("변경후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("==================");

        // * reverse() : 기존의 문자열을 역순으로 바꿔줌, 현재 StringBuilder 주소값 반환
        sb.reverse();

        System.out.println("변경후 sb: " + sb);
        System.out.println("주소값: " + System.identityHashCode(sb));
        System.out.println("수용량: " + sb.capacity());
        System.out.println("문자열의 길이: " + sb.length());

        System.out.println("==================");


    }

}
