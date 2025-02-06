package com.kyungbae.section06.ternary;

public class Application1 { // class start

    public static void main(String[] args) { // main start

        /*
            # 삼항 연산자
            [표현법]
            조건식 ? (조건식이 true 일 경우)반환값 : (조건식이 false 일 경우)반환값

         */


//        특정 정수값이 양수인지 아닌지 판별
//        정수값이 양수일 경우 "양수이다", 아닐 경우 "양수가 아니다"

        int num = 5;

//        String result = (num < 0) ? "양수가 아니다" : "양수이다"
        String result = num > 0 ? "양수이다" : "양수가 아니다"; // 0 처리는 나중에
        System.out.println(result);


    } // main end

} // class end
