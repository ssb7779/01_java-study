package com.john.section02.package_import;

// 기본적으로 동일한 패키지 내의 클래스만 탐색 => import필요

public class Application1 {
    public static void main(String[] args) {
        com.john.section01.method.Calculator calc = new com.john.section01.method.Calculator();

    }
}
