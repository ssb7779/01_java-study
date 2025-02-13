package com.podoseee.section01.conditional.controller;

import java.util.Scanner;

public class If {

    /*
        ## 단일 if문 ##
        1. 특정 조건을 만족하는 경우에만 실행하는 코드 작성시 사용
        2. 특정 조건에 만족할 경우 실행할 코드는 중괄호 {}로 묶어 다른 코드와 구분함
           ( 단, 실행할 코드가 1줄일 경우 {} 생략 가능 )
        3. 작성 형식 ─────────────────────────┐
           │ if(조건식) {                     │
           │     조건식이 참일 경우 실행구문  │
           │	 조건식이 참일 경우 실행구문  │
           │ }                                │
           └──────────────────────────────────┘
     */

    public void testBasicIf(){

        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int score = sc.nextInt();

        if(score >= 60){
            System.out.println("통과");
        }
    }

    /*
        ## else문 ##
        1. if문의 마지막에 추가할 수 있는 선택구문
        2. if문이나 else if문의 모든 조건을 만족하지 않을 경우 실행할 코드 작성
        3. 작성 형식 ─────────────────────────────┐
           │ if(조건식1) { 					  	  │
           │	조건식1이 참일 경우 실행구문  	  │
           │ }else if(조건식2) {	  			  │
           │ 	조건식2가 참일 경우 실행구문  	  │
           │ }else {	  			 			  │
           │	모든 조건이 거짓일 경우 실행구문  │
           │ }								  	  │
           └──────────────────────────────────────┘
     */

    public void testBasicElse(){
        Scanner sc = new Scanner(System.in);
        System.out.print("점수 : ");
        int score = sc.nextInt();
        
        if (score >= 60){
            System.out.println("통과");
        }else {
            System.out.println("미통과");
        }

        /*
             ## else if문 ##
            1. if문 뒤에 추가적으로 작성하는 구문
            2. if문 이후에 새로운 조건을 지정할 때 else if문
            3. 여러개 작성 가능
            4. 작성 형식 ─────────────────────────┐
               │ if(조건식1) { 					  │
               │	조건식1이 참일 경우 실행구문  │
               │ }else if(조건식2) {	  		  │
               │ 	조건식2가 참일 경우 실행구문  │
               │ }else if(조건식3) {              │
               │	조건식3이 참일 경우 실행구문  │
               │ }                                │
               └──────────────────────────────────┘
         */
    }
    
    public void testBasicElseIf(){
        Scanner sc = new Scanner(System.in);

        System.out.print("점수 : ");
        int score = sc.nextInt();
        
        // 80점이상인 경우 => "합격"
        // 60점이상 80점 미만인 경우 => "재평가"
        // 60점미만인 경우 => "불합격"
        if (score >= 80) {
            System.out.println("합격");
        } else if (score >= 60 /*&& score <80*/) {
            System.out.println("재평가");
        } else {
            System.out.println("불합격");
        }
    }
    
    public void testIfExample1(){
        /*
            실습.
            사용자에게 나이를 입력받은 후
            해당 나이가 13세 이하일 경우 "어린이"
            13세 초과 19세 이하일 경우 "청소년"
            19세 초과일 경우 "성인" 출력
         */
        Scanner sc = new Scanner(System.in);
        System.out.print("나이 : ");
        int age = sc.nextInt();
        /*
        if(age <= 13){
            System.out.println("어린이");
        } else if(age <= 19){
            System.out.println("청소년");
        } else {
        System.out.println("성인");
        }
         */

        String result; // 결과를 기록할 변수 세팅

        if(age <= 13){
            result = "어린이";
        }else if(age <= 19){
            result = "청소년";
        }else{
            result = "성인";
        }

        System.out.print(result);

    }

    public void testIfExample2(){
        /*
            사용자에게 이름과 성별(M/F)을 입력받아
            "xxxx님은 x학생입니다." 출력
         */
        Scanner sc = new Scanner(System.in);

        System.out.print("이름 : ");
        String name = sc.nextLine();

        System.out.print("성별(M/F) : ");
        char gender = sc.nextLine().toUpperCase().charAt(0);
        // 문자열.toUpperCase() : 해당 문자열을 다 대문자로 변경해서 반환 <-> 문자열.toLowerCase()

        /*
        if(gender == 'M'){
            System.out.println(name + "님은 남학생입니다.");
        } else if(gender == 'F'){
            System.out.println(name + "님은 여학생입니다.");
        }
         */
        String result = ""; // 변수 미리 세팅시 반드시 초기화해놓는 습관을 들이자!!
        if(gender == 'M'){
            result = "남학생";
        } else if(gender == 'F'){
            result = "여학생";
        } else {
            System.out.println("성별을 잘못 입력하셨습니다.");
            return; // 메소드 강제 종료
        }
        System.out.println(name + "님은 " + result + "입니다.");
    }

