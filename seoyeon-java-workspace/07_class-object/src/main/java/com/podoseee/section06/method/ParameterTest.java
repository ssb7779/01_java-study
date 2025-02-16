package com.podoseee.section06.method;

import com.podoseee.section04.dto.UserDTO;

import java.util.Arrays;

public class ParameterTest {

    /*
        ## 매개변수로 작성 가능한 자료형 ##
        1. 기본 자료형
        2. 기본 자료형 배열
        3. 클래스 자료형
        4. 클래스 자료형 배열
        5. 가변인자
     */

    public void testPrimitiveTypeParam(int num){
        System.out.println("매개변수로 전달된 값: " + num);
    }

    public void testArrayTypeParam(int arr[]){ // int[] arr = iArr;
        // 배열의 주소가 전달됨 (얕은복사)
        System.out.println("매개변수로 전달된 값: " + arr);
        System.out.println("매개변수로 전달된 배열 요소 : " + Arrays.toString(arr));

        arr[0] = 100;
    }

    public void testClassTypeParam(UserDTO u){ // UserDTO u = user; (얕은복사, 주소값전달)
        System.out.println("매개변수로 전달된 값: " + u);
        System.out.println("매개변수로 전달된 인스턴스 정보: " + u.getInformation());

        // 값 변경
        u.setPwd("*****");
    }
/*
    public void testVariableArgsParam(int num1){}
    public void testVariableArgsParam(int num1, int num2){}
    public void testVariableArgsParam(int num1, int num2, int num3){}
 */

    public void testVariableArgsParam(int... nums){
        // 가변길이배열인자 : 넘어오는 인자값들을 기록하고 있는 배열
        System.out.println("매개변수로 전달된 값: " + nums); // int[] 레퍼런스
        System.out.println("매개변수로 전달된 요소들: " + Arrays.toString(nums));
    }

    //public void testVariableArgsParam(String... hobby, String name){
    public void testVariableArgsParam(String name, String... hobby){ // 가변배열인자는 반드시 뒤쪽에
        System.out.println("이름: " + name);
        System.out.println("취미: " + Arrays.toString(hobby));
    }
}