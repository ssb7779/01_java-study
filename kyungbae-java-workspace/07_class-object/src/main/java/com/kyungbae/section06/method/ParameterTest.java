package com.kyungbae.section06.method;

import com.kyungbae.section04.dto.UserDTO;

import java.util.Arrays;

public class ParameterTest {

    /*
        Parameter variable로 작성 가능한 data type(자료형)
        1. Primitive type (기본 자료형)
        2. Primitive type array (기본 자료형 배열)
        3. Class type (클래스 자료형)
        4. Class type Array (클래스 자료형 배열)
        5. Variable-length Arguments (varargs, 가변인자)
     */

    // Primitive type
    public void testPrimitiveTypeParam(int num) {
        System.out.println("매개변수로 전달된 값: " + num);
    }

    // Primitive type Array
    public void testArrayTypeParam(int[] arr) { // int[] arr = iArr; == shallow copy
        // 배열의 주소가 전달됨 (shallow copy)
        System.out.println("매개변수로 전달된 값: " + arr.hashCode());
        System.out.println("매개변수로 전달된 배열 요소: " + Arrays.toString(arr));

        arr[0] = 100;

    }

    // class type
    public void testClassTypeParam(UserDTO u) { // UserDTO u = user; shallow copy (주소값전달)
        System.out.println("매개변수로 전달된 값 : " + u);
        System.out.println("매개변수로 전달된 정보 : " + u.getInformation());

        // 값 변경
        u.setPwd("*****");

    }

    public void testVariableArgsParam(int... nums) { // ... => 같은 타입의 다수 데이터 입력 가능
        // Variable-length Argument (varargs 가변길이배열인자) : 넘어오는 인자값들을 기록하고 있는 배열
            System.out.println("매개변수로 전달된 값: " + nums); // int[] 래퍼런스
            System.out.println("매개변수로 전달된 요소들: " + Arrays.toString(nums));
        }

//    public void testVariableArgsParam(String... hobby, String name) {}
    public void testVariableArgsParam(String name, String... hobby) { // varargs 는 항상 마지막에 적어야한다.
        System.out.println("이름: " + name);
        System.out.println("취미: " + Arrays.toString(hobby));
    }


    } // class end
