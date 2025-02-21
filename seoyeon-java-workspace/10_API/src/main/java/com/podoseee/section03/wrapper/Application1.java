package com.podoseee.section03.wrapper;

public class Application1 {
    public static void main(String[] args) {
        /*
            ## Wrapper ##
         */

        // 1. Boxing : 기본자료형 => Wrapper 클래스자료형 (인스턴스화)
        int intValue1 = 20;
        int intValue2 = 30;

        //System.out.println(intValue1.hashCode());;
        //System.out.println(intValue1.equals(intValue2));
        //System.out.println(intValue1.compareTo(intValue2));

        Integer boxingNumber = new Integer(intValue1); // 1_1) 객체 생성 방식

        Integer boxingNumber1 = Integer.valueOf(intValue1); // 1_2) static 메소드 사용 방식
        Integer boxingNumber2 = intValue2;                  // 1_3) AutoBoxing (JDK 1.5부터 가능)

        System.out.println(boxingNumber);
        System.out.println(boxingNumber1);
        System.out.println(boxingNumber2);

        System.out.println(boxingNumber1.equals(boxingNumber2));
        System.out.println(boxingNumber1.compareTo(boxingNumber2));

        // 2. UnBoxing : Wrapper클래스자료형 => 기본자료형
        int unBoxingNumber1 = boxingNumber1.intValue(); // 2_1) xxxValue() 사용 방식
        int unBoxingNumber2 = boxingNumber2;            // 2_2) AutoUnBoxing (JDK 1.5부터 가능)

        System.out.println(unBoxingNumber1);
        System.out.println(unBoxingNumber2);

    }
}
