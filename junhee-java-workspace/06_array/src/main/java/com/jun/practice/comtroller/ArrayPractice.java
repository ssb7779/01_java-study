package com.jun.practice.comtroller;

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayPractice {

    public void practice1(){

        int[]arr = new int[10];

        int num=1;
        for(int i=1; i<11; i++){
            System.out.print(i + " ");
        }


    }

    public void practice2(){

        int [] arr = new int[10];



        for(int i=0; i<arr.length; i++){
            arr[i] = arr.length-i;

        }
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }


    }

    public  void practice3(){

        Scanner sc = new Scanner(System.in);

        System.out.print("양의 정수: ");
        int num = sc.nextInt();

        int[]arr = new int[num];



        for(int i=0; i < num; i++){
            arr[i]=i+1;

        }
        for(int i=0; i < num; i++){
            System.out.print(arr[i] +  " ");
        }

    }

    public void practice4(){
        String[] fruit = new String[5];

        fruit[0] ="사과";
        fruit[1] ="귤";
        fruit[2] ="포도";
        fruit[3] ="복숭아";
        fruit[4] ="참외";

        String[] str = {"사과","귤","포도","복숭아","참외"};

        System.out.print(fruit[1]);


    }

    public void practice5(){

        Scanner sc = new Scanner(System.in);

        /*

         */


        System.out.print("문자열: ");
        String str = sc.nextLine();



        System.out.print("문자:" );
        char ch = sc.nextLine().charAt(0);

        char[]arr = new char[str.length()];

        for(int i =0; i < arr.length; i++){
            arr[i] = str.charAt(i);
        }
        int count=0;

        for(int i=0; i < arr.length; i++){
            if(arr[i] == ch){
                count++;
            }
        }
        System.out.println(ch + " 개수: " + count);






    }

    public void practice6(){

        String[]arr = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};

        Scanner sc = new Scanner(System.in);

        System.out.println("0 ~ 6 사이의 숫자 입력: ");
        int num = sc .nextInt();

        if(num >=0 && num <=6){
            System.out.println(arr[num] + " ");
        }else{
            System.out.println("잘못 입력하셨습니다.");
        }
    }
    public void practice7(){
        Scanner sc = new Scanner(System.in);

        System.out.print("정수: ");
        int num = sc.nextInt();
        int[]arr=new int[num];

        for(int i=0; i < arr.length; i++){
            System.out.print("배열" + i + "번째 인덱스에 넣을 값: ");
            arr[i]=sc.nextInt();
        }
        int sum=0;
        for(int i=0; i < arr.length; i++){ // 첫번째는 위치, 두번쨰는 갯수. 세번째는 변수
            sum+=arr[i];
        }
        System.out.println("총 합: " + sum);

    }

    public void practice8(){
     Scanner sc = new Scanner(System.in);

     while(true){
         System.out.print("정수: ");
         int num = sc.nextInt();

         if(num >=3 && num % 2 == 1){
             int[] arr = new int[num];

             int va = 1;
             for (int i=0; i < arr.length; i++){
                 arr[i]=va;
                 if(i<arr.length/2){
                     va++;
                 }else {
                     va--;
                 }
             }
             for (int i=0; i < arr.length; i++) {
                 if (i < arr.length - 1) {
                     System.out.print(arr[i] + ", ");
                 } else {
                     System.out.println(arr[i]);
                 }
             }
             break;
         }else {
             System.out.println("잘못 입력하셨습니다.");
         }
     }
    }
    public void practice9(){
        String[]arr = {"양념", "후라이드", "간장", "매운양념"};

        Scanner sc = new Scanner(System.in);

        System.out.print("치킨 이름을 입력하세요: ");
        String str = sc .nextLine();

        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            if(str.equals(arr[i])){
                flag = true;
                break;
            }
        }
        if(flag){
            System.out.println(str + "치킨 배달 가능");
        }else {
            System.out.println(str + "치킨은 없는 매뉴입니다.");
        }





    }
    public void practice10(){

        int[]arr = new int[10];

        for(int i=0; i < arr.length; i++){
            arr[i] = (int)(Math.random() *10+1);
        }
        for(int i=0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }




    }

    public void practice11(){
        Scanner sc = new Scanner(System.in);

        System.out.print("주민등록번호(-포함): ");
        String str =sc. nextLine();

        char[] ch = new char[str.length()];
        for(int i=0; i < ch.length; i++){
            if(i<=7){
                ch[i]= str.charAt(i);
            }else {
                ch[i]= '*';
            }

        }
        for(int i=0; i < ch.length; i++){
            System.out.print(ch[i]);
        }



    }
    // 추가문제 ------------------------------------------------------------------------------
    public void practice12(){

        int[] arr = new int[10];

        for(int i=0; i<arr.length; i++) {

            arr[i] = (int)(Math.random() * 10 + 1); // i번째 인덱스에 우선 랜덤값 발생시켜 담고

            // 기존의 숫자들 중 중복된 값이 있는지 비교하기 위한 for문
            for(int j=0; j<i; j++) { // 0번인덱스부터 현재 인덱스 이전까지 탐색
                if(arr[i] == arr[j]) { // 중복 값이 있을 경우
                    i--; // i 인덱스를 1 감소시켜, 후에 다시 1증가되었을 때 현재인덱스번호가 다시 부여될 수 있도록
                    break; // 더이상 비교할 필요 없으니 break
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public void practice13() {

        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 크기를 입력하세요 : ");
        int initSize = sc.nextInt();
        sc.nextLine();

        String[] arr = new String[initSize];
        for(int i=0; i<arr.length; i++) {
            System.out.print(i+1 + "번째 문자열 : ");
            arr[i] = sc.nextLine();
        }
        // 위의 구문들은 초기 배열을 세팅하는 구문

        while(true) { // 반복적으로 더 입력할건지 물어 입력받는 반복문

            System.out.print("\n더 값을 입력하시겠습니까?(Y/N) : ");
            char ch = sc.nextLine().charAt(0);

            if(ch == 'n' || ch == 'N') {
                System.out.println(Arrays.toString(arr)); // 배열안의 모든값들을 출력시키는 구문
                break;
            }else if(ch == 'y' || ch == 'Y') {

                System.out.print("더 입력하고 싶은 갯수 : ");
                int addSize = sc.nextInt();
                sc.nextLine();

				/* 1. for문 활용 --------------------------------------
				String[] newArr = new String[arr.length + addSize];
				for(int i=0; i<newArr.length; i++) {
					if(i < arr.length) {
						newArr[i] = arr[i];
					}else {
						System.out.print(i+1 + "번째 문자열 : ");
						newArr[i] = sc.nextLine();
					}
				}
				arr = newArr;
				--------------------------------------------------- */

				/* 2. System.arraycopy() 활용 -------------------------
				String[] newArr = new String[arr.length + addSize];
				System.arraycopy(arr, 0, newArr, 0, arr.length);
				for(int i=arr.length; i<newArr.length; i++) {
					System.out.print(i+1 + "번째 문자열 : ");
					newArr[i] = sc.nextLine();
				}
				arr = newArr;
				-----------------------------------------------------*/

                // 3. Arrays.copyOf() 활용 -----------------------------
                arr = Arrays.copyOf(arr, arr.length + addSize);
                for(int i=arr.length-addSize; i<arr.length; i++) {
                    System.out.print(i+1 + "번째 문자열 : ");
                    arr[i] = sc.nextLine();
                }
                //-----------------------------------------------------

            }else {
                System.out.println("잘못입력하셨습니다. 다시 입력해주세요.");
            }

        }
    }

    public void practice14() {
        /*
         *
         * 사용자에게 입력받은 월에 따라 그에 맞는 계절을 출력하시오.
         * [참고] 겨울(12~2월), 봄(3~5월), 여름(6~8월), 가을(9~11월)
         *
         * 하단의 코드를 작성한 후 뒤에 "출력문 한줄"만으로 해당 계절이 출력될 수 있도록 해보시오.
         *
         * Scanner sc = new Scanner(System.in);
         * System.out.print("월 : ");
         * int month = sc.nextInt();
         *
         * String[] seasons = {"겨울", "봄", "여름", "가을"};
         *
         */

        Scanner sc = new Scanner(System.in);
        System.out.print("월 : ");
        int month = sc.nextInt();

        String[] seasons = {"겨울", "봄", "여름", "가을"};

        System.out.println(seasons[month % 12 / 3]);

        /*
         * month     month % 12   month % 12 / 3
         * 12 ~ 2       0 ~ 2          0
         * 3 ~ 5        3 ~ 5          1
         * 6 ~ 8        6 ~ 8          2
         * 9 ~ 11       9 ~ 11         3
         */

    }

    public void practice15() {
        /*
         * 하단의 코드를 작성해두고
         * a 배열의 마지막 3자리의 값을
         * b 배열의 값으로 수정한 후
         * a 배열의 전체 데이터를 출력하는 코드를 작성하시오.
         *
         * for문을 활용하는 방법으로도 풀어보고
         * System클래스의 arraycopy메소드를 활용하는 방법으로도 풀어보세요.
         *
         * int[] a = {10, 20, 30, 0, 0, 0};
         * int[] b = {40, 50, 60};
         */
        int[] a = {10, 20, 30, 0, 0, 0};
        int[] b = {40, 50, 60};

        /*
         * a[3] = b[0];
         * a[4] = b[1];
         * a[5] = b[2];
         *
         * 방법1.
         * i가 3~5까지 증가되는 반복문일 경우
         * 		a 배열의 i번째 인덱스 자리에 b배열의 i-3번째 인덱스값 대입
         *
         * 방법2.
         * i가 0~2까지 증가되는 반복문일 경우
         *      a 배열의 i+3번째 인덱스 자리에 b배열의 i번째 인덱스값 대입
         */

        // for문 활용 방법
		/*
		for(int i=0; i<b.length; i++) {
			a[i+3] = b[i];
		}
		*/

        // System.arraycopy메소드 활용 방법
        // b배열의 0번인덱스에서부터 b배열의길이 갯수만큼의 데이터를
        // a배열의 3번인덱스자리에서부터 채워지도록
        System.arraycopy(b, 0, a, 3, b.length);


        // 결과 출력 => Arrays.toString으로 대체
        System.out.println(Arrays.toString(a));


    }

    // 문제는 아니고 그냥 코드한번 보세요! (난이도 상상상)
    public void calcBinary() {

        // 10진수를 2진수로 변환하는 코드

        // 10진수 데이터로 35를 세팅했다고 가정
        int number = 35;

        // 2진수값들을 보관할 배열 (넉넉히 크기 10짜리로 생성)
        int[] binary = new int[10];

        // 2 | 35
        //   └----
        // 2 | 17  ... 1 → binary[0]
        //   └----
        // 2 |  8  ... 1 → binary[1]
        //   └----
        // 2 |  4  ... 0 → binary[2]
        //   └----
        // 2 |  2  ... 0 → binary[3]
        //   └----
        // 2 |  1  ... 0 → binary[4]
        //   └----
        //      0  ... 1 → binary[5]

        /*
         * number값을 반복적으로 2로 나누기 연산하여
         * 그때마다의 나머지값을 배열의 각 인덱스에 차곡차곡 대입
         */
        int i = 0;
        while(number > 0) {
            binary[i++] = number % 2;
            number /= 2;  // number = number / 2;
        }
        //   ┌---------------------------------------┐
        //   | 1 | 1 | 0 | 0 | 0 | 1 | 0 | 0 | 0 | 0 |
        //   └---------------------------------------┘


        // 35라는 10진수의 2진수 결과는 100011 인데 이때 역순으로 배열에 담겨있을 것
        // 따라서 역순으로 출력해야됨!
        for(int j=i-1; j>=0; j--) {
            System.out.print(binary[j]);
        }


    }
}



