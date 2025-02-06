package com.kyungbae.practice;

public class PracApplication5 { // class start
    /*
    임의의 정수 한 개를 선언하고 해당 정수값이 13세 이하이면 “어린이”,
    13세 초과 19세 이하이면 “청소년”, 19세 초과이면 “성인”이 출력 될 수 있도록
    작성하시오.
        ex) 18일 경우 : 청소년
     */
    public static void main(String[] args) { // main start

        int age = 13;

        String result = (age <= 13)
                        ? "어린이"
                        : ((age > 13 && age <=19)
                        ? "청소년"
                        : "성인");

        System.out.println(result);

    } // main end

} // class end
