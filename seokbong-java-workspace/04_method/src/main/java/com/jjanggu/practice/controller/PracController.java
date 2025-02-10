package com.jjanggu.practice.controller;
import java.util.Scanner;

public class PracController {

    public void practice1() {

        Scanner sc = new Scanner(System.in);


        System.out.println("이름을 입력하세요 : ");
        String name = sc.nextLine();
        System.out.println("나이를 입력하세요 : ");
        int age = sc.nextInt();

        sc.nextLine();

        System.out.println("성별을 입력하세요(남/여) : ");
        char gender = sc.nextLine().charAt(0);
        System.out.println("키를 입력하세요(cm) : ");
        double height = sc.nextDouble();

        System.out.printf("키 %.1f인 %d살 %s자 %s님 반갑습니다 ^^", height, age, gender,name);



    }

    public void practice2() {

        Scanner sc = new Scanner(System.in);


        System.out.println("문자열을 입력하세요 : ");
        String word = sc.nextLine();

        char word1 = word.charAt(0);
        char word2 = word.charAt(1);
        char word3 = word.charAt(2);




        System.out.println("첫 번째 문자 : " + word1);
        System.out.println("두 번째 문자 : " + word2);
        System.out.println("세 번째 문자 : " + word3);

    }

    public void practice3() {

        Scanner sc = new Scanner(System.in);

        System.out.println("이름 : ");
        String name = sc.nextLine();

        System.out.println("학년(숫자만) : ");
        int grade = sc.nextInt();

        System.out.println("반(숫자만) : ");
        int classNum = sc.nextInt();

        System.out.println("번호(숫자만) : ");
        int num = sc.nextInt();

        sc.nextLine();

        System.out.println("성별(M/F) : ");
        char cgender = sc.nextLine().charAt(0);


        String sgender = (cgender == 'm') || (cgender == 'M') ? ("남학생") : ("여학생");



        System.out.println("성적(소수점 아래 둘째 자리까지) : ");
        double average = sc.nextDouble();

        System.out.printf("%d학년 %d반 %d번 %s %s의 성적은 %.2f이다.", grade, classNum, num, name, sgender, average);




    }
    public void practice4() {

        Scanner sc = new Scanner(System.in);

        System.out.println("주민번호를 입력하세요(-포함) : ");
        char num = sc.nextLine().charAt(7);

        String gender = (num == '1' || num == '3') ? ("남자")
                      : (num == '2' || num == '4') ? ("여자") : ("?") ;
        // num이 char 형태로 저장됐으니 num과 비교되는 숫자는
        // 정수형이 아닌 문자형이므로 문자형으로 비교해야함

        // 질문 : 그럼 출력 값의 형태가 무엇인지는 확인을 못하나..?
        // 어쩔 수 없이 그때 그때 잘 확인하면서 비교하는게 best?인듯?

        System.out.println(num);
        System.out.println(gender);
    }


    public void practice5() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수1 : ");
        int num1 = sc.nextInt();

        System.out.println("정수2 : ");
        int num2 = sc.nextInt();

        System.out.println("비교값 : ");
        int num3 = sc.nextInt();

        boolean bool = (num3 <= num1) || (num3 > num2);

        System.out.println(bool);



    }

    public void practice6() {

        Scanner sc = new Scanner(System.in);

        System.out.println("정수1 : ");
        int num1 = sc.nextInt();

        System.out.println("정수2 : ");
        int num2 = sc.nextInt();

        System.out.println("정수3 : ");
        int num3 = sc.nextInt();

        boolean bool = (num1 == num2) && (num2 == num3);

        System.out.println(bool);

    }

    public void practice7() {

        Scanner sc = new Scanner(System.in);

        System.out.println("점수 : ");
        int score = sc.nextInt();

        String st = score >= 90 && score < 100 ? "축하합니다" : "분발하세요";
        System.out.println(st);
    }




}
