package com.john.section06.method;

import com.john.section04.dto.UserDTO;

import java.util.Arrays;

/*
    ## 매개변수로 작성 가능한 자료형
    1. 기본 자료형
    2. 기본 자료형 배열
    3. 클래스 자료형
    4. 클래스 자료형 배열
    5. 가변인자
*/
public class ParameterTest {

    public void testPrimitiveTypeParameter(int num) {
        System.out.println("매개변수: " + num);
    }

    public void testArrayTypeParameter(int[] intArr) {
        System.out.println("매개변수로 전달된 값: " + intArr);
        System.out.println("매개변수 전달된 배열 요소" + Arrays.toString(intArr));

        intArr[0] = 100;
    }

    // 얕은 복사
    public void testClassTypeParameter(UserDTO userDTO) {
        System.out.println("매개변수로 전달된 값: " + userDTO);
        System.out.println("매개변수로 전달된 인스턴스 정보" + userDTO.getInfomation());
        userDTO.setPwd("&&");
    }

//    public void testVariableArgsParameter(int num1) {}
//    public void testVariableArgsParameter(int num1, int num2) {}
//    public void testVariableArgsParameter(int num1, int num2, int num3) {}
    public void testVariableArgsParameter(int... nums){
        System.out.println("매개변수로 전달된 값: " + nums);
        System.out.println("매개변수로 전달된 요소들: " + Arrays.toString(nums));
    }

    public void testVariableArgsParameter(String name, String... hobby){
        System.out.println("이름: " + name);
        System.out.println("취미: " + Arrays.toString(hobby));
    }
}
