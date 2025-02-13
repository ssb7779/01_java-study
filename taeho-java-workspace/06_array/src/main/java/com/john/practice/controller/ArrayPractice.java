package com.john.practice.controller;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayPractice {
    public void practice1() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        for (int i : intArray) {
            System.out.print((i == intArray.length) ? i : (i + " "));
        }
    }

    public void practice2() {
        int[] intArray = new int[10];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }

        for (int i = intArray.length; i >= 1; i--) {
            System.out.print((i == 1) ? i : (i + " "));
        }
    }

    public void practice3() {
        Scanner sc = new Scanner(System.in);
        System.out.print("1 부터 출력하고 싶은 숫자: ");
        int n = sc.nextInt();

        if (n < 1) {
            System.out.println("숫자가 1보다 작습니다. 프로그램을 종료합니다");
            return;
        }

        for (int i = 1; i <= n; i++) {
            System.out.print((i == n ? i : i + " "));
        }
    }

    public void practice4() {
        // 배열 선언
        String[] strArr = new String[5];
        // 배열 초기화
        strArr[0] = "사과";
        strArr[1] = "귤";
        strArr[2] = "포도";
        strArr[3] = "복숭아";
        strArr[4] = "참외";

        System.out.println(strArr[1]);
    }

    public void practice5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열에 넣고 싶은 문자열: ");
        String s = sc.nextLine();
        System.out.print("검색할 문자: ");
        char c = sc.nextLine().charAt(0);
        int count = 0;

        char[] strArr = new char[s.length()];
        for (int i = 0; i < strArr.length; i++) {
            strArr[i] = s.charAt(i);
            if (strArr[i] == c) {
                count++;
            }
        }
        System.out.printf("%s의 개수: %d", c, count);
    }

    public void practice6() {
        Scanner sc = new Scanner(System.in);
        String[] strArr = new String[]{"월", "화", "수", "목", "금", "토", "일"};
        System.out.print("0 ~ 6 사이 숫자를 입력하세요: ");

        int n = sc.nextInt();
        if (n < 0 || n > 6) {
            System.out.println("잘못입력하셨습니다.");
        } else {
            System.out.printf("%s요일", strArr[n]);
        }
    }

    public void practice7() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 길이를 입력하세요: ");
        int n = sc.nextInt();
        int sum = 0;
        int[] intArr = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.printf("배열 %s인덱스에 넣을 값: ", i);
            int inputNum = sc.nextInt();
            intArr[i] = inputNum;
            sum += inputNum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(intArr[i] + " ");
        }
        System.out.printf("\n총합: %d", sum);
    }

    public void practice8() {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("홀수인 정수를 입력하세요: ");
            int n = sc.nextInt();
            if ((n % 2 == 0) || (n < 1)) {
                System.out.println("다시 입력하세요");
                sc.nextLine();
            } else {
                int[] intArr = new int[n];
                int arrLength = intArr.length;
                for (int i = 0; i < n; i++) {
                    if (i <= (arrLength / 2)) {
                        intArr[i] = i + 1;
                    } else {
                        intArr[i] = arrLength - i;
                    }
                }
                for (int i = 0; i < n; i++) {
                    System.out.print(intArr[i] + " ");
                }
                break;
            }
        }
    }

    public void practice9() {
        Scanner sc = new Scanner(System.in);
        String[] chickenArr = new String[]{"맵슐랭", "크크크", "골드킹", "후라이드"};
        System.out.print("치킨 이름을 입력하세요: ");
        String s = sc.nextLine();
        boolean isMenu = false;
        for (String string : chickenArr) {
            if (s.equals(string)) {
                isMenu = true;
                break;
            }
        }
        if (isMenu) {
            System.out.printf("%s치킨 배달 가능", s);
        } else {
            System.out.printf("%s치킨은 없는 메뉴입니다", s);
        }
    }

    public void practice10() {
        int[] intArr = new int[10];
        for (int i = 0; i < intArr.length; i++) {
            intArr[i] = (int) (Math.random() * 10 + 1);
        }
        for (int j : intArr) {
            System.out.print(j + " ");
        }
    }

    public void practice11() {
        Scanner sc = new Scanner(System.in);
        System.out.print("주민등록번호를 입력하세요: ");
        String s = sc.nextLine();
        char[] charArr = new char[s.length()];
        for (int i = 0; i < charArr.length; i++) {
            if (i <= 7) {
                charArr[i] = s.charAt(i);
            } else {
                charArr[i] = '*';
            }
        }
        for (char c : charArr) {
            System.out.print(c);
        }
    }

    public void slackQuiz() {
        char[] upperAlpha = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};
        char[] lowerAlpha = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요: ");
        String s = sc.nextLine();
        System.out.print("몇번째이후의 문자열을 만들건가요: ");
        int n = sc.nextInt();
        n %= 26;

        char[] chArr = new char[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            int idx = 0;
            if (c >= 'a' && c <= 'z') {
                for (int j = 0; j < 26; j++) {
                    if (lowerAlpha[j] == c) {
                        idx = (j + n) % 26;
                        chArr[i] = lowerAlpha[idx];
                    }
                }
            } else if (c >= 'A' && c <= 'Z') {
                for (int j = 0; j < 26; j++) {
                    if (upperAlpha[j] == c) {
                        idx = (j + n) % 26;
                        chArr[i] = upperAlpha[idx];
                    }
                }
            } else {
                System.out.println("알파벳이 아닌 값을 입력했습니다. 프로그램을 종료합니다");
                return;
            }
        }
        /*
        String result = "";
        for(int i = 0; i< chArr.length; i++) {
            result += chArr[i];
        }
         */
        String result = String.valueOf(chArr);

        System.out.println(result);
        System.out.printf("기존 문자열: %s\n", s);
        System.out.print("변경된 문자열: ");
        System.out.print(chArr);
    }

    public void practice12() {
        int[] intArr = new int[10];
        int duplicateIndex = 0;
        // 값이 들어갈 때마다 배열 순회필요(중복 조회)
        // 중복인 경우 인덱스초과
        while (duplicateIndex < 10) {
            // 배열에 추가할 랜덤값
            int randomInt = (int) (Math.random() * 10 + 1);
            // 중복 검사
            boolean isDuplicate = false;
            for (int i : intArr) {
                if (i == randomInt) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                intArr[duplicateIndex] = randomInt;
                duplicateIndex++;
            }
        }
        System.out.println(Arrays.toString(intArr));
    }

    public void practice13() {
        Scanner sc = new Scanner(System.in);
        System.out.print("배열의 크기를 입력하세요: ");
        int n = sc.nextInt();
        sc.nextLine();
        String[] strArr = new String[n];
        int pointer = 0;

        while (true) {
            System.out.print("문자열 입력: ");
            String s = sc.nextLine();
            strArr[pointer] = s;
            System.out.println(Arrays.toString(strArr));
            pointer++;

            if (pointer == n) {
                System.out.print("더 값을 입력하시겠습니까?(Y/N): ");
                char ch = sc.nextLine().charAt(0);
                if (ch == 'Y' || ch == 'y') {
                    System.out.print("더 입력하고 싶은 개수: ");
                    int addNum = sc.nextInt();
                    sc.nextLine();
                    strArr = Arrays.copyOf(strArr, strArr.length + addNum);
                    // 첫 n값에 추가적으로 늘린 배열만큼 추가
                    n += addNum;
                } else {
                    break;
                }

            }
        }
        System.out.println(Arrays.toString(strArr));
    }

    public void practice14() {
        Scanner sc = new Scanner(System.in);
        System.out.print("월: ");
        int month = sc.nextInt();

        String[] seasons = {"겨울", "봄", "여름", "가을"};
        System.out.println(
                (month == 12) || (month == 1) || (month == 2) ? "겨울" :
                        (month == 3) || (month == 4) || (month == 5) ? "봄" :
                                (month == 6) || (month == 7) || (month == 8) ? "여름" :
                                        (month == 9) || (month == 10) || (month == 11) ? "가을" : "잘못된 입력값입니다");
    }

    public void practice15() {
        int[] a = {10, 20, 30, 0, 0, 0};
        int[] b = {40, 50, 60};
        /* for 사용
        int bIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if(a[i] == 0){
                a[i] = b[bIndex];
                bIndex++;
            }
        }
        System.out.println(Arrays.toString(a));
         */

        //System.arraycopy(originArray, copy start index, copyArray, copy start index, copy val count)
        System.arraycopy(b, 0, a, 3, b.length);
        System.out.println(Arrays.toString(a));
    }
}
