package com.jun.practice6.run;

import com.jun.practice6.dto.Student;

import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student[] sdArr = new Student[10];

        sdArr[0] = new Student(1, 5, "홍길동", 40, 60, 70);
        sdArr[1] = new Student(2, 1, "김말똥", 70, 80, 100);
        sdArr[2] = new Student(3, 3, "강개순", 100, 75, 86);


        System.out.println();

    }
}
