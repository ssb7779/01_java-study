package com.inyong.section01.method;

public class Application1 {
    // 메소드 호출방법
    // 객체생성 : [클래스명] [사용할 이름] = new [클래스명]()
    // 메소드 호출 : 사용할이름.호출할 메소드명
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        cal.add(1, 2);

        System.out.println(cal.minus(1, 2));
        cal.multiply(1, 2);
        cal.divide(1, 2);


    }


}

