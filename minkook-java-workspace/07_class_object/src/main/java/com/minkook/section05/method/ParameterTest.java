package com.minkook.section05.method;

import com.minkook.section04.dto.CosmeticDTO;

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

    public void testArrayTypeParam(int [] num){
        System.out.println("매개변수로 전달된 값: " + num);
        System.out.println("매개변수로 전달된 요소: " + Arrays.toString(num));

        num[0] = 100;
    }

    public void testClassTypeParam(CosmeticDTO a){ //  얕은복사,주소값 전달
        CosmeticDTO cosmeticDTO = new CosmeticDTO("SK2",100000,"디올","립스틱",false);
        System.out.println("매개변수로 전달된 값: " + cosmeticDTO);
        System.out.println("매개변수로 전달된 인스턴스정보: " + cosmeticDTO.pritCosmeticDTO());
    }
}
