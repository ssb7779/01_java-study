package com.sotogito.section6.method;

import com.sotogito.section4.dto.UserDTO;

import java.util.Arrays;

public class ParameterTest {
    /**
     * ## 매개변수로 작성 가능한 자료형
     * 1. 기본 자료형
     * 2. 기본 자료형 배열
     * 3. 클래스 자료형
     * 4. 클래스 자료형 배열
     * 5. 가변인자
     */

    public void testPrimitiveTypeParam(int num) {
        System.out.println("매개변수로 전달된 값 : " + num);
    }

    public void testArrayTypePAram(int[] arr) {
        //배열의 주소가 전달 - 얕은복사
        arr[0] = 100; //동일 객체, 요소값 변경됨
        arr = new int[]{123}; //메서드 내에서만 변경 적용
        System.out.println("매개변수로 전달된 값" + arr);
        System.out.println("매개변수로 전달된 배열 요소" + Arrays.toString(arr));
    }

    public void testClassTypeParam(UserDTO userDTO) { //얕은복사 -주소값 전달
        System.out.println("매개변수로 전달된 값" + userDTO);
        System.out.println("매개변수로 전달된 인스턴스 정보" + userDTO.getInfo());

        userDTO.setPwd("wegewhyuliukjhyefdrtsilkuhjysedafrt");
    }

    // 가변길이배열인자 : 넘어오는 인자값들을 기록하고 있는 배열
    public void testVariableArgsParam(int... nums) {
        System.out.println("전달 값" + nums);
        System.out.println("요소값" + Arrays.toString(nums));
    }

    //    public void testVariableArgsParam(String...hobby, String name)
    //가변인자는 기본적으로 파라미터 뒤에 작성한다.- 만약 두개를 넘겼을 때 어디까지가 가변인자인지 판단이 불가하기 때문
    public void testVariableArgsParam(String name, String... hobby) {
        System.out.println("이름 : " + name);
        System.out.println("취미 : " + Arrays.toString(hobby));
    }

}
