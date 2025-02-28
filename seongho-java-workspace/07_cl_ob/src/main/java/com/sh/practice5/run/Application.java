package com.sh.practice5.run;

import com.sh.practice5.dto.Employee;

public class Application {
    public static void main(String[] args) {
            Employee[] emp = new Employee[3];
            emp[0] = new Employee();
            emp[1]= new Employee(1,"홍길동","","",19,'M',0,0,"01011112222","서울 마곡");
            emp[2]= new Employee(2,"강말순","교육부","강사",20,'F',1000000,0.01,"01022223333","서울잠실");

        System.out.println(emp[0]);
        System.out.println(emp[1]);
        System.out.println(emp[2]);
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        emp[0]= new Employee(0,"김말똥","영업부","팀장",30,'M',3000000,0.2,"01055554444","전라도 광주");
        emp[1].setDept("기획부"); emp[1].setJob("부장"); emp[1].setSalary(4000000); emp[1].setBonusPoint(0.3);
        System.out.println(emp[0]);
        System.out.println(emp[1]);

        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        System.out.println("김말똥의 연봉:" +(int)((emp[0].getSalary()+emp[0].getSalary() * emp[0].getBonusPoint())*12)+"원");
        System.out.println("홍길동의 연봉:" +(int)((emp[1].getSalary()+emp[1].getSalary() * emp[1].getBonusPoint())*12)+"원");
        System.out.println("강말순의 연봉:" +(int)((emp[2].getSalary()+emp[2].getSalary() * emp[2].getBonusPoint())*12)+"원");
        System.out.println("++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
//        int sum1 = (int)((emp[0].getSalary()+emp[0].getSalary() * emp[0].getBonusPoint())*12);
//        int sum2 = (int)((emp[1].getSalary()+emp[1].getSalary() * emp[1].getBonusPoint())*12);
//        int sum3 = (int)((emp[2].getSalary()+emp[2].getSalary() * emp[2].getBonusPoint())*12);
        int sum = 0;
        for(int i = 0; i< emp.length; i++){
            sum += (int)(emp[i].getSalary()+emp[i].getSalary() * emp[i].getBonusPoint())*12;
        }
        System.out.println("직원들 평균 연봉 : " +sum/3);
    }
}