    public void testIfExample3(){
        /*
            사용자에게 이름을 입력받아
            해당 이름이 "홍길동"과 일치할 경우 "반갑습니다."
            일치하지 않을 경우 "안녕히가세요." 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("이름 : ");
        String name = sc.nextLine();

        /*
        if(name == "홍길동"){
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요.");
        }
         */

        /*
            ## 동등비교 ##
            1. 기본자료형 (boolean, char, byte, short, int, long, float, double)
               - 일치   : ==
               - 불일치 : !=
            2. 참조자료형 (String, 기본자료형을 제외한 모든 타입)
               - 일치   :  비교대상1.equals(비교대상2)
               - 불일치 :  !비교대상1.equals(비교대상2)
         */

        if( name.equals("홍길동") ){
            System.out.println("반갑습니다.");
        } else {
            System.out.println("안녕히가세요.");
        }
    }

    
    // ====== 조건문 중첩 ======
    
    public void testNestedIf(){
        /*
            사용자에게 정수를 입력받아
            해당 정수값이 양수가 아닐 경우 "양수가 아닙니다."
            양수일 때 3의 배수일 경우 "3의 배수입니다."
                            아닐 경우 "3의 배수가 아닙니다." 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("정수(양수) 입력 : ");
        int num = sc.nextInt();

        if (num < 0){ // 양수가 아닐 경우
            System.out.println("양수가 아닙니다. 잘못 입력하셨습니다.");
        } else {      // 양수일 경우
            if (num % 3 ==0){ // 3의 배수일 경우
                System.out.println("3의 배수입니다.");
            }else{
                System.out.println("3의 배수가 아닙니다.");
            }
        }
    }

    public void testNestedIfExample1(){
        /*
            실습.
            사용자에게 학년과 점수를 입력받아 합격 여부를 판별하여 출력하고자 한다.
            사용자가 입력한 학년이
            1~3학년일 경우 : 60점 이상이면 "합격", 아니면 "불합격"
            4~6학년일 경우 : 70점 이상이면 "합격", 아니면 "불합격" 출력
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("학년 : ");
        int grade = sc.nextInt();
        System.out.print("점수 : ");
        int score = sc.nextInt();
        /*
        if(grade <= 3 && grade >= 1){
            if(score >= 60){
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        } else if(grade >= 4 && grade <= 6) {
            if(score >= 70){
                System.out.println("합격");
            } else {
                System.out.println("불합격");
            }
        }
         */

        int passScore = 0; // 학년별 합격기준점수를 기록할 변수
        if(grade >= 1 && grade <= 3){
                passScore = 60;
        } else if(grade >= 4 && grade <=6){
                passScore = 70;
        }
        
        if(score >= passScore){
            System.out.println("합격");
        }else{
            System.out.println("불합격");
        }
    }

    public void testNestedIfExample2(){
        /*
            실습.
            사용자에게 주민번호(-포함 14글자)를 입력받고
            잘 입력했을 경우 => 성별을 판별해서 "남자" 또는 "여자" 출력
            잘못 입력했을 경우 => "잘못입력하셨습니다."

            [참고]
            문자열.length() : 해당 문자열의 길이 반환
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("주민번호(-포함 14글자) : ");
        /*내가쓴 오류코드
        int num = sc.nextInt();
        char gender = sc.nextLine().charAt(7);

        if(num.length() == 14){
            if(gender == 1 || gender == 3){
                System.out.println("남자");
            } else if(gender == 2 || gender == 4){
                System.out.println("여자");
            }
        } else {
            System.out.println("잘못입력하셨습니다.");
        }
         */
        // 선생님코드
        String rrn = sc.nextLine();
        if(rrn.length() == 14){ // 14글자일 경우
            char genderNum = rrn.charAt(7);
            if(genderNum == '1'|| genderNum == '3'){
                System.out.println("남자");
            } else if(genderNum == '2' || genderNum == '4'){
                System.out.println("여자");
            } else{
                System.out.println("성별을 잘못 입력하셨습니다.");
            }

       } else{ // 그게 아닐 경우
            System.out.println("글자수를 잘못 입력하셨습니다.");
        }
    }
}





