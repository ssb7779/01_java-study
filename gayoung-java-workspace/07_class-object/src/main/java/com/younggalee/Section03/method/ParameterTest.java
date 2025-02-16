package com.younggalee.Section03.method;

import com.younggalee.section04.dto.UserDTO;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ParameterTest {
    /*
        ## 매개변수 작성가능한 자료형 ##
        1. 기본자료형
        2. 기본자료형 배열
        3. 클래스 자료형
        4. 클래스 자료형 배열
        5. 가변인자
     */
    public void testPrimitiveTypeParam(int num){
        System.out.println("매개변수로 전달됨" + num);
    }

    public void testArrayTypeParam(int[] numArr){
        //배열의 주소가 전달됨 (얕은복사)
        System.out.println("배열로 전달됨" + Arrays.toString(numArr));
        System.out.println(numArr);
    }

    public void testClassTypeParam(UserDTO u){ // 주소가 전달됨 (얕은복사)
        System.out.println("매개변수로 전달된 값: " + u);
        System.out.println("매개변수로 전달된 인스턴스 정보: " + u.getInformation());
        // 이런 식으로 가저오는 상황이 있으니 기본으로 다 작성해놓아야하는 듯
        u.setPwd("****"); // 값 변경
    }

    //가변길이배열인자 : 넘어오는 인자값들을 기록하고 있는 배열 ********************************************************
    public void testVariableArgsParam(int ... nums){ // 배열로 처리. 좋다.
        System.out.println(nums);//***************
        System.out.println(Arrays.toString(nums));
    }

    public void testVariableArgsParam(String name, String ... hobby) {
        // 가변배열은 앞에쓰면 안됨. 무조건 맨 뒤에 써줘야함. 그래야 나머지 다 들어감. (파이썬 동일)
        System.out.println(name);
        System.out.println(Arrays.toString(hobby));
    }
}
