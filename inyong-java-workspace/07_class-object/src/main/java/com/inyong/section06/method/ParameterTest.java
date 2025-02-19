package com.inyong.section06.method;

import com.inyong.section04.dto.UserDTO;

import java.util.Arrays;

public class ParameterTest {

    public void testPrimitiveTypeParam(int num) {
        System.out.println("매개변수로 전달 . 값" + num);
    }

    public void testArrayTypeParam(int[] arr){
        System.out.println("매개변수로 전달된 배열 요소: " + Arrays.toString(arr));

        arr[0] = 100;

    }

    public void testClassTypeParam(UserDTO u){
        System.out.println("매개변수로 전달 . 값: " + u.getInformation());

    }

    public void testVariableArgsParam(int... nums){
        //가변길이배열인자 : 넘어오는 인자값들을 기록하고 있는 배열
        System.out.println("매개변수로 전달된 값 " + nums);
        System.out.println(Arrays.toString(nums));

    }
    public void testVariableArgsParam(String name, String... hobby){

        System.out.println("매개변수로 전달된 값 " + name);
        System.out.println(Arrays.toString(hobby));
    }


}
