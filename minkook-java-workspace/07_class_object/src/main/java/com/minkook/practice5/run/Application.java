package com.minkook.practice5.run;

import com.minkook.practice5.dto.Employee;

public class Application {
    public static void main(String[]args){
        Employee [] arr = new Employee[3];
        arr[0] = new Employee();
        arr[1] = new Employee(1,"홍길동",null,null,19,'M',0,0.0,"01022223333","서울 잠실");
        arr[2] = new Employee(2, "강말순", "교육부", "강사", 20, 'F', 1000000, 0.01, "01011112222", "서울 마곡");

        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i].getInformation());
        }
        System.out.println("==================================================");
        arr[0] = new Employee(0, "김말똥", "영업부", "팀장", 30, 'M', 3000000, 0.2, "01055559999", "전라도 광주");
        arr[1] = new Employee(1,"홍길동","기획부","부장",19,'M',4000000,0.3,"01022223333","서울 잠실");

        for(int i = 0; i < arr.length-1; i++){
            System.out.println(arr[i].getInformation());
        }
        int sumSalary = 0;
        double bonusSalary = 0;
        int total = 0;
        System.out.println("==================================================");
        for(int i = 0; i < arr.length; i++){
            sumSalary = arr[i].getSalary() * 12;
            bonusSalary = (arr[i].getSalary() * arr[i].getBonusPoint()) * 12;
            System.out.println(arr[i].getEmpName() + " " + (int)(sumSalary + bonusSalary) + "원");
            total += (int)(sumSalary + bonusSalary);
        }
        System.out.println("==================================================");
        System.out.println("직원들의 연봉의 평균: " + (total/ arr.length)+"원");



    }
}
