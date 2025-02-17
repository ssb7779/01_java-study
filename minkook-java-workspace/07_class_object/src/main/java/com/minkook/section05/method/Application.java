package com.minkook.section05.method;

import com.minkook.section04.dto.CosmeticDTO;

import java.util.Arrays;

public class Application {
    public static void main(String[] args){

        ParameterTest pt = new ParameterTest();
        CosmeticDTO cosmeticDTO = new CosmeticDTO();
//
//        pt.testPrimitiveTypeParam(1);
//        pt.testPrimitiveTypeParam(10);
//
//        System.out.println("=======================");
//
//        int [] iArr = {1,2,3,4,5};
//        System.out.println("전달할 배열(원본) " + iArr);
//        System.out.println("전달할 배열(원본)요소 " + Arrays.toString(iArr));
//
//
//        pt.testArrayTypeParam(iArr);
//        System.out.println("전달할 배열(원본)요소 " + Arrays.toString(iArr));

        pt.testClassTypeParam(cosmeticDTO);
        cosmeticDTO.setName("비요뜨");
        cosmeticDTO.setPrice(20000);
        System.out.println("메소드 종류 후 인스턴스 정보: " + cosmeticDTO.pritCosmeticDTO());

    }
}
