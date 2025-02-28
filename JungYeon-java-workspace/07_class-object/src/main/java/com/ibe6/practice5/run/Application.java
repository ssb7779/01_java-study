package com.ibe6.practice5.run;

import com.ibe6.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
        // 객체배열을 크기 3으로 할당 한 뒤
        Employee[] emp = new Employee[3];
        // 0번 인덱스에는 기본생성자를 통해서 객체 생성
        // 1번 인덱스에는 매개변수 6개짜리 생성자를 이용하여 객체 생성
        // 2번 인덱스에는 매개변수 10개짜리 생성자를 이용하여 객체 생성 후 출력
        emp[0] = new Employee();
        emp[1] = new Employee(1, "홍길동", 19, 'M', "01022223333", "서울잠실");
        emp[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000,
                              0.01, "01011112222", "서울 마곡");
        System.out.println(emp[0].getInformation());
        System.out.println(emp[1].getInformation());
        System.out.println(emp[2].getInformation());

        System.out.println("=====================================");
        // 3개의 객체 중 값이 없는 필드에 각각 값을 넣은 뒤 다시 출력
        emp[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000,
                              0.2, "01055559999", "전라도 광주");
        emp[1] = new Employee(1, "홍길동", "기획부", "부장", 19, 'M', 4000000,
                              0.3, "01022223333", "서울잠실");

        System.out.println(emp[0].getInformation());
        System.out.println(emp[1].getInformation());

        System.out.println("=====================================");
        // 직원 각각의 보너스가 적용된 1년 연봉을 계산하여 출력
        // 보너스가 적용된 연봉 = (급여 + (급여 * 보너스포인트)) * 12
        double annual1 = (emp[0].getSalary() + (emp[0].getSalary()*emp[0].getBonusPoint())) * 12;
        System.out.println("김말똥의 연봉: " + (int) annual1 + "원");
        double annual2 = (emp[1].getSalary() + (emp[1].getSalary()*emp[1].getBonusPoint())) * 12;
        System.out.println("홍길동 연봉: " + (int) annual2 + "원");
        double annual3 = (emp[2].getSalary() + (emp[2].getSalary()*emp[2].getBonusPoint())) * 12;
        System.out.println("강말순 연봉: " + (int) annual3 + "원");

        System.out.println("=====================================");
        // 3명 직원의 연봉 평균을 구하여 출력
        double anuualSum = (((int) annual1+annual2+annual3) / 3);
        System.out.println("직원들의 연봉의 평균: " + (int)anuualSum + "원");


    }
}
