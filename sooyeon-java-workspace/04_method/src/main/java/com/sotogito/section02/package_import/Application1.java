package com.sotogito.section02.package_import;

import com.sotogito.section01.method.Calculator;

public class Application1 {
    /**
     * ## 패키지
     * - 클래스를 묶어 저장하는 폴더
     * - 일반적으로 클래스들의 기능과 역할에 따라서 패키지를 구분하여 저장
     * - 패키지가 다르면 동일한 이름의 클래스 만들기 가능
     * - 실제 클래스명은 패키지까지 포함
     */

    /**
     * 다른 패키지에 있는 클래스의 메서드 호출 방법
     * 클래스 작성 시 패키지까지 포함한 전체 이름을 작성 : 귀찮음
     *
     */
    public static void main(String[] args) {
        com.sotogito.section01.method.Calculator calculator = new Calculator();

    }
}
