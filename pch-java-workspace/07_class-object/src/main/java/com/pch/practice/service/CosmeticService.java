package com.pch.practice.service;

import com.pch.practice.dto.CosmeticDTO;

import java.util.Map;

public interface CosmeticService {

    /**
     * 기본 생성자와 setter를 이용한 객체 생성 메서드
     * @param
     * @return
     */
    CosmeticDTO createCosmeticWithSetter(Map<String, String> userInput);

    /**
     * 매개변수 생성자를 이용한 객체 생성 메서드
     * @param userInput
     * @return
     */
    CosmeticDTO createCosmeticWithConstructor(Map<String, String> userInput);
}
