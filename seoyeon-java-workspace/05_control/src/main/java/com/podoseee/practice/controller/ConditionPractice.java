package com.podoseee.practice.controller;

import java.util.Scanner;

public class ConditionPractice {
    public void practice1() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. 입력\n2. 수정\n3. 조회 \n4. 삭제 \n5. 종료");
        System.out.println("메뉴 번호를 입력하세요 : ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.print("입력");
                break;
            case 2:
                System.out.print("수정");
                break;
            case 3:
                System.out.print("조회");
                break;
            case 4:
                System.out.print("삭제");
                break;
            case 5:
                System.out.print("종료");
                break;
            default:
                System.out.print("잘못 입력하셨습니다.");
                return;
        }
        System.out.println(" 메뉴입니다.");
    }

    public void practice2() {
        Scanner sc = new Scanner(System.in);
        System.out.println("숫자를 한 개 입력하세요 : ");
        int num = sc.nextInt();

        if (num > 0) {
            if (num % 2 == 0) {
                System.out.println("짝수다");
            } else System.out.println("홀수다");
        } else {
            System.out.println("양수만 입력해주세요.");
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("국어점수 : ");
        int scoreKor = sc.nextInt();
        System.out.print("수학점수 : ");
        int scoreMath = sc.nextInt();
        System.out.print("영어점수 : ");
        int scoreEng = sc.nextInt();

        int average = (scoreKor + scoreMath + scoreEng) / 3;

        if (scoreKor >= 40 && scoreMath >= 40 && scoreMath >= 40) {
            if (average >= 60) {
                System.out.println("축하합니다, 합격입니다!");
            } else System.out.println("불합격입니다.");
        } else System.out.println("불합격입니다.");
    }

    public void practice4() {
        Scanner sc = new Scanner(System.in);
        System.out.println("1~12 사이의 정수 입력 : ");
        int month = sc.nextInt();
        String season = sc.nextLine();
        /*
        if (month == 1 || month == 2 || month == 12) {
            season = "겨울";
        } else if (month >= 3 && month <= 5) {
            season = "봄";
        } else if (month >= 6 && month <= 8) {
            season = "여름";
        } else if (month >= 9 && month <= 11) {
            season = "가을";
        } else {
            season = "잘못 입력된 달";
        }
        */

        System.out.print(month + "월은 ");

        switch(month){
            case 1: case 2: case 12:
                System.out.print("겨울입니다.");
                break;
            case 3: case 4: case 5:
                System.out.print("봄입니다.");
                break;
            case 6: case 7: case 8:
                System.out.print("여름입니다.");
                break;
            case 9: case 10: case 11:
                System.out.print("가을입니다.");
                break;
            default :
                System.out.print("잘못 입력된 달입니다.");
        }

    }

    public void practice5(){
        String id = "seoyeon";
        String pw = "0417";

        Scanner sc = new Scanner(System.in);
        System.out.print("아이디 : ");
        String inputId = sc.nextLine();
        System.out.print("비밀번호 : ");
        String inputPw = sc.nextLine();

        if(id.equals(inputId) && pw.equals(inputPw)){
            System.out.println("로그인 성공");
        }else if(id.equals(inputId)){
            System.out.println("비밀번호가 틀렸습니다.");
        }else if(pw.equals(inputPw)) {
            System.out.println("아이디가 틀렸습니다.");
        }else{
            System.out.println("둘 다 틀렸습니다.");
        }

    }

    public void practice6(){
        Scanner sc = new Scanner(System.in);

        System.out.print("권한을 확인하고자 하는 회원 등급 : ");
        switch(sc.nextLine()){
            case "관리자" : System.out.println("회원관리, 게시글 관리\n게시글 작성, 댓글 작성\n게시글 조회");
            case "회원" : System.out.println("게시글 작성, 게시글 조회, 댓글 작성");
            case "비회원" : System.out.println("게시글 조회"); break; // 여기서 break 해야 안 넘어감
            default : System.out.println("잘못 입력했습니다.");
        }
    }

    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("키(m)를 입력해주세요: ");
        double height = sc.nextDouble();
        System.out.print("몸무게(kg)를 입력해주세요: ");
        double weight = sc.nextDouble();

        double BMI = weight / (height*height);

        System.out.println("BMI 지수 : " + BMI);
        if(BMI<18.5){
            System.out.println("저체중");
        }else if(BMI<23){
            System.out.println("정상체중");
        }else if(BMI <25){
            System.out.println("과체중");
        }else if(BMI<30){
            System.out.println("비만");
        }else {
            System.out.println("고도비만");
        }
    }
    public void practice8(){
        Scanner sc = new Scanner(System.in);

        System.out.print("피연산자1 입력 : ");
        int num1 = sc.nextInt();
        System.out.print("피연산자2 입력 : ");
        int num2 = sc.nextInt();
        sc.nextLine(); // 버퍼 비우기

        System.out.print("연산자를 입력(+,-,*,/,%) : ");
        char op = sc.nextLine().charAt(0);

        int result = 0;

        if(num1>0 && num2>0){
            switch(op){
                case '+' : result = num1+num2; break;
                case '-' : result = num1-num2; break;
                case '*' : result = num1*num2; break;
                case '/' : result = num1/num2; break;
                case '%' : result = num1%num2; break;
                default :
                    System.out.println("연산자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
                    return;
            }
            System.out.printf("%d %c %d = %d", num1, op, num2, result);
        }else{
            System.out.println("숫자를 잘못 입력하셨습니다. 프로그램을 종료합니다.");
        }
    }

    public void practice9(){
        Scanner sc = new Scanner(System.in);
        System.out.print("중간고사 점수 : ");
        double midtermexam = sc.nextDouble();
        System.out.print("기말고사 점수 : ");
        double finalexam = sc.nextDouble();
        System.out.print("과제 점수 : ");
        double homework = sc.nextDouble();
        System.out.print("출석 횟수 : ");
        double attend = sc.nextDouble();

        double result = midtermexam*0.2 + finalexam*0.3 + homework*0.3 + attend*20;
        if(result>=70 && attend>=20*0.7){
            System.out.println("Pass");
        }else{
            System.out.println("Fail");
        }

        /*
        // 선생님 풀이

        Scanner sc = new Scanner(System.in);

        System.out.print("중간고사 점수 : ");
        double mid = sc.nextInt() * 0.2;

        System.out.print("기말고사 점수 : ");
        double fin = sc.nextInt() * 0.3;

        System.out.print("과제 점수 : ");
        double homework = sc.nextInt() * 0.3;

        System.out.print("출석 횟수 : ");
        double attendance = sc.nextInt(); // 따로 0.2를 곱할 필요없음! => 왜냐면 출석횟수는 20점 만점이기때문에 1회당 1점으로 취급됨

        double total = mid + fin + homework + attendance;


        if(total >= 70 && attendance >= 20 * 0.7) {
            System.out.println("\n====== 결과 =====");
            System.out.printf("중간고사 점수(20) : %.1f\n", mid);
            System.out.printf("기말고사 점수(30) : %.1f\n", fin);
            System.out.printf("과제 점수(30) : %.1f\n", homework);
            System.out.printf("출석 점수(20) : %.1f\n", attendance);
            System.out.printf("총점 : %.1f\n\n", total);
            System.out.println("Pass");
        }else {


			//if(total >= 70) {
			//	System.out.printf("Fail [출석 횟수 부족] (%d/20)", (int)attendance);
			//}else if(attendance >= 20 * 0.7) {
			//	System.out.printf("Fail [점수 미달] (총점 %.1f)", total);
			//}else {
			//	System.out.printf("Fail [점수 미달] (총점 %.1f)\n", total);
			//	System.out.printf("Fail [출석 횟수 부족] (%d/20)", (int)attendance);
			//}


        // 위의 내용의 중복된 출력문을 최소화로 작성하는 방법 (단일 if문을 적절히 활용하면됨!)
        if(total < 70) {
            System.out.printf("Fail [점수 미달] (총점 %.1f)\n", total);
        }

        if(attendance < 20 * 0.7) {
            System.out.printf("Fail [출석 횟수 부족] (%d/20)", (int)attendance);
        }

    }
         */
    }

    public void menuView(){
        Scanner sc = new Scanner(System.in);

        System.out.println("실행할 기능을 선택하세요 : ");
        System.out.println("1. 메뉴 출력");
        System.out.println("2. 짝수/홀수");
        System.out.println("3. 합격/불합격");
        System.out.println("4. 계절");
        System.out.println("5. 로그인");
        System.out.println("6. 권한 확인");
        System.out.println("7. BMI");
        System.out.println("8. 계산기");
        System.out.println("9. 점수 결과 출력");

        System.out.print("선택 : ");
        int menu = sc.nextInt();

        switch(menu){
            case 1: practice1(); break;
            case 2: practice2(); break;
            case 3: practice3(); break;
            case 4: practice4(); break;
            case 5: practice5(); break;
            case 6: practice6(); break;
            case 7: practice7(); break;
            case 8: practice8(); break;
            case 9: practice9(); break;
        }
    }
}
