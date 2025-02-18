package com.inyong.section06.method;

import com.inyong.section04.dto.UserDTO;
import com.inyong.section05.singleton.NonSingleton;

import java.util.Arrays;

public class Application {
    public static void main(String[] ars){
        /*
        # 매개 변수로 작성 가능한 자료형
        1. 기본 자료형
        2. 기본 자료형 배열
        3. 클래스 자료형
        4. 클래스 자료형 배열
        5. 가변 인자



         */
        ParameterTest pt = new ParameterTest();

        pt.testPrimitiveTypeParam(10);
        pt.testPrimitiveTypeParam(20);

        System.out.println(" ====================== ");

        int [] iArr = {1,2,3,4,5};
        System.out.println("전달할 배열:" + iArr);
        System.out.println("전달할 배열 요소: " + Arrays.toString(iArr));

        pt.testArrayTypeParam(iArr);
        System.out.println("메소드 종료 . 배열 요소 : " + Arrays.toString(iArr));

        System.out.println(" ======= ");
        UserDTO user = new UserDTO("user01", "pass01", "홍길동");


        pt.testClassTypeParam(user);
        // 매개 변수에 대한 주소 값을 전달함


        pt.testVariableArgsParam(10,20,30);
        pt.testVariableArgsParam("길동","축구","농구", "게임");
    }
}
