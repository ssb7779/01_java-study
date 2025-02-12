package com.sotogito.practice;

import java.util.Scanner;


public class Controller {
    Scanner sc = new Scanner(System.in);

    public void p1() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }


    public void p2() {
        int[] arr = new int[10];

        for (int i = arr.length - 1; i >= 0; i--) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }


    public void p3() {
        System.out.println("양의 정수 : ");
        int num = sc.nextInt();
        int[] nums = new int[num];

        for (int i = 0; i < num; i++) {
            nums[i] = i + 1;
        }

        for (int n : nums) {
            System.out.print(n + " ");
        }
    }


    public void p4() {
        String[] fruits = new String[5];

        fruits[0] = "사과";
        fruits[1] = "귤";
        fruits[2] = "포도";
        fruits[3] = "복숭아";
        fruits[4] = "참외";

        System.out.println(fruits[1]);
    }


    public void p5() {
        System.out.println("문자열 : ");
        String word = sc.nextLine();

        System.out.println("문자 : ");
        char chr = sc.nextLine().charAt(0);

        char[] chrToken = new char[word.length()];
        for (int i = 0; i < word.length(); i++) {
            chrToken[i] = word.charAt(i);
        }

        int count = 0;
        for (char c : chrToken) {
            if (c == chr) {
                count++;
            }
        }
        System.out.printf("%c개수 : %d", chr, count);
    }


    public void p6() {
        String[] week = new String[7];
        week[0] = "월";
        week[1] = "화";
        week[2] = "수";
        week[3] = "목";
        week[4] = "금";
        week[5] = "토";
        week[6] = "일";

        System.out.println("0 ~ 6 사이 숫자 입력 : ");
        int weekNum = sc.nextInt();

        if (weekNum < 0 || weekNum > 6) {
            System.out.println("잘못 입력하셨습니다.");
            return;
        }
        System.out.printf("%s요일", week[weekNum]);
    }


    public void p7() {
        /**
         * 배열 크기입력 및 생성
         * 각각 배열 요소 입력
         * 전체 합
         */
        System.out.println("정수 : ");
        int size = sc.nextInt();

        int[] nums = new int[size];

        int sum = 0;
        for (int i = 0; i < size; i++) {
            System.out.printf("배열 %d번째 인덱스에 넣을 값 : ", i);
            nums[i] = sc.nextInt();
            sum += nums[i];
        }

        for (int num : nums) {
            System.out.print(num + " ");
        }

        System.out.printf("\n총 합 : %d", sum);
    }


    public void p8() {
        while (true) {
            System.out.println("정수 : ");
            int size = sc.nextInt();

            if (size % 2 == 0 || size < 3) {
                System.out.println("다시 입력하세요.");
                continue;
            }

            int[] nums = new int[size];
            int middleIndex = size / 2 + 1; //3

            for (int i = 0; i < size; i++) {
                if (i == middleIndex) {
                    for (int j = i; j < size; j++) {
                        nums[j] = size - j;
                    }
                    break; //이거 안쓰면 아래 덮어씌워짐
                }
                nums[i] = i + 1;
            }

            for (int n : nums) {
                System.out.print(n + " ");
            }
            break;
        }
    }


    public void p9() {
        String[] chickensName = new String[3];
        chickensName[0] = "백숙";
        chickensName[1] = "능이백숙";
        chickensName[2] = "할머니백숙";

        System.out.println("치킨 이름을 입력하세요 : ");
        String inputChickenName = sc.nextLine();

        for (String name : chickensName) {
            if (name.equals(inputChickenName)) {
                System.out.printf("%s치킨 배달 가능", name);
                return;
            }
        }
        System.out.printf("%s치킨은 없는 메뉴입니다.", inputChickenName);
    }


    public void p10() {
        int[] arr = new int[10];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 10 + 1);
        }

        for (int num : arr) {
            System.out.print(num + " ");
        }
    }


    public void p11() {
        System.out.println("주만등록번호(-포함):");
        String registrationNumber = sc.nextLine();

        char[] registrationNumberToken = new char[registrationNumber.length()];

        for (int i = 0; i < registrationNumber.length(); i++) {
            registrationNumberToken[i] = registrationNumber.charAt(i);
        }

        String printout = "";
        for (int i = 0; i < registrationNumberToken.length; i++) {
            if (i >= 8) {
                printout += "*";
                continue;
            }
            printout += registrationNumberToken[i];
        }
        System.out.println(printout);
    }

}
